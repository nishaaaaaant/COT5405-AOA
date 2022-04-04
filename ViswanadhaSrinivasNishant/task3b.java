import java.util.Scanner;
public class task3b {
    public static void main (String args[]) {
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
        // here we are defining a variable to store maximum sum obtained after each iteration.
        int dp = array[0];
        int currentSum = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        // this loop is specifying the left pointer and the left most element i
        for (int i=0; i<n; i++) {
            if (currentSum < 0) {
                // we do not need to include the previous array if the currentSum is less than zero beacuse on adding its sum will only result in a decrement of maximum sum.
                currentSum = array[i];
                // we are setting  dp = max(currentSum, dp)
                if (currentSum > dp) {
                    dp = currentSum;
                    leftIndex = i;
                    rightIndex = i;
                }
            } else {
                currentSum += array[i];
                // we are setting  dp = max(currentSum, dp)
                if (currentSum > dp) {
                    dp = currentSum;
                    rightIndex = i;
                }
            }
        }
        
        // output
        System.out.println(leftIndex+" "+rightIndex+" "+dp);
    }
}
