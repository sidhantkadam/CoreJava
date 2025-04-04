package OPPs;

class Info {
    private String name;
    private int id;
    private long mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "OPPs.Info: " + "\n" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mobile=" + mobile;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Info info = new Info();
        info.setId(1);
        info.setMobile(878748734);
        info.setName("Shubham");
        System.out.println(info);
    }
}
