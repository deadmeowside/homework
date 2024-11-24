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
    public T get(int index) {
        try {
            Validator.validateIndex(index, size);
            return elements[index];
        } catch (ListException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public void set(int index, T element) {
        try {
            Validator.validateIndex(index, size);
            elements[index] = element;
        } catch (ListException e) {
            System.out.println(e);
        }
    }

    @Override
    public void push_back(T element) {
        resize();
        elements[size++] = element;
    }

    @Override
    public void push_back(int index, T element) {
        try {
            Validator.validateIndex(index, size + 1);
            resize();
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        } catch (ListException e) {
            System.out.println(e);
        }
    }

    @Override
    public T remove(int index) {
        try {
            Validator.validateIndex(index, size);
            T removedElement = elements[index];
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[--size] = null;
            return removedElement;
        } catch (ListException e) {
            System.out.println(e);
            return null;
        }
    }

    private void resize() {
        if (size == elements.length) {
            T[] newElements = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

}
