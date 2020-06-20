/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * @modifier Raxit Patel 
 * date June 20, 2020
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Sivagama
 */
public class Card 
{
     public enum Suit{DIAMONDS,HEARTS,SPADES,CLUBS};
        public enum Value{TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,TEN,JACK,QUEEN,KING,ACE};
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value v)
        {
           suit =s;
           value= v;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
    
   
    
}
