package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class insertionSortTest {
    sortable testObject = new insertionSort();

    private Comparable[] generateUnsortedFiveIntList() {
        Comparable[] inputList = new Comparable[5];

        inputList[0] = 5;
        inputList[1] = 1;
        inputList[2] = 4;
        inputList[3] = 3;
        inputList[4] = 2;

        return inputList;
    }

    private Comparable[] generateUnsortedSevenIntList() {
        Comparable[] inputList = new Comparable[7];

        inputList[0] = 6;
        inputList[1] = 5;
        inputList[2] = 3;
        inputList[3] = 4;
        inputList[4] = 1;
        inputList[5] = 6;
        inputList[6] = 2;

        return inputList;
    }

    @Test
    public void insertionSortOrdersElementsOfFiveIntList() {
        Comparable[] inputList = generateUnsortedFiveIntList();

        Comparable[] returnedList = testObject.mySort(inputList);

        assertEquals(1, returnedList[0]);
        assertEquals(2, returnedList[1]);
        assertEquals(3, returnedList[2]);
        assertEquals(4, returnedList[3]);
        assertEquals(5, returnedList[4]);
    }

    @Test
    public void insertionSortOrdersElementsOfFiveStringList() {
        Comparable[] inputList = new Comparable[5];

        inputList[0] = "World";
        inputList[1] = "Whole";
        inputList[2] = "The";
        inputList[3] = "Into";
        inputList[4] = "Hello";

        Comparable[] returnedList = testObject.mySort(inputList);

        assertEquals("Hello", returnedList[0]);
        assertEquals("Into", returnedList[1]);
        assertEquals("The", returnedList[2]);
        assertEquals("Whole", returnedList[3]);
        assertEquals("World", returnedList[4]);
    }

    @Test
    public void insertionSortOrdersElementsOfSevenIntList() {
        Comparable[] inputList = generateUnsortedSevenIntList();

        Comparable[] returnedList = testObject.mySort(inputList);

        assertEquals(1, returnedList[0]);
        assertEquals(2, returnedList[1]);
        assertEquals(3, returnedList[2]);
        assertEquals(4, returnedList[3]);
        assertEquals(5, returnedList[4]);
        assertEquals(6, returnedList[5]);
        assertEquals(6, returnedList[6]);
    }

    @Test
    public void insertionSortMaintainsLengthOfFiveIntList() {
        Comparable[] inputList = generateUnsortedFiveIntList();

        Comparable[] returnedList = testObject.mySort(inputList);

        assertEquals(5, returnedList.length);
    }

    @Test
    public void insertionSortMaintainsLengthOfSevenIntList() {
        Comparable[] inputList = generateUnsortedSevenIntList();

        Comparable[] returnedList = testObject.mySort(inputList);

        assertEquals(7, returnedList.length);
    }
}