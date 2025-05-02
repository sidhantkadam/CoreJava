package ObjectCreationMethods;

import java.io.*;

class ObjectClass implements Serializable {
    String str;
    int number;

    public ObjectClass(String str, int number) {
        this.str = str;
        this.number = number;
    }
}

public class UsingSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectClass aClass = new ObjectClass("abc", 80);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("txt.txt"));
        outputStream.writeObject(aClass);
        outputStream.close();

        System.out.println("Serialized data id saved in txt file");

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("txt.txt"));

        ObjectClass newObj = (ObjectClass) inputStream.readObject();      //New object created
        System.out.println("Deserialized Data : " + newObj.str + " " + newObj.number);
        inputStream.close();
    }
}
