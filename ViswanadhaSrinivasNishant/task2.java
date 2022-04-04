import java.util.Scanner;
class task2 {
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
        // we are defining a 2D array to store sum of all possible subarrays
        int[][] dp = new int[n][n];

        // this loop is specifying the left pointer and the left most element i
        for (int i=0; i<n; i++) {
            // we are initiating current sum
            int currentSum = 0;
            // this loop is specifying the right pointer and the left most element j
            for (int j=i; j<n; j++) {
                currentSum += array[j];
                dp[i][j] = currentSum;
            }
        }
        
        // defining a result variables to store the calculated values
        int maximumSum = Integer.MIN_VALUE;
        int leftIndex = -1;
        int rightIndex = -1;

        // here we are searching the solution in dp array
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (dp[i][j] > maximumSum) {
                    maximumSum = dp[i][j];
                    leftIndex = i;
                    rightIndex = j;
                }
            }
        }

        // output
        System.out.println(leftIndex+" "+rightIndex+" "+maximumSum);
    }
}