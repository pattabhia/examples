package com.shiva.algorithms.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathSeparatorTest {

    private final String FORWARD_SLASH = "\\\\";
    private final String BACKWARD_SLASH = "/";
    private String input1 = "INDIA_KAR";
    private String input2 = "INDIA\\KAR\\BNG";
    private String input3 = "INDIA\\KAR/BNG\\KRP";
    private String input4 = "INDIA\\KAR\\BNG\\KRP";

    @Before
    public void setUp() throws Exception {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWhenInputKeyAndSeparatorMissing() {
        String input = null;
        String[] splitPaths = PathSeparator.split(input);
        Assert.fail();
    }

    @Test
    public void testWhenInputHavingNoSeparator() {
        String[] splitPaths = PathSeparator.split(input1);
        Assert.assertEquals(input1, splitPaths[0]);
    }

    @Test
    public void testWhenInputHavingAtleaseOneSeparator() {
        String[] splitPaths = PathSeparator.split(input2);
        Assert.assertEquals("INDIA", splitPaths[0]);
    }

    @Test
    public void testFindSecondElementOfPath() {
        String splitPath = PathSeparator.split(input2, 1);
        Assert.assertEquals("KAR", splitPath);
    }

    @Test
    public void testFindFirstElementOfPath() {
        String splitPath = PathSeparator.split(input2, 0);
        Assert.assertEquals("INDIA", splitPath);
    }

    @Test
    public void testFindThirdElementOfPath() {
        String splitPath = PathSeparator.split(input3, 2);
        Assert.assertEquals("BNG", splitPath);
    }

    @Test
    public void testFindThirdElementOfPathWhenInputHasNoThrid() {
        String splitPath = PathSeparator.split(input2, 3);
        Assert.assertEquals(null, splitPath);
    }

}