package com.stackroute.pe5testCases;

import com.stackroute.pe5.TwoKeyValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class TwoKeyValueTest {

    TwoKeyValue twoKeyValue;
    @Before
    public void setUp()
    {
        twoKeyValue=new TwoKeyValue();
    }

    @After
    public void tearDown()
    {
        twoKeyValue=null;
    }

    @Test
    public void testTwoKeyValueSuccess()
    {
        Map<String,String> map= new TreeMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map<String,String> actualMap= twoKeyValue.changeTwoKeyValue(map);
        Map<String, String> expectedMap=new TreeMap<>();
        expectedMap.put("val1"," ");
        expectedMap.put("val2","java");

        assertEquals(expectedMap,actualMap);

    }

    @Test
    public void testTwoKeyValueFailure()
    {
        Map<String,String> map= new TreeMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map<String,String> actualMap= twoKeyValue.changeTwoKeyValue(map);
        Map<String, String> expectedMap=new TreeMap<>();
        expectedMap.put("val1","c++");
        expectedMap.put("val2","java");

        assertNotEquals(expectedMap,actualMap);
    }

    @Test
    public void testTwoKeyValueNeutral()
    {
        Map<String,String> map= new TreeMap<>();
        Map<String,String> actualMap= twoKeyValue.changeTwoKeyValue(map);
        assertNull(actualMap);
    }
}