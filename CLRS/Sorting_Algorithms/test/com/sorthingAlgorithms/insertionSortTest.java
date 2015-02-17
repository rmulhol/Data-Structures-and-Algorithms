package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class insertionSortTest {
    insertionSort testObject = new insertionSort();

    @Test
    public void mySortImplementsInsertionSort() {
        Comparable[] inputArray = new Integer[]{6, 5, 4, 3, 2, 1};
        Comparable[] expectedArray = new Integer[]{1, 2, 3, 4, 5, 6};
        Comparable[] returnedArray = testObject.mySort(inputArray);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void insertionSortOrdersElementsOfFiveIntegerArray() {
        Comparable[] unsortedIntegers = new Integer[]{5, 1, 4, 3, 2};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 3, 4, 5};
        Comparable[] returnedArray = testObject.insertionSort(unsortedIntegers);

        assertArrayEquals(sortedIntegers, returnedArray);
    }

    @Test
    public void insertionSortOrdersElementsOfSevenIntegerArray() {
        Comparable[] unsortedIntegers = new Integer[]{7, 5, 3, 4, 1, 6, 2};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Comparable[] returnedArray = testObject.insertionSort(unsortedIntegers);

        assertArrayEquals(sortedIntegers, returnedArray);
    }

    @Test
    public void insertionSortOrdersElementsOfFiveStringArray() {
        Comparable[] unsortedStrings = new String[]{"World", "Whole", "The", "Into", "Hello"};
        Comparable[] sortedStrings = new String[]{"Hello", "Into", "The", "Whole", "World"};
        Comparable[] returnedArray = testObject.insertionSort(unsortedStrings);

        assertArrayEquals(sortedStrings, returnedArray);
    }

    @Test
    public void insertionSortReturnsEmptyArray() {
        Comparable[] emptyArray = new Comparable[]{};
        Comparable[] expectedArray = new Comparable[]{};
        Comparable[] returnedArray = testObject.insertionSort(emptyArray);

        assertArrayEquals(expectedArray, returnedArray);
    }
}