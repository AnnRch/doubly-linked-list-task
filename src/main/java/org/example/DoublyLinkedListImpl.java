package org.example;

import java.util.Optional;

public class DoublyLinkedListImpl implements DoublyLinkedList{
    @Override
    public boolean addFirst(Object element) {
        return false;
    }

    @Override
    public boolean addLast(Object element) {
        return false;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public Optional<Object> remove(Object element) {
        return Optional.empty();
    }

    @Override
    public boolean set(int index, Object element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
