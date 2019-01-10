import java.util.*;

public class SortingSet {

    public List<String> setSorting(HashSet originalSet )
    {
        if( originalSet == null)
        {
            return null;
        }
        TreeSet sortedSet= new TreeSet();
        sortedSet.addAll(originalSet);
        List<String> setList = new ArrayList<String>();
            setList.addAll(sortedSet);
        return setList;
    }
}
