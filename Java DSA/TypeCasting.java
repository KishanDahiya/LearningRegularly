public class TypeCasting{
    public static void main(String[] args){
        // Link : https://www.geeksforgeeks.org/type-conversion-java-examples/
        System.out.println(Math.pow(2, 3));
        double exp = Math.pow(2, 3);
        int r = (int)exp; //Narrowing
        double rr = r; //Widenning
        System.out.println(rr);
    }
}