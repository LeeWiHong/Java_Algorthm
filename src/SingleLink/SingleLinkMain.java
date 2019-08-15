package SingleLink;

// 单向链表

public class SingleLinkMain {
    public static void main(String[] args) {
        SingleLink singleLink = new SingleLink();
        singleLink.addLink("鲁班");
        singleLink.addLink("赵云");
        singleLink.addLink("韩信");
        singleLink.printLink();
        System.out.println(singleLink.findLinkNode("鲁班")+"cccc");


    }
}
