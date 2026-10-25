public class test {
    public static void main(String args[]){
        int arr[] ={2,6,3,4,7};
        int max = Integer.MIN_VALUE;
        int var = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] > max){
                var = max;
                max = arr[i];  
            }
            else if( arr[i] > var && arr[i] < max){
                var = arr[i];
            }
        }
        System.out.print("THe 2nd largest element will be " +var);
    }
}

// reverse an arrray 
int arr[] = {2,6,3,4,7}; // array of length 5
int i = 0 , j = arr.length -1 ;
// arr.length == size of array = 5 
// i == start element 
// j = ending element
// loop while start is less than end
while( i < j){
    int temp = arr[i]; // start wala dabba empty 
    arr[i] = arr[j]; // start wala dabba me end  to end wala dabba khali
    arr[j] = temp;
    i++;
    j--;
}