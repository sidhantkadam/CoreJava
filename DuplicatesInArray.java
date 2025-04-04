
//  3 4 5 3 4 5 6 2 1

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray
{
    public static List<Integer> findDuplicate(int [] a)
    {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j< a.length;j++)
            {
                if(a[i] == a[j])
                {
                    if(!res.contains(a[i]))
                    {
                        res.add(a[i]);
                    }
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int [] a = {3,4,5,3,4,5,6,2,1};
        System.out.println(findDuplicate(a));
    }
}
