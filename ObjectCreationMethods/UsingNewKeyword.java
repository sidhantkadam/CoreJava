package ObjectCreationMethods;

    /*
    Common Approach
    */

class HumanBeing {
    String humanType;

    public HumanBeing(String humanType) {
        this.humanType = humanType;
    }

    public void display() {
        System.out.println("Type of human : " + humanType);
    }
}

public class UsingNewKeyword {
    public static void main(String[] args) {

        HumanBeing humanBeing = new HumanBeing("Animal");
        humanBeing.display();
    }
}
