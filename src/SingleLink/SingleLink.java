package SingleLink;

import org.omg.CORBA.portable.Delegate;

public class SingleLink {
    public SingleLinkNode HeadNode;
    public int length;

//    初始化链表
    public SingleLink(){
        HeadNode = null;
        length = 0;
    }
//
    public int getLength() {
        return length;
    }

    //    添加结点
    public void addLink(String nodeStr){
        System.out.println("添加结点--"+nodeStr);
        if (HeadNode == null){
            HeadNode = new SingleLinkNode(nodeStr);
            length = length + 1;
        }
        else {
            SingleLinkNode newNode = new SingleLinkNode(nodeStr);
            SingleLinkNode temp = HeadNode;
//            每次添加都要通过头结点往后查找是否到了最后一个空结点然后就设置next为当前新建的node
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            length ++;
        }
    }

//    删除结点
    public boolean delLinkNode(String deldata){
        SingleLinkNode p = HeadNode;
        SingleLinkNode temp = p;
//        如果链表长度超过1则执行while循环而不会去执行下面的if判断
        while (temp.getNext() != null){
            if (temp.getData().equals(deldata)){
//                如果是第一个结点则headnode后移一个
                if (temp == HeadNode){
                    temp = temp.getNext();
                    p = temp;
                    HeadNode = p;
                    System.out.println("结点删除成功...");
                    return true;
                }else {
                    temp = temp.getNext();
                    p.setNext(temp);
                    System.out.println("结点删除成功...");
                    return true;
                }
            }
            else {
                temp = temp.getNext();
            }
//            temp = temp.getNext();
        }


//        如果链表长度为1那么上面的while循环是不会执行的
        if (temp.getData().equals(deldata)){
            System.out.println("结点删除成功");
            if (this.getLength() > 1){
                p.setNext(temp.getNext());
            }
            else {
                HeadNode = null;
            }
            return true;
        }
        else {
            System.out.println("链表中没有当前结点删除失败...");
            return false;
        }




    }

//    查找结点
    public boolean findLinkNode(String nodedata){
        SingleLinkNode p = HeadNode;
        if (p == null){
            return false;
        }else {
            if (p.getData().equals(nodedata)){
                return true;
            }
            else {
                while (p.getNext() != null){
                    if (p.getData().equals(nodedata)){
                        return true;
                    }
                    p = p.getNext();
                }
                return false;
            }
        }
    }

//    输出链表数据
    public void printLink(){
        if (HeadNode == null){
            System.out.println("当前单向链表是空链表");
        }else {
            SingleLinkNode p = HeadNode;
            System.out.println("结点---"+p.getData());
            while (p.getNext() != null){
                System.out.println("结点---"+p.getData());
                p = p.getNext();
            }
            System.out.println("单向链表数据已经全部打印");
        }
    }

}
