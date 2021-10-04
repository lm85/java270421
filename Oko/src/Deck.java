import java.util.ArrayList;
import java.util.Collections;


//https://stackoverflow.com/questions/23329132/building-a-deck-of-cards-in-java-using-2-different-enums

public class Deck {

	
	private ArrayList<Card> packOfCards = new ArrayList<Card>();
	
	public Deck() {
		
		fillDeck();
		suffleDeck();

	}
	
	private void fillDeck() {
		 for (int i = 0; i<32;i++){
		
		        for (Suit s : Suit.values()) {
		        for (Rank r : Rank.values()) {
		        	packOfCards.add(new Card(s,r));
		   }
		   }
		   }
		
		
	}

	public void suffleDeck() {

			Collections.shuffle(this.packOfCards);


	}

	public Card lickNextcCard() {



		Card card = this.packOfCards.get(0);

		this.packOfCards.remove(0);


		return  card;

	}

	
}
