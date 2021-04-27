package CardPackage;

/*
 wanna to generate a full deck of Cards
 mean to have like card game have a 4*13 card
 for each suit type have 13 card of 1,2,3 till king
 */


public class FDeck {

    //needed values
    int suitNum = 4;
    int eachSuitCardsNum = 13;
    int cardsNum = suitNum * eachSuitCardsNum;

    // object from the Card class
    Card[][] cards;

    // constructor
    public FDeck() {
        cards = new Card[suitNum][eachSuitCardsNum];
        for (int s = Card.d; s <= Card.s; s++) {
            for (int r = Card.one; r <= Card.k; r++) {
                cards[s - 1][r - 1] = new Card(r, s);
            }
        }
    }

    // Getter fun of the Cards
    public Card cardGenerator(int suit, int rank) {
        return cards[suit - 1][rank - 1];
    }

}

