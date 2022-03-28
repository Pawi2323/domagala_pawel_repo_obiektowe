package zadanie1;

import java.util.Random;

public class Tablica implements Interface {
    public Tablica(){
        Random rand = new Random();
        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(50);
            System.out.println(tab[i]);
        }
    }
}
