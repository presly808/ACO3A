package week5.day1;

import week6.dynamic.Node;

/**
 * Created by serhii on 14.07.15.
 */
public class MyLinkedList implements MyList {

    private Node head;
    private Node tail;
    private int size;

    @Override
    public boolean add(Object object) {
        if(size == 0){
            head = new Node(object,null);
            tail = head;
        } else {
            tail.next = new Node(object,null);
            tail = tail.next;
        }
        return true;

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
