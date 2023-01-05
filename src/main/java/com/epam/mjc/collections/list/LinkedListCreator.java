package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> odd = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (i % 2 != 0) {
                odd.add(0, i);
            } else {
                odd.add(sourceList.size() - 1, i);
            }
        }
        return odd;
    }
}
