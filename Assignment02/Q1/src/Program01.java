import java.util.Scanner;

public class Program01 {
    public static int menu(Scanner sc){
        System.out.println("0. Exit and Generate Bill");
        System.out.println("1. Samosa : 20rs");
        System.out.println("2. Dosa 25rs");
        System.out.println("3. Idli 30rs");
        System.out.println("Enter choice");
        return  sc.nextInt();

    }
    static int totalPrice;
    public  static void quantity(Scanner sc,int num){
        int qua = 0 ;

        System.out.println("Enter the quantity");
        qua = sc.nextInt();
        totalPrice += qua*num;
        System.out.println("price : " + totalPrice);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int   tot = 0;
        while((choice= menu(sc))!= 0){
            switch (choice) {
                case 1:
                    quantity(sc,20);
                    break;
                case 2:
                    quantity(sc,25);
                    break;
                case 3:
                    quantity(sc,30);
                    break;
            }

        }
        System.out.println("Bill Is : "  +totalPrice);

    }
}
