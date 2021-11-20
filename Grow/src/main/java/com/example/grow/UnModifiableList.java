package com.example.grow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList {
    private static List list=new ArrayList();

    public static void main(String[] args) {
        list.add("1");
        System.out.println(list);
        list = Collections.unmodifiableList(list);
        System.out.println("不允许改变");
        list.add("2");
        System.out.println(list);
    }
}
