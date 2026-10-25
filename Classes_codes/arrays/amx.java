import java.util.*;
//wap to create a map that store employee Id and name add 5 enteries to map delete and display the enteries of 
//map

public class amx {
    public static void main(String args[]) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(10, "Shreshtha");
        mp.put(11, "Shubham");
        mp.put(12, "Honey");
        mp.put(13, "Yashvi");
        mp.put(14, "Shreeya");
        mp.remove(10);
        for (Map.Entry<Integer, String> entry : mp.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}