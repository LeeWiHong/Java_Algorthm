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
        singleLink.printLink();
//        查找链表结点
        System.out.println(singleLink.findLinkNode("鲁班")+"cccc");


    }
}
