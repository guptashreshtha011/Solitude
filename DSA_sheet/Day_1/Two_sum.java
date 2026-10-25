public class Two_sum {

    public static void brute(int target, int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println(
                        "The index of the elements will be : (" + i + "," + j + ")"
                    );
                    return;
                }
            }
        }

        System.out.println("Not found");
    }

    public static void optimal(int target, int arr[]) {
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while(i < j) {

            if(arr[i] + arr[j] == target) {
                System.out.println(
                    "The index of the elements will be : (" + i + "," + j + ")"
                );
                return;
            }

            if(arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println("Not found");
    }
    public static void pairs(){
       

    }

    public static void main(String args[]) {

        int arr[] = {3, 7, 10, 17, 21};
        int target = 13;

        brute(target, arr);
        optimal(target, arr);
    }
}