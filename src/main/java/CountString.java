import java.util.HashMap;
import java.util.Map;

public class CountString {

    public Map<String,Integer> countNumOfString(String originalString)
    {
        Map<String,Integer> mapValue=new HashMap<String ,Integer>();
        String[] splitString=originalString.split("one",-1);
        mapValue.put("one",splitString.length-1);
        splitString=originalString.split("two",-1);


        mapValue.put("two",splitString.length-1);
        splitString=originalString.split("three",-1);

        mapValue.put("three",splitString.length-1);

        return mapValue;

    }
}
