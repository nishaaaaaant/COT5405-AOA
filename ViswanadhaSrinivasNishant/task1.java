import java.util.Scanner;
class task1 {
    void function() {
        
        // taking the input from the user
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] array = new int[n];
        for(int i=0; i<n; i++)  
        {     
            //reading array elements from the user   
            array[i]=in.nextInt();  
        } 
        in.close();

        // code logic
        // defining a result variables
        int leftIndex = -1;
        int rightIndex = -1;
        int maximumSum = Integer.MIN_VALUE;


        // this loop is specifying the left pointer and the left most element i
        for (int i=0; i<n; i++) {
            // this loop is specifying the right pointer and the left most element j
            for (int j=i; j<n; j++) {
                // we are initiating current sum
                int currentSum = 0;
                // this loop is calculating the sum
                for (int k=i; k<=j; k++) {
                    currentSum += array[k];
                }
                // comparing the current sum with the maximum recorded sum,
                // update the value of maximum sum with currentsum
                if (currentSum > maximumSum) {
                    leftIndex = i;
                    rightIndex = j;
                    maximumSum = currentSum;
                }
            }
        }

        // output
        System.out.println(leftIndex+" "+rightIndex+" "+maximumSum);
    }
}