/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * @modifier Raxit Patel 
 * date June 20, 2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Sivagama
 */
public class Deck 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size; 
    
    public Deck(int givenSize)
    {
        size = givenSize;
    }
    
    public void generateHand()
        {  
                 
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards.add((new Card(s,v)));
                         
                    }
                }//end outter for
        }
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
      public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    
    
}//end class
