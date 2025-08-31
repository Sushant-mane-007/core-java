import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Integer i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuumber");
        i = sc.nextInt();
        System.out.println("Given number : " +i );
        System.out.println("Binary equivalent : "+ Integer.toBinaryString(i));
        System.out.println("Octal equivalent : " + Integer.toOctalString(i));
        System.out.println("Hexa equivalent : " + Integer.toHexString(i));



    }

}
