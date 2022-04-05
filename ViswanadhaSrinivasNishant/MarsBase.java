import java.util.Scanner;

public class MarsBase {
    public static void main(String[] args) {
        switch(args[0]){
            case "1":
            new task1().function();
            break;
            case "2":
            new task2().function();
            break;
            case "3a":
            new task3a().function();
            break;
            case "3b":
            new task3b().function();
            break;
            case "4":
            new task4().function();
            case "5":
            new task5().function();
            case "6":
            new task6().function();
        }
    }
}
