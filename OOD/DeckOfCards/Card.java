import java.util.*;



public class Card {
	String suit;
	int value;

	public enum Face { KING, QUEEN, SPADE, DIAMOND };

	public Card(int suit, int value) {
		this.suit = Face.values()[suit].toString();
		this.value = value;
	}

	public String toString() {
		return ("Suit: ["+suit+"]\tValue: ["+value+"]");
	}

}