package com.sorthingAlgorithms;

public class countingSort implements sortable {
    @Override
    public Comparable[] mySort(Comparable[] list) {
        int maxValue = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i].compareTo(maxValue) > 0) {
                maxValue = (Integer) list[i];
            }
        }
        return countingSort((Integer[]) list, maxValue);
    }

    public Integer[] countingSort(Integer[] unsortedArray, int maxValue) {
        Integer[] sortedArray = new Integer[unsortedArray.length];
        Integer[] valueCounts = new Integer[maxValue + 1];
        for(int i = 0; i <= maxValue; i++) {
            valueCounts[i] = 0;
        }
        for(int j = 0; j < unsortedArray.length; j++) {
            valueCounts[unsortedArray[j]] = valueCounts[unsortedArray[j]] + 1;
        }
        for(int k = 1; k <= maxValue; k++) {
            valueCounts[k] = valueCounts[k] + valueCounts[k - 1];
        }
        for(int l = unsortedArray.length - 1; l >= 0; l--) {
            sortedArray[valueCounts[unsortedArray[l]] - 1] = unsortedArray[l];
            valueCounts[unsortedArray[l]] = valueCounts[unsortedArray[l]] - 1;
        }
        return sortedArray;
    }
}
