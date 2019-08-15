package SingleLink;

public class SingleLink {
    public SingleLinkNode HeadNode;
    public int length;

//    初始化链表
    public SingleLink(){
        HeadNode = null;
        length = 0;
    }
//    添加结点
    public void addLink(String nodeStr){
        System.out.println("添加结点--"+nodeStr);
        if (HeadNode == null){
            HeadNode = new SingleLinkNode(nodeStr);
        }
        else {
            System.out.println("fdad--");
            SingleLinkNode newNode = new SingleLinkNode(nodeStr);
            SingleLinkNode temp = HeadNode;
//            每次添加都要通过头结点往后查找是否到了最后一个空结点然后就设置next为当前新建的node
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
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
