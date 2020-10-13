import java.util.ArrayList;
import java.util.List;

enum Suit { CLUBS, DIAMONDS, SPADES, HEARTS }
enum Rank { ACE, TWO, ..., QUEEN, KING }

class Card{
    Suit aSuit;
    Rank aRank;
}


class Deck {
    List<Card> aCards = new ArrayList<>();
}


Deck deck = new Deck();
deck.aCards.add(new Card());
