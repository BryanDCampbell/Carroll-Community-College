/**
 * REQUIREMENT 8
 * REQUIREMENT 1
 * @AUTHOR BRYAN CAMPBELL
 */

import java.util.ArrayList;

public class PlayerHand {

    //REQUIREMENT 9
    private ArrayList<Card> cards;

    public PlayerHand()
    {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card)
    {
        cards.add(card);
    }

    public void removeCards()
    {
        cards = new ArrayList<Card>();
    }

    public String toString(boolean showBothCards)
    {

        if(showBothCards){
            String hand = new String();

            for(int i = 0; i < cards.size(); i++)
            {
                hand += cards.get(i).toString() + "\n";
            }
            return hand;
        }
        else
        {
            String hand = new String();

            for(int i = 0; i < cards.size(); i++)
            {
                if(i > 0)
                {
                    hand += "[HIDDEN]" + "\n";
                }
                else
                {
                    hand += cards.get(i).toString() + "\n";
                }
            }
            return hand;
        }

    }

    //REQUIREMENT 7
    public int getHandValue()
    {
        int totalValue = 0;
        int aces = 0;

        for(int i = 0; i < cards.size(); i++)
        {
            //REQUIREMENT 5
            switch(cards.get(i).getValue())
            {
                case TWO: totalValue += 2; break;
                case THREE: totalValue += 3; break;
                case FOUR: totalValue += 4; break;
                case FIVE: totalValue += 5; break;
                case SIX: totalValue += 6; break;
                case SEVEN: totalValue += 7; break;
                case EIGHT: totalValue += 8; break;
                case NINE: totalValue += 9; break;
                case TEN: totalValue += 10; break;
                case JACK: totalValue += 10; break;
                case QUEEN: totalValue += 10; break;
                case KING: totalValue += 10; break;
                case ACE: aces +=1; break;
            }
        }

        for(int i = 0; i < aces; i++)
        {
            //REQUIREMENT 4
            if(totalValue > 10)
            {
                totalValue += 1;
            }
            else
            {
                totalValue += 11;
            }
        }
        return totalValue;
    }
}
