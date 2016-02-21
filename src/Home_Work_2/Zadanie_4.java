package Home_Work_2;

import java.util.Scanner;

public class Zadanie_4 {

    public void Execute(){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        int a = scanner.nextInt();
        if (a < 100 && a > 9) {
            while (a != 0) {
                sum = sum + (a % 10);
                a /= 10;
            }
            System.out.println(sum);
        } else {
            System.out.println("Chislo ne dvuznachnoe");}
    }
}
