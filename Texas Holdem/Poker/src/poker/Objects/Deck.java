/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Objects;

import java.util.Random;
import java.util.Stack;

public class Deck {

    private Card[] deck = new Card[52];
    private Random rand = new Random();
    private  Stack stack = new Stack();

    public Deck() {

        int i = 0;

        for (int j = 1; j <= 13; j++) {
            for (int k = 1; k <= 4; k++) {
                deck[i] = new Card(j, k);
                i++;
            }
        }

        shuffle();
        moveToStack();
        
        System.out.println("Deck Created");

    }

    private void shuffle() {

        for (int i = 52; i > 0; i--) {
            //simple Fisher-Yates Shuffle
            int randIndex = rand.nextInt(i);
            //swaps the index with the random index
            Card a = deck[randIndex];
            deck[randIndex] = deck[i - 1];
            deck[i - 1] = a;
        }
    }
    
    private void moveToStack(){
        for (int i = 0; i < 52; i++) {
            stack.push(deck[i]);
        }
    }

    public Card drawCard(){
        System.out.println("Card Drawn");
        return (Card)stack.pop();
        
    }
   
    
    
}
