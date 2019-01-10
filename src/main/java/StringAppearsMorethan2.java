import java.util.HashMap;
import java.util.Map;

public class StringAppearsMorethan2 {

    public Map<String,Boolean> stringAppears( String originalArray[] )
    {
        if( originalArray == null || originalArray.length == 0 )
        {
            return null;
        }
        Map<String ,Boolean > stringMap=new HashMap<String, Boolean>();
        int count;
        for( String subString : originalArray )
        {
            count=0;
            stringMap.put(subString,false);
            for(String subString2 : originalArray )
            {

                if( subString.equals(subString2))
                {
                    count++;
                    if( count == 2 )
                    {
                        stringMap.put(subString,true);
                        break;
                    }
                }
            }
        }
        return stringMap;
    }
}
