package SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
    public static void main(String[] args) {


        try {
            Boy boy = new Boy("Shubham", 50,"Nashik","School");

            FileOutputStream input  = new FileOutputStream("F:/BackEnd/Projects/Core Java/SerializationAndDeserialization/output.txt");

            ObjectOutputStream outputStream = new ObjectOutputStream(input);

            outputStream.writeObject(boy);
            System.out.println("Object is created in output.txt file");
            outputStream.close();
            input.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
