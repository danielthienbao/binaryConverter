/*DO NOT CHANGE THIS FILE */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer you want to convert");
        int num = scan.nextInt();
        Value val = new Value(num);
        val.printBinary();
    }
}
