package com.sorthingAlgorithms;

public class insertionSort implements sortable {
    @Override
    public Comparable[] mySort(Comparable[] list) {
        for (int j = 1; j < list.length; j++) {
            Comparable key = list[j];
            int i = j - 1;
            while (i >= 0 && list[i].compareTo(key) > 0) {
                list[i + 1] = list[i];
                i = i - 1;
            }
            list[i + 1] = key;
        }
        return list;
    }
}