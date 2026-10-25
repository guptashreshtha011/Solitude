// given an array of element of size n if the frequency of an element is greater 
public class Majority_element {
    public static void main(String args[]){
        int ary[] = {1,2,3,4,5};
        int count = 0;
        for(int i = 0 ; i< ary.length ; i++){
            for(int j = 0 ; j< ary.length ; j++){
                System.out.println("("+ary[i]+","+ary[j]+")");
                count ++;
            }
        }
        System.out.println(count);
    }
}
