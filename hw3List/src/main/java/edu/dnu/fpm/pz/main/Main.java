package edu.dnu.fpm.pz.main;

import edu.dnu.fpm.pz.list.AbstractList;
import edu.dnu.fpm.pz.list.CList;

public class Main {

    public static AbstractList<String> getList() {
        return new CList<>(1);
    }

    public static void demoMethod(AbstractList<String> list) {
        try {
            list.push_back("hello");
            list.push_back("world");
            list.push_back("list");
            list.push_back(Main.class.toString());

            System.out.println("Element at index 1: " + list.get(1));
            list.set(1, "123");
            System.out.println("Updated element at index 1: " + list.get(1));

            System.out.println("Removed element at index 2: " + list.remove(2));
            System.out.println("List size after removal: " + list.size());

            list.get(10);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        demoMethod(getList());
    }

}
