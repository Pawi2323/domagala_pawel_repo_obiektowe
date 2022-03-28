package zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Interface inter;
        Scanner sc = new Scanner(System.in);
        String wybierz = sc.next();
        switch (wybierz){
            case "Tablica":
                inter = new Tablica();
                break;
            case "Array":
                inter = new Array();
                break;
            default:
                inter = null;
        }
    }
}