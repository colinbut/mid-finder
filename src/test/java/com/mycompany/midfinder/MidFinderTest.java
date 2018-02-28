/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.midfinder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MidFinderTest {

    private MidFinder classUnderTest = new MidFinder();

    @Test
    public void testFindMidIndex() {

        int midIndex = classUnderTest.findMidIndex("aaaaa");

        assertEquals(2, midIndex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInputStringIsNull_whenFindMidIndex_thenThrowException() {
        classUnderTest.findMidIndex(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInputStringIsEmpty_whenFindMidIndex_thenThrowException() {
        classUnderTest.findMidIndex("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInputStringIsBlank_whenFindMidIndex_thenThrowException() {
        classUnderTest.findMidIndex("   ");
    }
}
