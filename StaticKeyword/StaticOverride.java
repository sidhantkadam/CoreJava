package StaticKeyword;


class MainOne {
    static int age = 30;
    static void getAge() {
        System.out.println(10+20+"age"+10+20);
    }
}

class SubMain extends MainOne {

    public String print(){
        return "Age of person : ";
    }
}

public class StaticOverride {
    public static void main(String[] args) {
    SubMain main = new SubMain();
        System.out.println(main.print());
    MainOne.getAge();
    SubMain.getAge();
    }
}
