import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StringAppearsMorethan2Test {

    StringAppearsMorethan2 stringAppearsMorethan2;

    @Before
    public void setUp()
    {
        stringAppearsMorethan2=new StringAppearsMorethan2();
    }

    @After
    public void tearDown()
    {
        stringAppearsMorethan2=null;
    }

    @Test
    public void testStringAppearsMorethan2Success()
    {
        String[] testArray={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedMap=new HashMap<String, Boolean>();
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        Map<String,Boolean> actualMap=stringAppearsMorethan2.stringAppears(testArray);
        assertEquals(expectedMap,actualMap);

    }

    @Test
    public void testStringAppearsMorethan2Failure()
    {
        String[] testArray={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedMap=new HashMap<String, Boolean>();
        expectedMap.put("a",true);
        expectedMap.put("b",true);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        Map<String,Boolean> actualMap=stringAppearsMorethan2.stringAppears(testArray);
        assertNotEquals(expectedMap,actualMap);

    }

    @Test
    public void testStringAppearsMorethan2Neutral()
    {
        String[] testArray=null;
        Map<String,Boolean> actualMap=stringAppearsMorethan2.stringAppears(testArray);
        assertNull(actualMap);
    }

}