package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class bubbleSortTest {

    private bubbleSort testObject = new bubbleSort();

    @Test
    public void mySortImplementsBubbleSort() {
        Comparable[] unsortedArray = new Integer[]{6, 5, 4, 3, 2, 1};
        Comparable[] sortedArray = new Integer[]{1, 2, 3, 4, 5, 6};
        Comparable[] returnedArray = testObject.mySort(unsortedArray);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void bubbleSortSortsFourIntegerArray() {
        Comparable[] unsortedIntegers = new Integer[]{4, 3, 2, 1};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 3, 4};
        Comparable[] returnedArray = testObject.bubbleSort(unsortedIntegers);

        assertArrayEquals(sortedIntegers, returnedArray);
    }

    @Test
    public void bubbleSortSortsSevenIntegerArray() {
        Comparable[] unsortedIntegers = new Integer[]{7, 1, 6, 2, 5, 3, 4};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Comparable[] returnedArray = testObject.bubbleSort(unsortedIntegers);

        assertArrayEquals(sortedIntegers, returnedArray);
    }

    @Test
    public void bubbleSortSortsTwoStringArray() {
        Comparable[] unsortedStrings = new String[]{"world", "hello"};
        Comparable[] sortedStrings = new String[]{"hello", "world"};
        Comparable[] returnedArray = testObject.bubbleSort(unsortedStrings);

        assertArrayEquals(sortedStrings, returnedArray);
    }

    @Test
    public void bubbleSortSortsFiveStringArray() {
        Comparable[] unsortedStrings = new String[]{"One", "Two", "Three", "Four", "Five"};
        Comparable[] sortedStrings = new String[]{"Five", "Four", "One", "Three", "Two"};
        Comparable[] returnedArray = testObject.bubbleSort(unsortedStrings);

        assertArrayEquals(sortedStrings, returnedArray);
    }

    @Test
    public void bubbleSortReturnsEmptyArray() {
        Comparable[] emptyArray = new Comparable[]{};
        Comparable[] expectedArray = new Comparable[]{};
        Comparable[] returnedArray = testObject.bubbleSort(emptyArray);

        assertArrayEquals(expectedArray, returnedArray);
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