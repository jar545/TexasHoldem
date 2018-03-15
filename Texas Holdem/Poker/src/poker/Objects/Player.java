package poker.Objects;

import java.util.ArrayList;

public class Player {

    String name;
    int chips;

    ArrayList hand = new ArrayList();

    public Player(String name, int chips) {
        this.name = name;
        this.chips = chips;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }
    
    

}
