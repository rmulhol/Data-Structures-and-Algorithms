package com.sorthingAlgorithms;

public class mergeSort implements sortable {
    @Override
    public Comparable[] mySort(Comparable[] list) {
        return mergeSort(list, 0, list.length - 1);
    }

    public Comparable[] mergeSort(Comparable[] list, int beginning, int end) {
        if(beginning < end) {
            int middle = ((end - beginning) / 2) + beginning;
            mergeSort(list, beginning, middle);
            mergeSort(list, middle + 1, end);
            return myMerge(list, beginning, middle, end);
        } else {
            return list;
        }
    }

    public Comparable[] myMerge(Comparable[] list, int beginning, int middle, int end) {
        int leftArrayLength = middle - beginning + 1;
        int rightArrayLength = end - middle;

        Comparable[] leftArray = new Comparable[leftArrayLength];
        Comparable[] rightArray = new Comparable[rightArrayLength];

        for(int i = 0; i < leftArrayLength; i++) {
            leftArray[i] = list[beginning + i];
        }

        for(int j = 0; j < rightArrayLength; j++) {
            rightArray[j] = list[middle + j + 1];
        }

        int i = 0;
        int j = 0;

        for(int k = beginning; k <= end; k++) {
            if(i >= leftArrayLength) {
                list[k] = rightArray[j];
                j += 1;
            } else if(j >= rightArrayLength) {
                list[k] = leftArray[i];
                i += 1;
            } else if(leftArray[i].compareTo(rightArray[j]) <= 0) {
                list[k] = leftArray[i];
                i += 1;
            } else {
                list[k] = rightArray[j];
                j += 1;
            }
        }
        return list;
    }
}
