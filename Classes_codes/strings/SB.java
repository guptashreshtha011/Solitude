// 3rd
public class SB {
    public static void main(String args[]){
        String s1 = "tony";
        String s2 = "tony";
        // these 2 are stored in aheap called intern pool / string pool and bothe s1 and s2 are storing reference 
        // and there is only one original string tony inside pool/heap s1 and a2 are in reference stack

        String s3 = new String("tony");

        // resolving yellow
        System.out.println(s1 + s2 + s3);
        // when we use new key word wheteher this string existed or not a new one willl be craeted inside the pool
        // s3 will be inside the refrence stack storing the newly created string refrence 
        // understanding interning

        // here comes the biggest problem with the string
        // if we change something in a string we have to again save it and the new saved variable now stored the refrence 
        // of the newely muatated string this increase both time and space complexity
        // that's where string builder came for the resque 
        // in this we can change/ muatate the string 

        StringBuilder sb = new StringBuilder("Hello World!");
        // well the string builder is not actually a string but we can convert it into one
        sb.toString();
        // now this function converts any object into a string 
        // remember i said object not variable
        // almost all string function works with string builder too

        for(char i = 'a' ; i<= 'z'; i++ ){
            sb.append(i);
        }
        System.out.println(sb);

        // Q. for a given string conver first letter of each word into upper case
        String sbq = "hi, i am shreshtha gupta.";
        StringBuilder n = new StringBuilder("");
        char ch = Character.toUpperCase(sbq.charAt(0));
        n.append(ch);
        for(int i = 1 ; i< sbq.length(); i++){
            if(sbq.charAt(i) == ' ' && i < sbq.length() -1){
                n.append(sbq.charAt(i));
                i++;
                n.append(Character.toUpperCase(sbq.charAt(i)));

            }
            else{
                n.append(sbq.charAt(i));
            }
        }
        n.toString();
        System.out.println(n);

        // Q. string compression

        // aaabbccc -> a3b2c3 // abc -> abc

        String ori = "aabbbccdd";
        String nay = "";
    
        for(int i = 0; i< ori.length(); i++){
            Integer count = 0;
            nay += ori.charAt(i);
            while( i < ori.length() - 1 && ori.charAt(i) == ori.charAt(i+1) ){
                count++;
                i++;
            }
            if(count > 1){
                nay += count.toString();
            }
            
        }
        System.out.println(nay);

    }
}
