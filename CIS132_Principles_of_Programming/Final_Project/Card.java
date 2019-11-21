/**
 * REQUIREMENT 8
 * REQUIREMENT 1
 * @AUTHOR BRYAN CAMPBELL
 */

public class Card
{

    //all face values of the cards in a deck
    public enum Value
    {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    //all the suits a card can be
    public enum Suit
    {
        HEARTS, CLUBS, DIAMONDS, SPADES
    }

    private Value value;
    private Suit suit;

    //2-arg constructor for Card
    public Card(Suit suit, Value value)
    {
        this.value = value;
        this.suit = suit;
    }

    //returns the value and suit of each card
    public String toString()
    {
        return this.value.toString() + " of " + this.suit.toString();
    }

    //returns the value
    public Value getValue()
    {
        return this.value;
    }
}
