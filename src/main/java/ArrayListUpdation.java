import java.util.List;

public class ArrayListUpdation {

    public List<String> arrayUpdate(List<String> arrayList)
    {
        if( arrayList.contains("Apple") || arrayList.contains("Melon"))
        {
            for( int i=0 ; i< arrayList.size() ; i++ )
            {
                if(arrayList.get(i) == "Apple")
                {
                    arrayList.set(i,"Kiwi");
                }
                if(arrayList.get(i) == "Melon")
                {
                    arrayList.set(i,"Mango");
                }
            }
        }
        return arrayList;

    }
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
