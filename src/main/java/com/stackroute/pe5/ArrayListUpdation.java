/**
 * a Java program to update specific array element by given element and
 * empty the  array list .
 * Input: [Apple, Grape, Melon, Berry]
 * Output: [Kiwi, Grape, Mango, Berry]
 * Return the empty array
 */
package com.stackroute.pe5;

import java.util.List;

public class ArrayListUpdation {
    /*
    It will check whether the array contains "Apple" replace it
    to "Kiwi" and "Melon"  to "Mango"
     */
    public List<String> arrayUpdate(List<String> arrayList)
    {
        if( arrayList.contains("Apple") || arrayList.contains("Melon"))
        {
            for( int i=0 ; i< arrayList.size() ; i++ )
            {
                if(arrayList.get(i) == "Apple") // Getting the value with get(index) method
                {
                    arrayList.set(i,"Kiwi"); // Setting that value
                }
                if(arrayList.get(i) == "Melon")
                {
                    arrayList.set(i,"Mango");
                }
            }
        }
        return arrayList;
    }
    /*
    This method will return the empty array.
     */
    public boolean arrayEmpty(List<String> expectedString )
    {
        expectedString.clear();
        if( expectedString.isEmpty())
        {
            return true;
        }
        return false;
    }
}
