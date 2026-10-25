// 2nd
public class Strt {
    public static void main(String args[]){
        // given a route contaning 4(n,s,e,w) directions find the shortest path to reach destination
       
        String path = "WNEENESENNN";
        int n = path.length();
        int x = 0 , y = 0;
        for(int i  = 0 ; i< n ; i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y +=1;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        System.out.println(Math.sqrt(x2 + y2));

        //string comparison 
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
        // both s1 and s2 are pointing same string
        if(s1 == s2){
            System.out.println("string are equal");
        }
        else{
            System.out.println("not equal");
        }

        // interning concept 
        // s3 creates a new seprate string
        // we use (s1.equals(s3)) it compares values // as it is more reliable than == 
        if(s1 == s3){
            System.out.println("string are equal");
        }
        else{
            System.out.println("not equal");
        }

        // substrings function last index not included
        String str = "hello world";
        // str.substring(0,5);
        // do it with a loop as well
        for(int i = 0 ; i< 5 ; i++){
            System.out.println(str.charAt(i));
        }

        // largest string in lexogriphically order

        // we will use compareTo function
        // if compareTo returns 0 then strings are equal
        // if less than 0 then st1 < st2
        // if more than 0 then st1 > st2
        // compareToIgnoreCase -> it treates upper case and lower case as equals

        String fruits[] = {"apple" , "banana" , "orange" };
        String largest = fruits[0];
        for(int i = 1 ; i< fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i]) <0 ){

                largest = fruits[i];
            }

        }
        System.out.println(largest);


    }
}
