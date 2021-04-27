package CardPackage;

public class Card {

    private final int rank;
    private final int suit;

    //ranks
    public final static int one = 1;
    public final static int two = 2;
    public final static int three = 3;
    public final static int four = 4;
    public final static int five = 5;
    public final static int six = 6;
    public final static int seven = 7;
    public final static int eight = 8;
    public final static int nine = 9;
    public final static int ten = 10;
    public final static int g = 11;
    public final static int q = 12;
    public final static int k = 13;

    //suits
    public final static int d = 1;
    public final static int c = 2;
    public final static int h = 3;
    public final static int s = 4;


    // MainConstructor
    public Card(int rank, int suit) {
        assert rankChecker(rank);
        assert suitChecker(rank);
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    // convert rank to string
    public static String rankToString(int rank) {
        return switch (rank) {
            case one -> "Ace";
            case two -> "Deuce";
            case three -> "Three";
            case four -> "Four";
            case five -> "Five";
            case six -> "Six";
            case seven -> "Seven";
            case eight -> "Eight";
            case nine -> "Nine";
            case ten -> "Ten";
            case g -> "Jack";
            case q -> "Queen";
            case k -> "King";
            default -> null;
        };


    }

    // convert Suit to String
    public static String suitToString(int suit) {
        return switch (suit) {
            case d -> "Diamond";
            case c -> "Clubs";
            case h -> "Hearts";
            case s -> "Spades";
            default -> null;
        };
    }

    // check the input of rank kind
    public static boolean rankChecker(int rank) {
        return one <= rank && rank <= k;
    }

    // check the input of Suit Kind
    public static boolean suitChecker(int suit) {
        return d <= suit && suit <= s;
    }

}








