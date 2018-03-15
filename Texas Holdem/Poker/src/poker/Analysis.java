package poker;
//to do

//Make Straight and flush look for highest straight and flush to look at the hightest flush
// fix straight flush to look at 
import java.util.Arrays;
import java.util.Collections;
import poker.Objects.Card;

/**
 *
 * @author Jared
 */
public class Analysis {

    /**
     * Hand Types 0 = High Card 1 = Pair 2 = Two Pair 3 = Three of a kind 4 =
     * Straight 5 = Flush 6 = Full House 7 = Four of a kind 8 = Straight Flush
     */
    //set the defualt hand type to high card
    private int handType = 0;
    private Card[] hand;

    //Constructor
    public Analysis(Card[] hand) {
        this.hand = hand;
        System.out.println("Analysis Object Created");
        
    }

    public void getHandType() {
        //Sort Cards in hand by rank
        
        System.out.println("System Check");
        sortByRank();
        System.out.println("System Check ");
        System.out.println("Hand Sorted By Rank ");
        System.out.println("Hand: ex - C(Rank,Suit)");
        for (int i = 0; i < hand.length; i++) {
            System.out.println(" C(" + hand[i].getRank() + ", " + hand[i].getSuit());
        }
        
        

        
        
        //Start looking for highest ranked hand first
        //if (straightFlush()) {
            //handType = 8;
        //} else if (fourOfAKind()) {
          //  handType = 7;
        //} else if (fullHouse()) {
          //  handType = 6;
        //} else if (flush()) {
            //handType = 5;
        //} else if (straight()) {
            //handType = 4;
        //} else if (threeOfAKind()) {
          //  handType = 3;
        //} else if (twoPair()) {
            //handType = 2;
        //} else if (pair()) {
          //  handType = 1;
        //} else if (highCard()) {
          //  handType = 0;
        //}
    }

   

    private void sortByRank(Card[] hand) {
        
    
   }
        
    }
    
    private void sortBySuit(){
        Card tempCard;
        for (int i = 1; i < hand.length; i++) {
            while (hand[i].getSuit() < hand[i--].getSuit()) {
                swap(i,i--);
            }
            
        }
    }
    
    private void swap(int i, int x){
        Card tempCard = hand[i--];
        hand[i--] = hand[i];
        hand[i] = tempCard;
    }

    private boolean straight(){
        boolean isStraight = true;
        
        for (int i = 0; i < 5; i++) {
            if (hand[i].getRank() == (hand[i++].getRank()-1)) {
                isStraight = false;
            }
        }
        
        return isStraight;
    }
    
    /*
    private boolean flush(){
        boolean isFlush = false;
        
        if (hand[i].getSuit() == hand[4].getRank()) {
            isFlush = true;
        }
        
        return isFlush;
    }
    */
    
    /*
    private boolean straightFlush(){
        boolean isStraightFlush = false;
        if (straight() && flush()) {
            isStraightFlush = true;
        }
        return isStraightFlush;
    }
    */

    
}
