package InterviewOrExams;

    /*
          You have to design a solution (classes, interfaces, etc etc) for DeckofCards.
//        Each card has a suit (heart, spade, club, diamond) and a rank (ace, king, queen jack,
//        10, 9, 8, 7, 6, 5, 4, 3, 2).
//        Problem 1 Write a function to Compare two cards and return bigger one.
//        Suit doesn't matter.
    */

import java.util.*;

enum Suit {
    HEART,
    SPADE,
    CLUB,
    DIAMOND,
}

enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Card {
    private final Suit suit;
    private final Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public Rank getRank() {
        return rank;
    }
}

class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return Math.max(o1.getRank().value, o2.getRank().value);
    }
}

public class WissenTechInterview2 {
    public static void main(String[] args) {
        Card card1 = new Card(Suit.CLUB, Rank.KING);
        Card card2 = new Card(Suit.DIAMOND, Rank.ACE);

        CardComparator cardComparator = new CardComparator();
        int compare = cardComparator.compare(card1, card2);

        if (compare > 0) {
            System.out.println(card1);
        } else if (compare < 0) {
            System.out.println(card2);
        } else {
            System.out.println(card1);
        }
    }
}

