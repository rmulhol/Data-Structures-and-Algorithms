package com.sorthingAlgorithms;

public class mergeSort {
    public int[] mySort(int[] list, int beginning, int end) {
        if(beginning < end) {
            int middle = ((end - beginning) / 2) + beginning;
            mySort(list, beginning, middle);
            mySort(list, middle + 1, end);
            return myMerge(list, beginning, middle, end);
        } else {
            return list;
        }
    }

    public int[] myMerge(int[] list, int beginning, int middle, int end) {
        int leftArrayLength = middle - beginning + 1;
        int rightArrayLength = end - middle;

        int[] leftArray = new int[leftArrayLength + 1];
        int[] rightArray = new int[rightArrayLength + 1];

        for(int i = 0; i < leftArrayLength; i++) {
            leftArray[i] = list[beginning + i];
        }

        for(int j = 0; j < rightArrayLength; j++) {
            rightArray[j] = list[middle + j + 1];
        }

        leftArray[leftArrayLength] = Integer.MAX_VALUE;
        rightArray[rightArrayLength] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for(int k = beginning; k <= end; k++) {
            if (leftArray[i] <= rightArray[j]) {
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
