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

    private void addFirst(E item){

        head = new Node<>(item, head);
        size++;
    }

    private void addAfter(E item, Node<E> afterNode) {

        afterNode.next = new Node<>(item, afterNode.next);
        size++;
    }

    private void add(int index, E item) {

        if (index < 0 || index > size) {
            throw  new IndexOutOfBoundsException(Integer.toString(index));
        }
        else if (index == 0) {
            addFirst(item);
        }
        else {
            addAfter(item, getNode(index - 1));
        }

    }

    private E removeFirst(){

        E response = null;
        Node<E> temp = head;

        if (head != null) {
            head = head.getNext();

        }

        if (temp != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    private E removeAfter(Node<E> afterNode) {

        E response = null;
        Node<E> temp = afterNode.getNext();

        if (temp != null) {
            afterNode.next = temp.getNext();
            size--;
            response = temp.getData();
        }
        return response;
    }

    @Override
    public void add(E item) {
        add(size, item);
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
