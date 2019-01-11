package com.stackroute.pe5testCases;

import com.stackroute.pe5.ArrayListUpdation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArrayListUpdationTest {
    ArrayListUpdation arrayListUpdation;

    @Before
    public void setUp()
    {
        arrayListUpdation=new ArrayListUpdation();
    }

    @After
    public void tearDown()
    {
        arrayListUpdation=null;
    }

    @Test
    public void testArrayListUpdationSuccess()
    {
        List<String> testString=new ArrayList<String>();
        testString.add("Apple");
        testString.add("Grape");
        testString.add("Melon");
        testString.add("Berry");
        List<String> actualString=arrayListUpdation.arrayUpdate(testString);
        List<String>ExpectedString=new ArrayList<String>();
        ExpectedString.add("Kiwi");
        ExpectedString.add("Grape");
        ExpectedString.add("Mango");
        ExpectedString.add("Berry");

        assertEquals(ExpectedString,actualString);


        boolean actualValue=arrayListUpdation.arrayEmpty(testString);
        boolean expectedValue=true;
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testArrayListUpdationFailure()
    {
        List<String> testString=new ArrayList<String>();
        testString.add("Apple");
        testString.add("Grape");
        testString.add("Melon");
        testString.add("Berry");
        List<String> actualString=arrayListUpdation.arrayUpdate(testString);
        List<String>ExpectedString=new ArrayList<String>();
        ExpectedString.add("Apple");
        ExpectedString.add("Grape");
        ExpectedString.add("Melon");
        ExpectedString.add("Berry");

        assertNotEquals(ExpectedString,actualString);

        boolean actualValue=arrayListUpdation.arrayEmpty(testString);
        boolean expectedValue=false;
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testArrayListUpdationNeutral()
    {
        List<String> testString=new ArrayList<String>();
        testString.add("Apple");
        testString.add("Grape");
        testString.add("Melon");
        testString.add("Berry");
        List<String> actualString=arrayListUpdation.arrayUpdate(testString);
       assertNotNull(actualString);


    }


}