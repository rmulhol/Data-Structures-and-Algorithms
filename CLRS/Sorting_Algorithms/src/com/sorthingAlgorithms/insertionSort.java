package com.sorthingAlgorithms;

import java.util.LinkedList;

public class insertionSort implements sortable {
    @Override
    public LinkedList<Integer> mySort(LinkedList<Integer> list) {
        for(int j = 1; j < list.size(); j++) {
            int key = list.get(j);
            int i = j - 1;
            while(i >= 0 && list.get(i) > key) {
                list.set(i+1, list.get(i));
                i = i - 1;
            }
            list.set(i+1, key);
        }
        return list;
    }
}
