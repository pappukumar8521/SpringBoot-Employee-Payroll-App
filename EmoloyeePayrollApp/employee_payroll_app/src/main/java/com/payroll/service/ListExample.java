package com.payroll.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        int index = 2;  // Example index

        if (index >= 0 && index < list.size()) {
            System.out.println("Element: " + list.get(index));
        } else {
            System.out.println("Index out of bounds: " + index);
        }
    }
}
