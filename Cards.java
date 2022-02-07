import java.util.Random;

class Cards{
    String cards[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    Random r = new Random();
    int rand = r.nextInt(13);
    String drawnCard = cards[rand];
    
    public String getCard(){
        return drawnCard;
    }
}