import java.util.Scanner;

public class Program01 {
    static CostCal cc = new CostCal();
    public static int menu(Scanner sc){
        System.out.println("0. Exit");
        System.out.println("1. Calculate total expenditure");
        System.out.println("2. Generate total expenditure");
        System.out.println("Enter the Choice");
        return  sc.nextInt();

    }
    public static void inputData(Scanner sc){
        System.out.println("Enter Total miles per day");
        cc.setKm(sc.nextDouble());
        System.out.println("Enter Toll fees");
        cc.setTollFee(sc.nextDouble());
        System.out.println("Enter Parking fees");
        cc.setParkingFee( sc.nextDouble());
        System.out.println("Enter Avg of your vehicle");
        cc.setAvgMiledPerGal( sc.nextDouble());
        System.out.println("Enter price of petrol");
        cc.setCostPerGal( sc.nextDouble());
    }
    public static void giveOutput(){
        double d = cc.getCostPerGal();
        double e = cc.getKm();
        double f = cc.getAvgMiledPerGal();
        double g = cc.getTollFee();
        double h = cc.getParkingFee();

        double cost = e/f;
        double tot = cost *d;
        System.out.println("your daily expenditure is : " + (tot +h+g ));




    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        while((choice = menu(sc)) != 0){
            switch (choice){
                case 1 :
                    inputData(sc);
                    break;
                case 2 :
                    giveOutput();

            }
        }

    }
}
