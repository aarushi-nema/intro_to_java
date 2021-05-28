package Ch7;

/*
    Q: Coupon collector is a classic statistics problem with many practical applications. The problem is to
    repeatedly pick objects from a set of objects and find out how many picks are needed for all the objects to be
    picked at least once. A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly,
    and find out how many picks are needed before you see one of each suit. Assume a picked card is placed back in the
    deck before picking another. Write a program to simulate the number of picks needed to get four cards from each suit
    and display the four cards picked (it is possible a card may be picked twice).
 */

/*
    Task: pick cards from a shuffled deck of 52 cards repeatedly
          find out how many picks are needed before you see one of each suit
          Assume a picked card is placed back in the deck before picking another
    Step 1: Create an array of suite names, an array of card name, an array of card number (0-51)
    Step 2: Initialize cardNumber array with values from 1-52
    Step 3: Shuffle the deck
    Step 4: pick 4 cards
    Step 5: Check if they are all different suites
    Step 6: if no- Pick again and increase count
    Step 7: if yes- display the cards and number of picks
 */

import org.jetbrains.annotations.NotNull;

public class Ex23_2 {

    final static int DECK_SIZE=52;
    final static int PICK_SIZE=4;

    public static void main(String[] args) {
        //Step 1: Create an array of suite names, an array of card name, an array of card number (0-51)
        String[] suitNames= {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] cardNames= {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King"};
        int[] cardNumber= new int[DECK_SIZE];
        int[] pickedCards= new int[PICK_SIZE];

        //Step 2: Initialize cardNumber array with values from 1-52
        initializeDeck(cardNumber);
        // Step 3: Shuffle the deck
        shuffleCards(cardNumber);

        boolean isDiffSuite;
        int count=0;

        do{
            //Step 4: pick 4 cards
            pickCards(cardNumber, pickedCards);
            isDiffSuite= isDifferentSuite(pickedCards);
            count++;
        }while(!isDiffSuite); // Step 5 and 6: Check if they are all different suites; if no- Pick again and increase count

        //Step 7: if yes- display the cards and number of picks
        displayResults(suitNames, cardNames, pickedCards, count);
    }

    public static void initializeDeck(int[] cardNumber){
        for(int i=0; i<cardNumber.length; i++){
            cardNumber[i]=(i+1);
        }
    }

    public static void shuffleCards(int[] cardNumber){
        for(int i=0; i<cardNumber.length; i++){
            int randomIndex= (int)(Math.random()*DECK_SIZE);
            int temp= cardNumber[i];
            cardNumber[i]= cardNumber[randomIndex];
            cardNumber[randomIndex]=temp;
        }
    }

    public static void pickCards(int[] cardNumber, int[] pickedCards){
        for(int i=0; i<pickedCards.length; i++){
            int randomIndex= (int)(Math.random()*DECK_SIZE);
            pickedCards[i]= cardNumber[randomIndex];
        }
    }

    public static boolean isDifferentSuite(int[] pickedCards){
        for(int i=0; i<pickedCards.length; i++){
            for(int j=0; j<pickedCards.length; j++){
                if(i!=j && ((pickedCards[j]/13)==(pickedCards[i]/13))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void displayResults(String[] suitNames, String[] cardNames, int[] pickedCards, int count){
        for(int i=0; i<pickedCards.length; i++){
            System.out.println(cardNames[(pickedCards[i]-1)%13] + " of " + suitNames[(pickedCards[i]-1)/13]);
        }
        System.out.println("Number of picks: " + count);
    }


}

/*
    Sample input/output
    
    Two of Spades
    Six of Hearts
    Queen of Clubs
    Four of Diamonds
    Number of picks: 2
 */
