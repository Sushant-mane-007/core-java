import com.app.geometry.Point2D;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Point2D p = new Point2D(12,13);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate : ");
        p.setX( sc.nextDouble());
        System.out.println("Enter y coordinate : ");
        p.setY(sc.nextDouble());
        p.display();
        System.out.println(p.isEqual());
        p.calculateDistance();




    }
}
