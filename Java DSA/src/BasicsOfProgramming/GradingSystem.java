package BasicsOfProgramming;
import java.util.*;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Enter the base : ");
        int b = sc.nextInt();
        int d = toDecimal(n,b);
        System.out.println("The number is : "+d);
    }
    public static int toDecimal(int n, int b){
        int multiplier=0,ans=0;
        while(n>0){
            int remainder=n%10;
            n=n/10;
            ans+=remainder*Math.pow(b,multiplier);
            multiplier++;
        }
        return ans;
    }
}
