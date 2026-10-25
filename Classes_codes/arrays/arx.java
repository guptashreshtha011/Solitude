import java.util.*;
//wap to create an array list of intergers add 10 elements remove 2 elements and display the final list using iterator
public class arx {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i); 
        }
        numbers.remove(0); 
        numbers.remove(0); 
        System.out.println("Final list after removals:");
        Iterator<Integer> itr = numbers.iterator();
        System.out.println("final list" +numbers);
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
