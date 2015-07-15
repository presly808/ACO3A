package week6.dynamic;

public class NodeHelperImpl implements NodeHelper {

    @Override
    public void addToTail(Node head, Node nNode) {
        // 1. find last ????
        // 2. Tell last about nNode
        Node iter = head;

        // find last(tail)
        while(iter.next != null){
            iter = iter.next;
        }

        iter.next = nNode;

    }

    @Override
    public Node addToHead(Node head, Node nNode) {
        nNode.next = head;
        head = nNode;
        return head; // nNode
    }

    @Override
    public String toString(Node head) {
        String res = "";

        Node iter = head;

        // find last(tail)
        while(iter != null){ // exit
            res += iter.val + "->";
            iter = iter.next; // way
        }

        return res;
        //return head != null ? (head + "->" + toString(head.next)) : "";
    }

    @Override
    public void addToPosition(Node head, int pos, Node nNode) {

    }

    @Override
    public Node create(Object[] mas) {
        return null;
    }

    @Override
    public Object[] toArray(Node head) {
        return new Object[0];
    }

    @Override
    public Node reverse(Node head) {
        return null;
    }
}
