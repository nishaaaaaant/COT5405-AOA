import java.util.Scanner;

public class task4 {
    void function() {
        //taking the input from the user.
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] array = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j]=in.nextInt();
            }
        }

        int maximumSum=Integer.MIN_VALUE, row1=1, row2=1, column1=1, column2=1, temporarySum;

        for(int a=0;a<m;a++){ //row of the starting position
            for(int b=0;b<n;b++){ //column of the starting position

                for(int c=a;c<m;c++){ //row of the ending position
                    for(int d=b;d<n;d++){ //column of the ending position
                        temporarySum=0;
                        for(int i=a;i<=c;i++){ //iterating from row a to row c
                            for(int j=b;j<=d;j++){ // iterating from column b to column d 
                                temporarySum += array[i][j];
                            }
                        }

                        if(temporarySum>maximumSum){
                            maximumSum=temporarySum;
                            row1=a+1;
                            column1=b+1;
                            row2=c+1;
                            column2=d+1;
                        }
                    }

                }
            }
        }
        System.out.println(row1+" "+column1+" "+row2+" "+column2+" "+maximumSum);
        in.close();
    }
}
