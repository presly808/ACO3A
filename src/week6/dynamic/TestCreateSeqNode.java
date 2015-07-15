package week6.dynamic;

public class TestCreateSeqNode {

    public static void main(String[] args) {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, node1);
        Node node3 = new Node(3, node2);
        Node node4 = new Node(4, node3);

        Node seq = new Node(5,
                        new Node(4,
                                new Node(3,
                                        new Node(2, null))));

        Node curr = null;
        for(int i = 0; i < 5; i++){
            curr = new Node(i, curr);
        }
    }
}
