package CollectionsFramework.CollectionInterface;

import java.util.*;

class Emp {
    String fName;
    String lName;

    public Emp(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }


}

class CompareByFName implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.fName.compareTo(o2.fName);
    }
}

public class EmployeeHashMap {
    public static void main(String[] args) {
        List<Emp> li = new ArrayList<>();
        Emp e1 = new Emp("sid", "k");
        Emp e2 = new Emp("pra", "k");
        Emp e3 = new Emp("adi", "k");

        li.add(e1);
        li.add(e2);
        li.add(e3);

        CompareByFName fName = new CompareByFName();
        Collections.sort(li, fName);
    }
}
