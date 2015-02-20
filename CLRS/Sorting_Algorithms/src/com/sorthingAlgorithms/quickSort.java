package com.sorthingAlgorithms;

public class quickSort implements sortable {
    @Override
    public Comparable[] mySort(Comparable[] list) {
        quickSort(list, 0, list.length - 1);
        return list;
    }

    public void quickSort(Comparable[] list, int beginning, int end) {
        if(beginning < end) {
            int pivot = partition(list, beginning, end);
            quickSort(list, beginning, pivot - 1);
            quickSort(list, pivot + 1, end);
        }
    }

    public int partition(Comparable[] list, int beginning, int end) {
        Comparable pivot = list[end];
        int indexCounter = beginning - 1;
        for(int i = beginning; i < end; i++) {
            if(list[i].compareTo(pivot) < 1) {
                indexCounter++;
                exchange(list, indexCounter, i);
            }
        }
        exchange(list, indexCounter + 1, end);
        return indexCounter + 1;
    }

    public void exchange(Comparable[] list, int i, int j) {
        Comparable initialValue = list[i];
        list[i] = list[j];
        list[j] = initialValue;
    }
}
