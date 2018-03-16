package poker;


import poker.Objects.Card;


public class Analysis {

    /**
     * Hand Types 0 = High Card 1 = Pair 2 = Two Pair 3 = Three of a kind 4 =
     * Straight 5 = Flush 6 = Full House 7 = Four of a kind 8 = Straight Flush
     */
    
    private int handType = 0;
    @SuppressWarnings("FieldMayBeFinal")
    private Card[] hand;

    //Constructor
    public Analysis(Card[] hand) {
        this.hand = hand;
        System.out.println("Analysis Object Created");

    }

    public void getHandType() {
               
        printHand();
        System.out.println(isFlush());
        printHand();
        
    }
        
    //Sorts a hand of cards by rank in incresing order
    private void sortByRank(Card[] hand) {

        for (int j = 0; j < hand.length - 1; j++) {
            int iMin = j;

            for (int i = j + 1; i < hand.length; i++) {
                if (hand[i].getRank() < hand[iMin].getRank()) {
                    iMin = i;
                }
                
            }
            
            if (iMin != j) {
                swap(hand,j,iMin);
            }
        }

    }
    
    //swaps 2 cards of given index in a given hand
    private void swap(Card[] hand, int s1, int s2) {
        Card t;
        t = hand[s1];
        hand[s1] = hand[s2];
        hand[s2] = t;

    }

    //sorts a hand of card objects by suit| Sorted by arbitrary number assigned to rank
    private void sortBySuit() {
        for (int j = 0; j < hand.length - 1; j++) {
            int iMin = j;

            for (int i = j + 1; i < hand.length; i++) {
                if (hand[i].getSuit() < hand[iMin].getSuit()) {
                    iMin = i;
                }
                
            }
            
            if (iMin != j) {
                swap(hand,j,iMin);
            }
        }
    }
    
    //prints the hand to the console
    private void printHand(){
        for (Card hand1 : hand) {
            System.out.println(" C(" + hand1.getRank() + ", " + hand1.getSuit() + ")");
        }
    }
    
    
    private boolean isStraightFlush() {
        if (isStraight() && isFlush()) {
            return true;
        }
        return false;
    }

    private boolean isFourOfAKind() {
        if (
                hand[0].getSuit() ==
                hand[1].getSuit() && 
                hand[1].getSuit() == 
                hand[2].getSuit() &&
                hand[2].getSuit() == 
                hand[3].getSuit()  
                
            ){
            return true;
        }
        else if(
                hand[1].getSuit() ==
                hand[2].getSuit() && 
                hand[2].getSuit() == 
                hand[3].getSuit() &&
                hand[3].getSuit() == 
                hand[4].getSuit()   

            ){
            
        }
        return false;
    }

    private boolean isFullHouse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isFlush() {
        sortBySuit();
        
        if (hand[0].getSuit() == hand[hand.length-1].getSuit()) {
            return true;
        }
        return false;
    }

    private boolean isStraight() {
        sortByRank(hand);
        int testRank = hand[0].getRank();
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getRank() != testRank) {
                return false;
            }
            testRank++;
        }
        return true;
    }

    private boolean isThreeOfAKind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isTwoPair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isPair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
