package zadanie1;

import java.util.ArrayList;
import java.util.Random;

public class Array implements Interface {
    public Array(){
        ArrayList al = new ArrayList();
        Random rand = new Random();
        int pick;
        for (int i = 0; i<10; i++) {
            pick = rand.nextInt(100);
            al.add(pick);
            System.out.println(al);
        }
    }
}
