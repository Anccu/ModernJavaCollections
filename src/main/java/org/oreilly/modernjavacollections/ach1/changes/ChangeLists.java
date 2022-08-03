package org.oreilly.modernjavacollections.ach1.changes;

import java.util.LinkedList;
import java.util.List;

public class ChangeLists {

    public static void showListContents(List l) {
        for (Object obj : l) {
            System.out.println("> " + obj);
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("One");
        ll.add("Two");
        ll.add("Three");
        ll.add(4); // diferentes valores
        showListContents(ll);
    }
}
