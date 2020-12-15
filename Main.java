package com.treehousepractice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Calvin");
        groceryLine.add("Elliott");
        groceryLine.add("Michael");
        groceryLine.add("Charles");
        groceryLine.add("Bruce");

        System.out.println(groceryLine);

        groceryLine.remove(4);

        System.out.println(groceryLine);

        String Marcus = groceryLine.get(0);
        System.out.println("Marcus");

        int samIndex = groceryLine.indexOf("Timothy");
        System.out.println(samIndex);

        System.out.println(groceryLine.size());

        for (String name : groceryLine) {
            System.out.println(name);
        }
    }
}
