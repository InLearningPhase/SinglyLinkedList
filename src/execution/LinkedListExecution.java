package execution;

import definition.singlylinkedlist;

public class LinkedListExecution<E> extends singlylinkedlist {
    public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.print();
        list.remove();
        list.remove(4);
        System.out.println(list.search(6));
        System.out.println(list.search(4));
    }

}
