
import java.util.Random;

public class Main {
    public static void main(String[] args){
        PlanetsImpl planeta;

        //POLIMORFIZM
        Random r = new Random();
        int nr = r.nextInt(8);
        if(nr == 0) planeta = new Mercury();
        else if(nr == 1) planeta = new Venus();
        else if(nr == 2) planeta = new Earth();
        else if(nr == 3) planeta = new Mars();
        else if(nr == 4) planeta = new Jupiter();
        else if(nr == 5) planeta = new Saturn();
        else if(nr == 6) planeta = new Uranus();
        else planeta = new Neptune();
        planeta.komunikat();
    }
}
