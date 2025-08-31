import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the num");
        if(!sc.hasNextDouble()){
            System.out.println("wrong input");
            return;
        }

        double num = sc.nextDouble();
        if(!sc.hasNextDouble()){
            System.out.println("Wrong input");
        }

        double num2 = sc.nextDouble();

        System.out.println("avg is : "  + ((num+num)/2));

    }
}
