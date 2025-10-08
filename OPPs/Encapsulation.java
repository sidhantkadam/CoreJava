package OPPs;

    /*
        It is defined as the wrapping up of data under a single unit.
        It is the mechanism that binds together the code and the data it manipulates
    */

class Info {

    private final String name;
    private final int id;
    private final long mobile;

    Info(String name, int id, long mobile) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public long getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "OPPs.Info: " + "\n" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mobile=" + mobile;
    }

    final void move(){
        System.out.println("Moving");
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Info info = new Info("Shubham", 1, 878748734);
        System.out.println(info);
        info.move();
    }
}
