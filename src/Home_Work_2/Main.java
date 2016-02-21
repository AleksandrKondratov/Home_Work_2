package Home_Work_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skan1 = new Scanner(System.in);
        do {
            System.out.println("Vuberite zadanie ot 1 do 10");
            System.out.println("Vuhod = 0");
            int i = skan1.nextInt();
            String str = skan1.toString();
            switch (i) {
                case 0:
                    return;
                case 1:
                    System.out.println("Vupolnyaetsa zadanie 1");
                    System.out.println();
                    Zadanie_1 z1 = new Zadanie_1();
                    z1.Execute();
                    break;
                case  2:
                    System.out.println("Vupolnyaetsa zadanie 2");
                    System.out.println();
                    Zadanie_2 z2 = new Zadanie_2();
                    z2.Execute();
                    break;
                case 3:
                    System.out.println("Vupolnyaetsa zadanie 3");
                    System.out.println();
                    Zadanie_3 z3 = new Zadanie_3();
                    z3.Execute();
                    break;
                case 4:
                    System.out.println("Vupolnyaetsa zadanie 4");
                    System.out.println();
                    Zadanie_4 z4 = new Zadanie_4();
                    z4.Execute();
                    break;
                case 5:
                    System.out.println("Vupolnyaetsa zadanie 5");
                    System.out.println();
                    Zadanie_5 z5 = new Zadanie_5();
                    z5.Execute();
                    break;
                case 6:
                    System.out.println("Vupolnyaetsa zadanie 6");
                    System.out.println();
                    Zadanie_6 z6 = new Zadanie_6();
                    z6.Execute();
                    break;
                case 7:
                    System.out.println("Vupolnyaetsa zadanie 7");
                    System.out.println();
                    Zadanie_7 z7 = new Zadanie_7();
                    z7.Execute();
                    break;
                case 8:
                    System.out.println("Vupolnyaetsa zadanie 8");
                    System.out.println();
                    Zadanie_8 z8 = new Zadanie_8();
                    z8.Execute();
                    break;
                default:
                    System.out.println("Neverniy vubor");
            }
            System.out.println("Vuberite zadanie ot 1 do 10, Vuxod = 0");
        } while (!skan1.hasNext ("0"));
    }
}
