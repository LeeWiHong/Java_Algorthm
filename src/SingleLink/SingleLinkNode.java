package SingleLink;

public class SingleLinkNode {
//    节点数据
    private String data;
//    后继节点指针
    private SingleLinkNode next;

    public SingleLinkNode(String data){
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public SingleLinkNode getNext() {
        return next;
    }

    public void setNext(SingleLinkNode next) {
        this.next = next;
    }

}
