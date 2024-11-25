package edu.dnu.fpm.pz.list;

public class CList<T> implements AbstractList<T> {

    private T[] elements;
    private int size;

    public CList(int initialCapacity) {
        if (initialCapacity <= 0) initialCapacity = 10;
        this.elements = (T[]) new Object[initialCapacity];
        this.size = 0;
    }

    public CList() {
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) throws ListException {
        Validator.validateIndex(index, size);
        return elements[index];
    }

    @Override
    public void set(int index, T element) throws ListException {
        Validator.validateIndex(index, size);
        elements[index] = element;
    }

    @Override
    public void push_back(T element) {
        resize();
        elements[size++] = element;
    }

    @Override
    public void push_back(int index, T element) throws ListException {
        Validator.validateIndex(index, size + 1);
        resize();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public T remove(int index) throws ListException {
        Validator.validateIndex(index, size);
        T removedElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
        return removedElement;
    }

    private void resize() {
        if (size == elements.length) {
            T[] newElements = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

}
