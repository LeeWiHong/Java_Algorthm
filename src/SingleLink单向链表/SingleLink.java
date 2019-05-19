package SingleLink单向链表;

public class SingleLink {
    private SingleLinkNode HeadNode = null;
    public void addLink(String nodeStr){
        if (this.HeadNode == null){
            this.HeadNode = new SingleLinkNode(nodeStr);
        }
        else {
            SingleLinkNode newNode = new SingleLinkNode(nodeStr);
            SingleLinkNode temp = HeadNode;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }

    }

}
