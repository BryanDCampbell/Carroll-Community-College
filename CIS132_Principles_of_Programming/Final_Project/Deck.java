/**
 * REQUIREMENT 8
 * REQUIREMENT 1
 * @AUTHOR BRYAN CAMPBELL
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    //REQUIREMENT 9
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck() {
        //Generates Cards
        for (Card.Suit cardSuit : Card.Suit.values()) {
            for (Card.Value cardValue : Card.Value.values()) {
                //Adds a new Card
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }
    }

    public void shuffle() {
        ArrayList<Card> tmpDeck = new ArrayList<Card>();
        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();
        for (int i = 0; i < originalSize; i++)
        {
            //Generate Random Index
            //REQUIREMENT 3(c)
            randomCardIndex = random.nextInt((this.cards.size() - 1) + 1);
            tmpDeck.add(this.cards.get(randomCardIndex));
            //Remove from original deck
            this.cards.remove(randomCardIndex);
        }

        this.cards = tmpDeck;
    }

    //REQUIREMENT 3(a)
    public String toString()
    {
        String cardListOutput = "";
        for (Card aCard : this.cards)
        {
            cardListOutput += "\n" + aCard.toString();
        }
        return cardListOutput;
    }

    public Card getCard()
    {
        Card newCard = cards.get(0);
        cards.remove(0);
        return newCard;
    }

    public int deckSize()
    {
        return this.cards.size();
    }
}
