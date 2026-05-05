package dev.aluno.datastructures.list;

public class MyLinkedList<T> implements MyList<T> {

    // Internal Node Class
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() { return data; }
        public void setData(T data) { this.data = data; }
        public Node<T> getNext() { return next; }
        public void setNext(Node<T> next) { this.next = next; }
    }

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // --- Method Signatures (To be implemented in the next phase) ---

    @Override public void addFirst(T data) { /* TODO */ }
    @Override public void addLast(T data) { /* TODO */ }
    @Override public void insertAt(int index, T data) { /* TODO */ }
    @Override public void addSorted(T data) { /* TODO */ }

    @Override public T removeFirst() { return null; /* TODO */ }
    @Override public T removeLast() { return null; /* TODO */ }
    @Override public T removeAt(int index) { return null; /* TODO */ }
    @Override public boolean remove(T data) { return false; /* TODO */ }

    @Override public void clear() { /* TODO */ }
    @Override public int find(T data) { return -1; /* TODO */ }
    @Override public T get(int index) { return null; /* TODO */ }
    @Override public void set(int index, T data) { /* TODO */ }
    @Override public int size() { return size; }
}
