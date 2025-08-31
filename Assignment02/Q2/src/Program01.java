import java.util.Scanner;

public class Program01 {
    static double price;
    static Invoice ic = new Invoice();
    public static int menu(Scanner sc){
        System.out.println("0. Exit");
        System.out.println("1. Enter the Quantity : ");
        System.out.println("2. Generate the invoice : ");
        System.out.println("Enter the choice : ");
        return  sc.nextInt();
    }

    public static void intakeQuan(Scanner sc){
        System.out.println(" Enter the Quantity of the item u want : ");
        ic.setQuantity(sc.nextInt());


    }
    public static void displayInvoice(){
        System.out.println("Your invoice is ");
        System.out.println(ic.toString());
        System.out.println("total bill : " + (ic.getQuantity()*ic.getPrice()));

    }
    public static void intakePrice(Scanner sc){
        System.out.println("Enter the price of product");
        double d = sc.nextDouble();
        ic.setPrice(d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while((choice = menu(sc)) != 0){
            switch (choice){
                case 1 :
                    intakeQuan(sc);
                    intakePrice(sc);
                    break;
                case 2:
                    displayInvoice();
                    break;
                default:
                    System.out.println("Enter correct option!!!!!!!!!!!!!!!!");
            }
        }
    }
}
