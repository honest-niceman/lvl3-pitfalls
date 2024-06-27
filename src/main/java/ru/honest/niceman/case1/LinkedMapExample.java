package ru.honest.niceman.case1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Помни, что порядок важен
 */
public class LinkedMapExample {
    public static void main(String[] args) {
        // Using a HashMap
        Map<MyClass, String> hashMap = new HashMap<>();
        hashMap.put(new MyClass(3), "Alice");
        hashMap.put(new MyClass(1), "Bob");
        hashMap.put(new MyClass(2), "Charlie");

        //HashMap: The entries are not in the order they were added.
        // The order is determined by the hash codes of the keys.
        System.out.println("HashMap entries:");
        for (Map.Entry<MyClass, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // LinkedHashMap: The entries are in the exact order they were added: Alice, Bob, Charlie.
        Map<MyClass, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(new MyClass(3), "Alice");
        linkedHashMap.put(new MyClass(1), "Bob");
        linkedHashMap.put(new MyClass(2), "Charlie");

        System.out.println("\nLinkedHashMap entries:");
        for (Map.Entry<MyClass, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
