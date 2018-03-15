/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;
import poker.Objects.Card;

/**
 *
 * @author Jared
 */
public class Combo {
    
    //List used to store all the subsets
    ArrayList<Card[]> subsets = new ArrayList();

    //input array
    Card[] inputArray;
    int length = 5;

    //Values array used to find the indexs needed to insert into new array
    int[] values = {0, 1, 2, 3, 4};

    public Combo(Card[] input){
        inputArray = input;
        findCombos();
        System.out.println("Combos found");
        
        
        
    }
    
    private void findCombos() {
        for (;;) {
            
            int i;
            // find position of item that can be incremented
            for (i = length - 1; i >= 0 && values[i] == inputArray.length - length + i; i--);
            if (i < 0) {
                break;
            }
            values[i]++;                    // increment this item
            for (++i; i < length; i++) {    // fill up remaining items
                values[i] = values[i - 1] + 1;
            }
            subsets.add(getSubset(inputArray, values));
            System.out.println("New Combo");
        }
    }

    private Card[] getSubset(Card[] input, int[] subset) {
        Card[] result = new Card[subset.length];
        for (int i = 0; i < subset.length; i++) {
            result[i] = input[subset[i]];
            System.out.println(result[i].toString());
        }
        return result;
    }
    
    
    
    

}
