import java.util.*;

class DeckOfCards {
	List<Card> deck;

	public DeckOfCards() {
		this.deck = new ArrayList<Card>();
	}

	void generateDeck() {
		for (int i=0; i<52; i++) {
			deck.add(new Card(i%4, i%13));
		}
	}

	void shuffle() {
		Random random = new Random();
		List<Card> shuffled = new ArrayList<Card>();

		for (int i=0; i<52; i++) {
			int index = random.nextInt(deck.size());
			Card card = deck.remove(index);
			shuffled.add(card);
		}

		deck = shuffled;
	}

	Card drawOneCard() {
		if (deck.size() > 0) {
			return deck.remove(0);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		DeckOfCards doc = new DeckOfCards();
		doc.generateDeck();
		doc.shuffle();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\tEnter 'Q' to exit\n");
		while (true) {
			System.out.println(doc.drawOneCard());
			System.out.println("Remaining cards: "+doc.deck.size());
			String q = sc.nextLine();
			if (q.toUpperCase().equals("Q")) {
				break;
			}
		}

	}
}