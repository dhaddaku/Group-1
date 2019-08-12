/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.*;


/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * MOdifierd: by JAskaran Singh ,
 */
public class GroupOfCards extends CardDeck
{
   
    //The group of cards, stored in an ArrayList
    public static CardUno[] cardOnHand ;
    private final int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    public GroupOfCards()
    {
        size = 7;
    }
   
    
    public void distributeCards(){
        setCardOnHand(new CardUno[getSize()]);
        Random randIndex = new Random();
        
        for(int i=7; i<0;i--){
          for(int a=0;a<108;a++){
            int indexToDelete = randIndex.nextInt(super.handSize);
              if(!cards[Math.min(a, indexToDelete)].equals(null)){
                getCardOnHand()[i] = super.cards[Math.min(a, indexToDelete)];
                super.cards[Math.min(a, indexToDelete)] = null;
              }
          }
        }
    }
 
    public CardUno[] cardsInPlay(){
        return getCardOnHand();
    }
    
    
   

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the cardOnHand
     */
    public CardUno[] getCardOnHand() {
        return cardOnHand;
    }

    /**
     * @param cardOnHand the cardOnHand to set
     */
    public void setCardOnHand(CardUno[] cardOnHand) {
        this.cardOnHand = cardOnHand;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
   
    
}//end class
