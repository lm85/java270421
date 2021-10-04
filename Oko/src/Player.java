import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> packOfCards = new ArrayList<Card>();
    private Deck deck;

    public Player(String name,Deck deck) {
        this.name = name;
        this.deck=deck;
    }

    public void lickNextcCard() {

        this.packOfCards.add(this.deck.lickNextcCard());


    }
    
    public int getSumCards() {
    int sum=0;

        for (Card c:this.packOfCards) {
            sum+=c.getR().getRank();
        }

        return sum;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getPackOfCards() {
        return packOfCards;
    }

    public String getCards() {
     String s="";

        for (Card c:this.packOfCards) {
            s+=c.getR()+" ";
        }

        return s;

    }

}
