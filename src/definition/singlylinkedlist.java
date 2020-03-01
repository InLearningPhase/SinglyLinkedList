package definition;


import adt.linkedlistADT;

public class singlylinkedlist<E> implements linkedlistADT<E> {

    private Node<E> head = null;
    private int size = 0;

    private Node<E> getNode(int index) {

        Node<E> response = head;
        for (int i = 0; i < index && response!=null; i++) {
            response = response.getNext();
        }

        return response;
    }

    @Override
    public void add(E item) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }

    private static class Node<E> {

        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
        }

        private Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }

}
