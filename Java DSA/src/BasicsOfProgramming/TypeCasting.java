package BasicsOfProgramming;

public class TypeCasting {
    public static void main(String[] args) {
        // Link : https://www.geeksforgeeks.org/type-conversion-java-examples/

        System.out.println(Math.pow(2, 3));
        double exp = Math.pow(2, 3);
        int r = (int)exp; //Narrowing means converting from larger datatype to smaller datatype.
        System.out.println(r);
        double rr = r; //Widenning means converting from smaller datatype to larger datatype.
        System.out.println(rr);
    }
}
