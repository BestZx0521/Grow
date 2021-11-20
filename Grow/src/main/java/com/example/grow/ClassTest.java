package com.example.grow;

import java.util.ArrayList;
import java.util.List;
..
public class ClassTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.forEach(System.out::println);
	
    }
}
