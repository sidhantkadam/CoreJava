package SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

    /*
    Serialization in Java is the process of converting an object's state into a byte stream.
    This byte stream can then be saved to a file, transmitted over a network, or stored in
    a database. The reverse process, converting the byte stream back into a copy of the
    original object, is called deserialization.
    */

public class SerializationClass {
    public static void main(String[] args) {
        try {
            Boy boy = new Boy("Shubham", 50, "Nashik", "School");

            FileOutputStream output = new FileOutputStream("output.txt");

            ObjectOutputStream outputStream = new ObjectOutputStream(output);

            outputStream.writeObject(boy);
            System.out.println("Object is created in output.txt file");
            outputStream.close();
            output.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
