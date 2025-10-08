package Equal_Equal_To;

import java.util.Objects;

public class EqualityComparison {

    // --- Custom Class without Overriding equals() and hashCode() ---
    static class PersonDefault {
        String name;
        int age;

        public PersonDefault(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "PersonDefault{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }

    // --- Custom Class WITH Overriding equals() and hashCode() ---
    static class PersonCustomEquals {
        String name;
        int age;

        public PersonCustomEquals(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "PersonCustomEquals{" + "name='" + name + '\'' + ", age=" + age + '}';
        }

        @Override
        public boolean equals(Object o) {
            // 1. Same object reference check (optimization)
            if (this == o) return true;
            // 2. Null check and Class type check (robustness)
            if (o == null || getClass() != o.getClass()) return false;
            // 3. Cast to the correct type
            PersonCustomEquals that = (PersonCustomEquals) o;
            // 4. Compare relevant fields for logical equality
            return age == that.age && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            // Must be overridden when equals() is overridden
            // Ensures that if a.equals(b), then a.hashCode() == b.hashCode()
            return Objects.hash(name, age);
        }
    }


    public static void main(String[] args) {

        System.out.println("--- 1. Primitives (== compares value) ---");
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println("a == b: " + (a == b)); // true (10 is equal to 10)
        System.out.println("a == c: " + (a == c)); // false (10 is not equal to 20)
        System.out.println("----------------------------------------\n");


        System.out.println("--- 2. String Literals (== vs. equals()) ---");
        String s1 = "hello"; // String Literal Pool
        String s2 = "hello"; // Same literal, refers to same object in pool
        String s3 = new String("hello"); // New object on heap, even if content is same
        String s4 = new String("hello"); // Another new object on heap

        System.out.println("s1: " + System.identityHashCode(s1) + ", s2: " + System.identityHashCode(s2));
        System.out.println("s3: " + System.identityHashCode(s3) + ", s4: " + System.identityHashCode(s4));
        System.out.println("(Identity hash codes are often memory addresses, but not guaranteed)");

        // == for Strings (compares references)
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same object in pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (s1 in pool, s3 on heap)
        System.out.println("s3 == s4: " + (s3 == s4)); // false (two different objects on heap)

        // equals() for Strings (compares content - overridden in String class)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true (content is "hello")
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (content is "hello")
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true (content is "hello")
        System.out.println("----------------------------------------\n");


        System.out.println("--- 3. Custom Objects (Default equals() and hashCode()) ---");
        PersonDefault pd1 = new PersonDefault("Alice", 30);
        PersonDefault pd2 = new PersonDefault("Alice", 30); // Same content, but new object
        PersonDefault pd3 = pd1; // pd3 refers to the same object as pd1

        // == for custom objects (compares references)
        System.out.println("pd1 == pd2: " + (pd1 == pd2)); // false (different objects in memory)
        System.out.println("pd1 == pd3: " + (pd1 == pd3)); // true (same object in memory)

        // equals() for custom objects (default implementation compares references)
        System.out.println("pd1.equals(pd2): " + pd1.equals(pd2)); // false (default equals() is like ==)
        System.out.println("pd1.equals(pd3): " + pd1.equals(pd3)); // true (default equals() is like ==)
        System.out.println("----------------------------------------\n");


        System.out.println("--- 4. Custom Objects (Overridden equals() and hashCode()) ---");
        PersonCustomEquals pce1 = new PersonCustomEquals("Bob", 25);
        PersonCustomEquals pce2 = new PersonCustomEquals("Bob", 25); // Same content, but new object
        PersonCustomEquals pce3 = new PersonCustomEquals("Charlie", 30); // Different content
        PersonCustomEquals pce4 = pce1; // pce4 refers to the same object as pce1

        // == for custom objects (compares references)
        System.out.println("pce1 == pce2: " + (pce1 == pce2)); // false (different objects)
        System.out.println("pce1 == pce4: " + (pce1 == pce4)); // true (same object)

        // equals() for custom objects (overridden to compare content)
        System.out.println("pce1.equals(pce2): " + pce1.equals(pce2)); // true (content is same based on our logic)
        System.out.println("pce1.equals(pce3): " + pce1.equals(pce3)); // false (content is different)
        System.out.println("pce1.equals(pce4): " + pce1.equals(pce4)); // true (same object is always equal to itself)
        System.out.println("----------------------------------------\n");

        System.out.println("--- 5. Hash Codes (Important when overriding equals()) ---");
        System.out.println("pce1 HashCode: " + pce1.hashCode());
        System.out.println("pce2 HashCode: " + pce2.hashCode());
        System.out.println("pce3 HashCode: " + pce3.hashCode());
        // Notice pce1 and pce2 have the same hash code because their content is equal
        System.out.println("----------------------------------------\n");
    }
}
