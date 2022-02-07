import java.util.Scanner;

class Logic{
    Cards Cards = new Cards();
    String Card = Cards.getCard();
    Scanner sc = new Scanner(System.in);
    
    public int Points(int score){
        int earnedPoints = 0;
        if(Card == "Two"){
            earnedPoints = 2;
            System.out.println(Card);
        }else if(Card == "Three"){
            earnedPoints = 3;
            System.out.println(Card);
        }else if(Card == "Four"){
            earnedPoints = 4;
            System.out.println(Card);
        }else if(Card == "Five"){
            earnedPoints = 5;
            System.out.println(Card);
        }else if(Card == "Six"){
            earnedPoints = 6;
            System.out.println(Card);
        }else if(Card == "Seven"){
            earnedPoints = 7;
            System.out.println(Card);
        }else if(Card == "Eight"){
            earnedPoints = 8;
            System.out.println(Card);
        }else if(Card == "Nine"){
            earnedPoints = 9;
            System.out.println(Card);
        }else if(Card == "Ten" || Card == "Jack" || Card == "Queen" || Card == "King"){
            earnedPoints = 10;
            System.out.println(Card);
        }else if(Card == "Ace"){
            earnedPoints = 11;
            System.out.println(Card);
        }
        return earnedPoints;
    }
    public int playerScore(){
        int playerPoints = 0;
        System.out.println("Player's turn. Two cards are drawn");
        playerPoints = Points(playerPoints);
        playerPoints += Points(playerPoints);
        System.out.println("Player score: "+playerPoints+"\n");
        return playerPoints;
    }
    public int dealerScore(){
        int dealerPoints = 0;
        System.out.println("Dealer's turn. Two cards are drawn");
        //dealerPoints = Points(dealerPoints);
        //dealerPoints += Points(dealerPoints);
        System.out.println("Dealer score: "+dealerPoints+"\n");
        return dealerPoints;
    }

    public String askContinue(){
        System.out.println("Would you like another card? y or n");
        String cont = sc.nextLine();
        return cont;
    }

    public int newCard(){
        int score = 0;
        int playerPoints = score;
        int earnedPoints = Points(playerPoints);
        playerPoints += earnedPoints;
        System.out.println("The new score is: "+playerPoints);
        return playerPoints;
    }
}