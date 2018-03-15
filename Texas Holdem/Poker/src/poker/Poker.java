/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;
        
import poker.Objects.Card;
import poker.Objects.Deck;
import poker.Objects.Player;


        
public class Poker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card[] hand = new Card[5];
        for (int i = 0; i < hand.length; i++) {
            hand[i] = deck.drawCard();
        }
        
        Analysis analysis = new Analysis(hand);
        
        analysis.getHandType();
        
        
        
    }
    
}
