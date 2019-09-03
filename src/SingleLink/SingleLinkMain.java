package SingleLink;

// 单向链表

public class SingleLinkMain {
    public static void main(String[] args) {
//        创建链表
        SingleLink singleLink = new SingleLink();
//        添加结点
        singleLink.addLink("鲁班");
        singleLink.addLink("赵云");
        singleLink.addLink("韩信");
//        输出链表
//        singleLink.printLink();
//        查找链表结点
//        System.out.println("数据查找情况:"+singleLink.findLinkNode("后裔"));
//        链表长度
//        System.out.println("链表长度:"+singleLink.getLength());
//        删除结点
        System.out.println("删除结点:"+singleLink.delLinkNode("韩信"));
        singleLink.printLink();

    }
}
