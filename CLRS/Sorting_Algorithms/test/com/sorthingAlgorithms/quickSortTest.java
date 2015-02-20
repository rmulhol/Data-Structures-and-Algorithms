package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class quickSortTest {

    private quickSort testObject = new quickSort();

    @Test
    public void mySortImplementsQuickSort() {
        Comparable[] unsortedArray = new Comparable[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Comparable[] sortedArray = new Comparable[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Comparable[] returnedArray = testObject.mySort(unsortedArray);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void quickSortSorts2Integers() {
        Comparable[] unsortedIntegers = new Integer[]{2, 1};
        Comparable[] sortedIntegers = new Integer[]{1, 2};
        testObject.quickSort(unsortedIntegers, 0, 1);

        assertArrayEquals(sortedIntegers, unsortedIntegers);
    }

    @Test
    public void quickSortSorts5Integers() {
        Comparable[] unsortedIntegers = new Integer[]{5, 4, 3, 2, 1};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 3, 4, 5};
        testObject.quickSort(unsortedIntegers, 0, 4);

        assertArrayEquals(sortedIntegers, unsortedIntegers);
    }

    @Test
    public void quickSortSorts2Strings() {
        Comparable[] unsortedStrings = new String[]{"World", "Hello"};
        Comparable[] sortedStrings = new String[]{"Hello", "World"};
        testObject.quickSort(unsortedStrings, 0, 1);

        assertArrayEquals(sortedStrings, unsortedStrings);
    }

    @Test
    public void quickSortSorts5Strings() {
        Comparable[] unsortedStrings = new String[]{"zap", "car", "bag", "the", "pie"};
        Comparable[] sortedStrings = new String[]{"bag", "car", "pie", "the", "zap"};
        testObject.quickSort(unsortedStrings, 0, 4);

        assertArrayEquals(sortedStrings, unsortedStrings);
    }

    @Test
    public void quickSortIgnoresEmptyArray() {
        Comparable[] emptyArray = new Comparable[]{};
        Comparable[] expectedArray = new Comparable[]{};
        testObject.quickSort(emptyArray, 0, 0);

        assertArrayEquals(expectedArray, emptyArray);
    }

    @Test
    public void partitionOrderTwoHalvesAroundLastElementAsPivot() {
        Comparable[] unpartitionedIntegers = new Integer[]{8, 6, 7, 5, 3, 0, 9, 4};
        Comparable[] partionedIntegers = new Integer[]{3, 0, 4, 5, 8, 6, 9, 7};
        int pivotElement = testObject.partition(unpartitionedIntegers, 0, 7);

        assertEquals(2, pivotElement);
        assertArrayEquals(partionedIntegers, unpartitionedIntegers);
    }

    @Test
    public void exchangeSwapsTwoElements() {
        Comparable[] testArray = new Integer[]{2, 1};
        Comparable[] expectedArray = new Integer[]{1, 2};
        testObject.exchange(testArray, 0, 1);

        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void exchangeDoesNotModifyOtherElements() {
        Comparable[] testArray = new Integer[]{5, 1, 4, 2, 3};
        Comparable[] expectedArray = new Integer[]{1, 5, 4, 2, 3};
        testObject.exchange(testArray, 0, 1);

        assertArrayEquals(expectedArray, testArray);
    }
}