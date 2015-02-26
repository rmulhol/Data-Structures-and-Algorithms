package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class countingSortTest {

    private countingSort testObject = new countingSort();

    @Test
    public void mySortImplementsCountingSort() {
        Integer[] unsortedArray = new Integer[]{6, 1, 5, 2, 4, 3};
        Integer[] sortedArray = new Integer[]{1, 2, 3, 4, 5, 6};
        Comparable[] returnedArray = testObject.mySort(unsortedArray);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void countingSortSorts5IntegerArray() {
        Integer[] unsortedArray = new Integer[]{5, 4, 3, 2, 1};
        Integer[] sortedArray = new Integer[]{1, 2, 3, 4, 5};
        Integer[] returnedArray = testObject.countingSort(unsortedArray, 5);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void countingSortSorts10IntegerArray() {
        Integer[] unsortedArray = new Integer[]{8, 6, 7, 5, 3, 0, 9, 4, 1, 2};
        Integer[] sortedArray = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] returnedArray = testObject.countingSort(unsortedArray, 9);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void countingSortSortsArrayWithDuplicates() {
        Integer[] unsortedArray = new Integer[]{3, 3, 3, 2, 1, 1, 0};
        Integer[] sortedArray = new Integer[]{0, 1, 1, 2, 3, 3, 3};
        Integer[] returnedArray = testObject.countingSort(unsortedArray, 3);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void countingSortIgnoresEmptyArray() {
        Integer[] emptyArray = new Integer[]{};
        Integer[] returnedArray = testObject.countingSort(emptyArray, 0);

        assertArrayEquals(returnedArray, emptyArray);
    }

}