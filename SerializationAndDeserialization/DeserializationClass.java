package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("F:/BackEnd/Projects/Core Java/SerializationAndDeserialization/output.txt");
             ObjectInputStream inputStream = new ObjectInputStream(input)) {
            Boy boy = (Boy) inputStream.readObject();
            boy.print();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
