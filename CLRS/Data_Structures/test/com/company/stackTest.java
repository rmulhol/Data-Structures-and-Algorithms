package com.company;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class stackTest {

    private stack testObject = new stack();

    @Test
    public void stackConstructorWithNoArgumentCreatesEmptyStack() {
        assertArrayEquals(new Comparable[1], testObject.data);
    }

    @Test
    public void stackConstructorWithArgumentCopiesData() {
        stack testObjectWithArgument = new stack(new Integer[]{1});

        assertArrayEquals(new Integer[]{1}, testObjectWithArgument.data);
    }

    @Test
    public void pushAddsElementToEndOfStack() {
        testObject.push(5);

        assertArrayEquals(new Integer[]{5}, testObject.data);
    }

    @Test
    public void pushDoublesTheArrayAsNecessary() {
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);

        Comparable[] expectedData = new Integer[4];
        expectedData[0] = 1;
        expectedData[1] = 2;
        expectedData[2] = 3;

        assertNull(expectedData[3]);
        assertNull(testObject.data[3]);
        assertArrayEquals(expectedData, testObject.data);
    }

    @Test(expected=EmptyStackException.class)
    public void popThrowsExceptionIfStackEmpty() {
        testObject.pop();
    }

    @Test
    public void popRemovesLastElementIfStackNotEmpty() {
        testObject.push(5);

        assertArrayEquals(new Integer[]{5}, testObject.data);

        Comparable poppedObject = testObject.pop();

        assertEquals(5, poppedObject);
        assertArrayEquals(new Integer[1], testObject.data);
    }

    @Test
    public void popPreservesRemainingElements() {
        testObject.push(5);
        testObject.push(4);
        testObject.push(3);

        assertEquals(3, testObject.data[2]);
        assertEquals(3, testObject.pop());
        assertEquals(5, testObject.data[0]);
        assertEquals(4, testObject.data[1]);
        assertNull(testObject.data[2]);
    }

    @Test
    public void popHalvesArrayLengthIfLessThanQuarterFull() {
        stack testObjectWithArgument = new stack(new Integer[]{1, 2, 3, 4, 5});
        assertEquals(8, testObjectWithArgument.data.length);

        testObjectWithArgument.pop(); // pop 5, this.top = 4
        testObjectWithArgument.pop(); // pop 4, this.top = 3
        testObjectWithArgument.pop(); // pop 3, this.top = 2
        testObjectWithArgument.pop(); // pop 2, this.top = 1 (< this.data.length / 4)

        Comparable[] expectedData = new Integer[4];
        expectedData[0] = 1;

        assertArrayEquals(expectedData, testObjectWithArgument.data);
    }

    @Test
    public void doubleArrayLengthDoublesArrayLength() {
        testObject.data = new Comparable[1];
        assertEquals(1, testObject.data.length);

        testObject.doubleArrayLength();
        assertEquals(2, testObject.data.length);
    }

    @Test
    public void halveArrayLengthHalvesArrayLength() {
        testObject.data = new Integer[8];
        testObject.halveArrayLength();
        assertArrayEquals(new Integer[4], testObject.data);
    }
}