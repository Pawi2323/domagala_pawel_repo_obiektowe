
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String lifeAnnouncement = "";
        String typeAnnouncement = "";
        PlanetsImpl planeta;
        Scanner sc = new Scanner(System.in);
        String planet = sc.next();
        switch(planet){
            case "Merkury":
                planeta = new Mercury();
                break;
            case "Wenus":
                planeta = new Venus();
                break;
            case "Ziemia":
                planeta = new Earth();
                break;
            case "Mars":
                planeta = new Mars();
                break;
            case "Jowisz":
                planeta = new Jupiter();
                break;
            case "Saturn":
                planeta = new Saturn();
                break;
            case "Uran":
                planeta = new Uranus();
                break;
            case "Neptun":
                planeta = new Neptune();
                break;
            default:
                planeta = null;
                break;
        }
        if(planeta.isLife()) lifeAnnouncement = "posiada zycie";
        else lifeAnnouncement = "nie posiada zycia";

        if(planeta.planetType()) typeAnnouncement = "jest skalista";
        else typeAnnouncement = "jest gazowa";

        System.out.println("Planeta "+lifeAnnouncement);
        System.out.println("Planeta "+typeAnnouncement);
    } 
}
