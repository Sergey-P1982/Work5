package com.epam.task2.model;

import java.util.*;

public class CollectionCreater {

    public Collection<Integer> createList(int elemNumbers, int range) {

        List<Integer> list = new ArrayList<>(elemNumbers);
        Random random = new Random();
        for (int i = 0; i < elemNumbers; i++) {
            list.add(random.nextInt(range));
        }

        return list;
    }

    public Collection<Integer> createSet(int elemNumbers, int range) {

        Set<Integer> list = new HashSet<>(elemNumbers);
        Random random = new Random();
        if (elemNumbers > range) {
            throw new IllegalArgumentException("Not enough range to fill the set");
        } else {
            for (int i = 0; list.size() < elemNumbers; i++) {
                list.add(random.nextInt(range));
            }
        }

        return list;
    }
}



