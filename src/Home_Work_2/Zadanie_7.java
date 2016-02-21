package Home_Work_2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie_7 {
    public void Execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite 3 chisla: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double d = b*b-4*a*c;
        if(d >= 0) {
            double x1 = (-b + sqrt(d))/(2*a);
            double x2 = (-b - sqrt(d))/(2*a);
            System.out.println("x1 = "+x1+", x2 = "+x2);
        } else {
            System.out.println("kornej ne imeet");
        }
    }
}
