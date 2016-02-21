package Home_Work_2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie_5 {
    public void Execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite dva chisla: ");
        double chislo1 = scanner.nextDouble();
        double chislo2 = scanner.nextDouble();
        double a = abs(10 - chislo1);
        double b = abs(10 - chislo2);
        if (a == b)
        {
            System.out.println("chisla "+chislo1+" i "+chislo2+" ravnoudalenu ot 10");
        }
        else if (a > b) {
            System.out.println("chislo "+chislo2+" blizhe k 10");
        }
        else {
            System.out.println("chislo "+chislo1+" blizhe k 10");
        }
    }
}
