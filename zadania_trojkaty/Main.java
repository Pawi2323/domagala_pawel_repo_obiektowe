package pl.local.home.zadanie_marzec_3.zadania_trojkaty;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        AreaOfTheTriangle AOTT = new AreaOfTheTriangle();
        System.out.println("Wybierz rodzaj wzoru: 1-4");
        Scanner sc = new Scanner(System.in);
        int wybor = sc.nextInt();
        switch(wybor){
            case 1: {
                //while dodaj tutaj do kazdego souta
                System.out.println("Podaj a: ");
                BigDecimal a = new BigDecimal(sc.nextInt());
                System.out.println("Podaj h: ");
                BigDecimal h = new BigDecimal(sc.nextInt());
                System.out.println(AOTT.triangle(a, h));
                break;
            }
            case 2: {
                System.out.println("Podaj a: ");
                BigDecimal a = new BigDecimal(sc.nextInt());
                System.out.println("Podaj b: ");
                BigDecimal b = new BigDecimal(sc.nextInt());
                System.out.println("Podaj c: ");
                BigDecimal c = new BigDecimal(sc.nextInt());
                System.out.println("Podaj R: ");
                BigDecimal R = new BigDecimal(sc.nextInt());
                System.out.println(AOTT.triangle(a, b, c, R));
                break;
            }
            case 3: {
                System.out.println("Podaj r: ");
                BigDecimal r = new BigDecimal(sc.nextInt());
                System.out.println("Podaj p: ");
                BigDecimal p = new BigDecimal(sc.nextInt());
                System.out.println(AOTT.triangle(r ,p, true));
            }
                break;
            case 4: {
                System.out.println("Podaj a: ");
                BigDecimal a = new BigDecimal(sc.nextInt());
                System.out.println("Podaj b: ");
                BigDecimal b = new BigDecimal(sc.nextInt());
                System.out.println("Podaj c: ");
                BigDecimal c = new BigDecimal(sc.nextInt());
                System.out.println("Zdefiniuj precyzje pierwiastka: ");
                MathContext mc = new MathContext(sc.nextInt());
                System.out.println(AOTT.triangle(a, b, c, mc));
                break;
            }
        }
    }
}