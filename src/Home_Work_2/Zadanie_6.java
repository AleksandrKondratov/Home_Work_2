package Home_Work_2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie_6 {
    public void Execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite kateti: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("S= "+(a*b)/2);
        double c=sqrt(a*a+b*b);
        System.out.println("P= "+ (a+b+c));
    }
}
