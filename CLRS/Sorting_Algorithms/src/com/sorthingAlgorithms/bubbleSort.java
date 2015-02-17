package com.sorthingAlgorithms;

public class bubbleSort implements sortable {
    @Override
    public Comparable[] mySort(Comparable[] list) {
        return bubbleSort(list);
    }

    public Comparable[] bubbleSort(Comparable[] list) {
        for(int i=0; i < list.length; i++) {
            for(int j=list.length - 1; j > 0; j--) {
                if(list[j].compareTo(list[j-1]) < 0) {
                    exchange(list, j, j-1);
                }
            }
        }
        return list;
    }

    public Comparable[] exchange(Comparable[] list, int i, int j) {
        Comparable initialValue = list[i];
        list[i] = list[j];
        list[j] = initialValue;
        return list;
    }
}
