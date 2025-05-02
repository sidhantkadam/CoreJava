package ObjectCreationMethods;

class MyProfile {

    public MyProfile() {
        System.out.println("No arg constructor..");
    }
}

public class UsingNewInstanceClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> classObj = Class.forName("ObjectCreationMethods.MyProfile");
        MyProfile profile = (MyProfile) classObj.newInstance();
        MyProfile profile1 = (MyProfile) classObj.newInstance();
        System.out.println(profile==profile1);
    }
}
