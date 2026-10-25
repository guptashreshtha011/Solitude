import java.util.*;
public class four {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         List<String> list = new ArrayList<>();
        // Adding elements to the ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");
        // Printing the elements of the ArrayList
        System.out.println(list);
        // list is mutable 
        // it ovedrwrits at index 1
        list.add(1,"C/c#");
        for(String lst : list){
            System.out.println(lst);
        }
        System.out.println(list.indexOf("Ram"));
        //System.out.println(list.getFirst);
        System.out.println(list.contains("Ram"));
        sc.close();
    }
    
}
