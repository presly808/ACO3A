package week6.dynamic;

public interface NodeHelper {


    /*
    * h        nNode
    * |          |
    * 1-2-3-4    7
    *
    * res 1-2-3-4-7
    *
    *
    * */
    void addToTail(Node head, Node nNode);

    /*
    * h        nNode
    * |          |
    * 1-2-3-4    7
    *
    * return ref-> 7-1-2-3-4
    *
    *
    * */
    Node addToHead(Node head, Node nNode);

    String toString(Node head);

    void addToPosition(Node head, int pos, Node nNode);

    Node create(Object[] mas);

    Object[] toArray(Node head);

    /**
     * ex 1->2->3->4->5
     *
     *    5->4->3->2->1
     * */
    Node reverse(Node head);


}
