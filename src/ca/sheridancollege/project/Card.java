/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card {
    
        public enum Suit{BLUE,GREEN,RED,YELLOW} ;
        public enum Value{ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,ZERO,DRAW_TWO,SKIP,WILD,REVERSE,WILD_DRAW4};
       
      
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value value)
        {
           suit =s;
           this.value= value;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
}
}
