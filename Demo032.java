/* Java program using a HashSet to store the names of countries. 
Add at least 6 different countries to the set and
print the contents of the set. */

import java.util.HashSet;

class HashSetDemo2 {

    void HashsetMethod() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("INDIA");
        hashSet.add("ITALY");
        hashSet.add("ROMANIA");
        hashSet.add("FRANCE");
        hashSet.add("EGYPT");
        hashSet.add("SOUTH KOREA");
        System.out.println(hashSet);
    }

}

public class Demo032 {
    public static void main(String[] args) {
        HashSetDemo2 obj = new HashSetDemo2();
        obj.HashsetMethod();
    }
}