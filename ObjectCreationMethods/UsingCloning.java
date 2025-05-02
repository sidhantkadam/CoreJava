package ObjectCreationMethods;

class Original implements Cloneable {
    int org;

    public Original(int org) {
        this.org = org;
        System.out.println("Object with " + org + " number");
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class UsingCloning {
    public static void main(String[] args) {
        Original orgObject = new Original(10);
        Original clone = (Original) orgObject.clone();
        System.out.println(orgObject.org);
        System.out.println(clone.org);
        System.out.println(orgObject == clone);
    }
}
