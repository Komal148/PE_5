import java.util.Iterator;
import java.util.Map;

public class TwoKeyValue {

    public Map<String,String> changeTwoKeyValue( Map<String,String> originalMap)
    {
        Iterator<Map.Entry<String,String> > iterator=originalMap.entrySet().iterator();
        String eachKeyInMap="";
        String value="";
        int flag=0;
        if( !iterator.hasNext() )
        {
            return null;
        }

        while( iterator.hasNext() )
        {
            Map.Entry<String,String> myEntry=iterator.next();
            eachKeyInMap=(String) myEntry.getKey();
           // System.out.println(eachKeyInMap);
            if( eachKeyInMap != null && flag == 0)
            {
                value = (String) myEntry.getValue();
                originalMap.put(eachKeyInMap," ");
                flag=1;
            }

            else if( eachKeyInMap != null  && flag ==1 )
            {
                originalMap.put(eachKeyInMap,value);
            }
        }
        return originalMap;

    }
}
