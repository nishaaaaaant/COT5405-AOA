import java.util.Scanner;

public class task6 {

    public static int start=0, end=0;
    void function() {
        
        //taking the input from the user
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] array=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 //reading array elements from the user 
                array[i][j]=in.nextInt();
            }
        }
        int maximumSum=Integer.MIN_VALUE, l=0, r=0,top=0, bottom=0, currentRight, currentLeft, i, j, sum;
        for(currentLeft=0;currentLeft<n;currentLeft++){
            int[] temp= new int[m];
                for(i=0;i<m;i++){
                    temp[i]=0;
                }
            for(currentRight=currentLeft; currentRight<n; currentRight++){
                for(i=0;i<m;i++){
                        temp[i]=temp[i]+array[i][currentRight];
                }
                sum= maxSubArray(temp, m);

                if(sum>maximumSum){
                maximumSum=sum;
                l=currentLeft+1;
                r=currentRight+1;
                top=start+1;
                bottom=end+1;
                }
            }
        }
        System.out.println(top+" "+l+" "+bottom+" "+r+" "+maximumSum);
        in.close();
    }

    public static int maxSubArray(int[] A, int n){
        int maximumSum= A[0];
        int currentSum=A[0];

        for(int i=1;i<n;i++){
            if(A[i]<currentSum+A[i]){
                currentSum=currentSum+A[i];
                if(maximumSum<currentSum){
                    maximumSum=currentSum;
                    end=i;
                }
            }
            else
            {
                currentSum=A[i];
                if(maximumSum<currentSum){
                    maximumSum=currentSum;
                    start=i;
                    end=i;
                }
            }
        }
        return maximumSum;
    }
}
