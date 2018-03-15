package poker.Objects;


/*
card object 

Contains a suit and a rank number 

Public methods

Get Rank
Get Suit

*/
public class Card {

int rank;
int suit;

public Card(int rank, int suit){
    this.rank = rank;
    this.suit = suit;
    System.out.println("Card Created - Rank: " + rank + " Suit: " + suit);
}

public int getRank(){
    return rank;
}

public int getSuit(){
    return suit;
}

@Override 
public String toString(){
    return ("Rank: " + getRank() + " Suit: " + getSuit());
}
    
    
}
