import java.util.Scanner;
public class task3a {
    static int dp = Integer.MIN_VALUE;
    static int leftIndex = 0;
    static int rightIndex = 0;

    // defining the findMaximumSum function
    public static int findMaximumSum (int i, int[] arr) {
        if (i == arr.length-1) {
            if (arr[i] > dp) {
                dp = arr[i];
                rightIndex = i;
            }
            return arr[i];
        }
        // we are initiating current sum
        int currentSum = 0;
        int temp = arr[i] + findMaximumSum(i+1, arr);
        if (arr[i] > temp) {
            currentSum = arr[i];
            if (currentSum > dp) {
                dp = currentSum;
                leftIndex = i;
                rightIndex = i;
            }
        } else {
            currentSum = temp;
            if (currentSum > dp) {
                dp = currentSum;
                leftIndex = i;
            }
        }
        return currentSum;
    }
    public static void main (String args[]) {
        // defining inputs
       // taking the input from the user
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int [] array = new int[n];
       for(int i=0; i<n; i++)  
       {     
           //reading array elements from the user   
           array[i]=in.nextInt();  
       }

        // code logic
        // here we are calling recursion function 
        int sum = findMaximumSum(0, array);
        if (sum > dp) {
            dp = sum;
        }
        
        // output
        System.out.println(leftIndex+" "+rightIndex+" "+dp);
    }
}