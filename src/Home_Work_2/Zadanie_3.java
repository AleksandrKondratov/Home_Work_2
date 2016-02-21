package Home_Work_2;

import java.util.Scanner;

public class Zadanie_3 {
    public void Execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        int a = scanner.nextInt();
        if ((a % 2) == 0) {
            System.out.println("Chislo chetnoe");
        } else {
            System.out.println("Chislo nechetnoe");
        }
    }
}
