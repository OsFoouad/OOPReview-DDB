import CardPackage.*;

public class Display {

    public static void main(String[] args) {
        // create object from FDeck Class
        FDeck fdeck = new FDeck();
        // to check if all cards Generated
        int cNum = 0;

        // for loop to gen a 13 card for each type of the four types and display them as string
        for (int suit = Card.d; suit <= Card.s; suit++) {
            for (int rank = Card.one; rank <= Card.k; rank++) {
                Card card = fdeck.cardGenerator(suit, rank);
                cNum++;
                System.out.println(
                        cNum + "        " +
                                card.rankToString(card.getRank()) + "     " +
                                card.suitToString(card.getSuit()));
            }
        }
    }
}
