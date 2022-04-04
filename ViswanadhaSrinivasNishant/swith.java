import java.util.Scanner;

public class swith {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] array = new int[n];
        for(int i=0; i<n; i++)  
        {     
            //reading array elements from the user   
            array[i]=in.nextInt();  
        }  
        
        String taskInput;
        switch (taskInput) {
            case "1":
                task1();
                break;
            case "2":
                task2();
                break;
            case "3a":
                task3a();
                break;
            case "3b":
                task3b();
                break;
            case "4":
                task4();
                break;
            case "5":
                task5();
                break;
            case "6":
                task6();
                break;
            default:
                // code block
        }
    }
}
