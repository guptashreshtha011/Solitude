// 1st
import java.util.Scanner;
public class Strings {
    public static void charp(String name){
        for(int i = 0 ; i< name.length() ; i++){
            System.out.println(name.charAt(i));
        }
    }
    public static boolean checkpalindrome(String str){
        
        int n = str.length();
        for(int i = 0 ; i< n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1) ){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'a' , 'b' , 'c' ,'d'};

        String st1 = "abcd";
        //  both are same on program level but different on implementation 
        String st2 = new String("abc");
        // strings are immutable 

        // resolving yellow
        System.out.println(arr[1] +"and " +st2);

        String name ;
        name = sc.next();
        //this only takes single word not a line ont after space
        //  use  sc.nextLine();

        String fullName = "Tony Stark";
        System.out.print(fullName.length());
        // here .length() is a function 
        //it also counts spaces
        // where as in array .length is a property

        //concatination
        String first = "jay";
        String last = "gupta";
        String full = first + " " + last;
    
        System.out.println(full);
        // inside the print function when we print multiple things using + sign
        // concatination is also happening there as well

        // charAt() method is used to find character at a given index of string
        System.out.println(full.charAt(3));

        //to print all character of a string we can use 
        // charAt and create a new method 
        charp(name);
        charp(st1);

        // check if a string is palindrome
        String str = "noon";
        System.out.println(checkpalindrome(str));

        sc.close();

    }
}