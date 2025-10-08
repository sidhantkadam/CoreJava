package Java9AndBeyond;

import java.util.LinkedHashMap;
import java.util.List;

public class LocalVariableTypeInferenceExample {
    public static void main(String[] args) {
        var list = List.of("abc", "def", "hij");

        for (var person : list) {
            System.out.println(person);
        }

        var hashMap = new LinkedHashMap<>();
        hashMap.put("Name", "Sanjay");
        hashMap.put("Address", "Dange Chowk");
        hashMap.put("Postal code", "422009");

        for (var personDetails : hashMap.entrySet()) {
            System.out.println(personDetails.getKey() + ":" + personDetails.getValue());
        }
    }
}
