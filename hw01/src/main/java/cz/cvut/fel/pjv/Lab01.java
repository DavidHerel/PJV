package cz.cvut.fel.pjv;

import java.util.Arrays;
import java.util.Scanner;

public class Lab01 {
   
   public void homework() {
     Scanner sc = new Scanner(System.in); 
     int choice = sc.nextInt();
     double a = sc.nextDouble();
     double b = sc.nextDouble();
     int c = sc.nextInt();
     System.out.printf("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):\n");
     if (choice != 1 && choice != 2 && choice != 3 && choice != 4){
         System.out.println("Chybna volba!");
         return;
     }
     
     if (choice == 1){
         plus(a,b,c);
     }
     if (choice == 2){
         minus(a,b,c);
     }
     
     if (choice == 3){
         multiply(a,b,c);
     }
     
     if (choice == 4){
        divide(a,b,c);
     }
     
   }
   
   public void plus(double a, double b, int c){
        System.out.printf("Zadej scitanec: \n");
        System.out.printf("Zadej scitanec: \n");
        System.out.printf("Zadej pocet desetinnych mist: \n");
        if (c < 0){
            System.out.println("Chyba - musi byt zadane kladne cislo!");
            return;
        }
        double solution = a + b;
        System.out.printf("%."+c+"f" + " + "+"%."+c+"f" + " = %."+c+"f\n", a, b, solution);
   }
   
   public void minus(double a, double b, int c){
        System.out.printf("Zadej mensenec: \n");
        System.out.printf("Zadej mensitel: \n");
        System.out.printf("Zadej pocet desetinnych mist: \n");
        if (c < 0){
            System.out.println("Chyba - musi byt zadane kladne cislo!");
            return;
        }
        double solution = a - b;
        System.out.printf("%."+c+"f" + " - "+"%."+c+"f" + " = %."+c+"f\n", a, b, solution);
   }
   
   public void multiply(double a, double b, int c){
        System.out.printf("Zadej cinitel: \n");
        System.out.printf("Zadej cinitel: \n");
        System.out.printf("Zadej pocet desetinnych mist: \n");
        if (c < 0){
            System.out.println("Chyba - musi byt zadane kladne cislo!");
            return;
        }
        double solution = a * b;
        System.out.printf("%."+c+"f" + " * "+"%."+c+"f" + " = %."+c+"f\n", a, b, solution);
   }
   
   public void divide(double a, double b, int c){
    System.out.printf("Zadej delenec: \n");
    System.out.printf("Zadej delitel: \n");
    if (b == 0){
        System.out.println("Pokus o deleni nulou!");
        return;
    }
    System.out.printf("Zadej pocet desetinnych mist: \n");
    if (c < 0){
        System.out.println("Chyba - musi byt zadane kladne cislo!");
        return;
    }
    double solution = a / b;
    System.out.printf("%."+c+"f" + " / "+"%."+c+"f" + " = %."+c+"f\n", a, b, solution);
   }
}