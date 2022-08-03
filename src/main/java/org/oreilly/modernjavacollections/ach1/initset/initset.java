package org.oreilly.modernjavacollections.ach1.initset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class initset {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("A");
        ls.add("B");
        ls.add("A");

        Set<String> ss = new HashSet<String>(ls);
        System.out.println("Set contains: " + ss);
    }
}
