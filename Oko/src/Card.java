
public class Card {
	private Suit s;

	private Rank r;
	
	public Card(Suit s,Rank r) {
		this.s=s;
		this.r=r;

	}

	public Suit getS() {
		return s;
	}

	public Rank getR() {
		return r;
	}

	@Override
	public String toString() {
		return "Card{" +
				"s=" + s +
				", r=" + r +
				'}';
	}
}
