    // Write a Java program using a LinkedHashSet to store integer values.
    // Perform the following operations:
    // 1. Add at least 4 integers to the set.
    // 2. Remove an integer from the set.
    // 3. Calculate and print the sum of all the integers in the set.
    // 4. Use an Iterator to print the elements of the set.


import java.util.Iterator;
import java.util.LinkedHashSet;
class LinkedHashSetDemo{
    void linkedHashsetMethod(){
        LinkedHashSet <Integer>lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(30);
        lhs.add(60);
        lhs.add(80);
        System.out.println(lhs);
        lhs.remove(30);

		int sum=0;
		for(Integer x : lhs) {
			sum += x;
		}

		System.out.println("The sum is :" + sum);

		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashsetMethod();
    }
}