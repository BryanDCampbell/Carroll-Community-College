/**
 * REQUIREMENT 1
 * @AUTHOR BRYAN CAMPBELL
 */

import java.io.*;
import java.util.Scanner;

public class BlackJackDemo
{
    public static void main(String[] args) {

        //Printing out rules of the game from separate text file
        //REQUIREMENT 10
        try {
            FileInputStream file = new FileInputStream("src/" + "Rules.txt");
            DataInputStream in = new DataInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader((in)));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
            in.close();
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }

        //REQUIREMENT 2
        //Asking player for name
        String name;
        System.out.println("***********************************");
        System.out.println("Hi! What is your name?");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("Hello, " + name + ", lets play some Blackjack!");

        //Creating a new deck
        Deck gameDeck = new Deck();

        //Fills the deck with 52 cards and shuffles the cards
        gameDeck.createFullDeck();
        gameDeck.shuffle();

        //Create hands for player and dealer
        PlayerHand player = new PlayerHand();
        PlayerHand dealer = new PlayerHand();

        //Draw two cards from deck, and add to player's hand
        player.addCard(gameDeck.getCard());
        player.addCard(gameDeck.getCard());

        //Draw two cards for the dealer's hand
        dealer.addCard(gameDeck.getCard());
        dealer.addCard(gameDeck.getCard());

        boolean end = false;
        Scanner userInput = new Scanner(System.in);
        int response;

        //REQUIREMENT 6
        while (end == false)
        {
            System.out.println("***********************************");
            System.out.println("Your hand is: \n" + player.toString(true));
            System.out.println("Your hand's value is: " + player.getHandValue());
            System.out.println("***********************************");
            System.out.println("The dealer's hand is \n" + dealer.toString(false));
            System.out.println("***********************************");
            System.out.println("Do you want to (1)Hit or (2)Stand?: ");
            response = userInput.nextInt();

            //REQUIREMENT 2
            //REQUIREMENT 4
            if (response == 1)
            {
                player.addCard(gameDeck.getCard());
                //REQUIREMENT 4
                if (player.getHandValue() > 21)
                {
                    System.out.println("Your current hand is: \n" + player.toString(true));
                    System.out.println("You bust!");
                    System.out.println("***********************************");
                    System.out.println("Would you like another hand? (1)Yes or (2)No");
                    response = userInput.nextInt();
                    //REQUIREMENT 4
                    if (response == 1)
                    {
                        player.removeCards();
                        dealer.removeCards();
                        player.addCard(gameDeck.getCard());
                        player.addCard(gameDeck.getCard());
                        dealer.addCard(gameDeck.getCard());
                        dealer.addCard(gameDeck.getCard());
                    }
                    //REQUIREMENT 4
                    if (response == 2)
                    {
                        end = true;
                    }
                }
            }

            //REQUIREMENT 4
            if (response == 2)
            {
                while (dealer.getHandValue() < 17)
                {
                    dealer.addCard(gameDeck.getCard());
                }
                //REQUIREMENT 4
                if (dealer.getHandValue() > 21)
                {
                    System.out.println("***********************************");
                    System.out.println("\nYour hand is: \n" + player.toString(true));
                    System.out.println("Your hand's value is: " + player.getHandValue());
                    System.out.println("***********************************");
                    System.out.println("\nThe dealer's hand is \n" + dealer.toString(true));
                    System.out.println("Their hand's value is: " + dealer.getHandValue());
                    System.out.println("Dealer busts. You win!");
                    System.out.println("***********************************");
                }
                else
                {
                    System.out.println("***********************************");
                    System.out.println("\nYour hand is: \n" + player.toString(true));
                    System.out.println("Your hand's value is: " + player.getHandValue());
                    System.out.println("***********************************");
                    System.out.println("\nThe dealer's hand is \n" + dealer.toString(true));
                    System.out.println("Their hand's value is: " + dealer.getHandValue());

                    //REQUIREMENT 4
                    if (player.getHandValue() > dealer.getHandValue())
                    {
                        System.out.println("You win!");
                        System.out.println("***********************************");
                    }
                    //REQUIREMENT 4
                    if (player.getHandValue() < dealer.getHandValue())
                    {
                        System.out.println("You lose!");
                        System.out.println("***********************************");
                    }
                    //REQUIREMENT 4
                    if (player.getHandValue() == dealer.getHandValue())
                    {
                        System.out.println("Push! Tie game.");
                        System.out.println("***********************************");
                    }
                }

                System.out.println("Would you like another hand? (1)Yes or (2)No");
                response = userInput.nextInt();
                //REQUIREMENT 4
                if (response == 1)
                {
                    player.removeCards();
                    dealer.removeCards();
                    player.addCard(gameDeck.getCard());
                    player.addCard(gameDeck.getCard());
                    dealer.addCard(gameDeck.getCard());
                    dealer.addCard(gameDeck.getCard());
                }
                //REQUIREMENT 4
                if (response == 2)
                {
                    end = true;
                }
            }
        }
    }
}
