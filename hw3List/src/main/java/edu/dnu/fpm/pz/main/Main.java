package edu.dnu.fpm.pz.main;

import edu.dnu.fpm.pz.list.AbstractList;
import edu.dnu.fpm.pz.list.CList;

public class Main {

    public static AbstractList<String> getList() {
        return new CList<>(1);
    }

    public static void main(String[] args) {
        AbstractList<String> list = getList();

        try {
            list.push_back("hello");
            list.push_back("world");
            list.push_back("list");
            list.push_back(Main.class.toString());

            System.out.println(list.get(1));
            list.set(1, "123");
            System.out.println(list.get(1));

            System.out.println(list.remove(2));
            System.out.println(list.size());

            list.get(10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
