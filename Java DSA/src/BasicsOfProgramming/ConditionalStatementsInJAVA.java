package BasicsOfProgramming;
import java.util.*;

public class ConditionalStatementsInJAVA {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        System.out.println("Hardwork is better than smart work");
    }
}
