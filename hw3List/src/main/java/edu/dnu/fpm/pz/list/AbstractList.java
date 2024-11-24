package edu.dnu.fpm.pz.list;

public interface AbstractList<T> {

    int size();

    boolean isEmpty();

    T get(int index);

    void set(int index, T element);

    void push_back(T element);

    void push_back(int index, T element);

    T remove(int index);

}
