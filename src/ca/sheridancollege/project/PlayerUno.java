/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Random;

/**
 *
 * @author JASKARAN
 */
public class PlayerUno extends Player{

    public PlayerUno(String name, int points) {
        super(name, points);
    }

   

    
    
 
    public void drawFour(){
        Random randIndex = new Random();
         for(int i=0; i<4;i++){
             for(int a =0;a<108;a++){
                int indexToDelete = randIndex.nextInt(CardDeck.handSize);
                if(!CardDeck.cards[indexToDelete].equals(null)){
                    GroupOfCards.cardOnHand[ GroupOfCards.cardOnHand.length-1] = CardDeck.cards[indexToDelete];
                    CardDeck.cards[indexToDelete] = null;
                    return;
              }
             }
        }
    }
    public void drawTwo(){
         Random randIndex = new Random();
         for(int i=0; i<2;i++){
             for(int a =0;a<108;a++){
                int indexToDelete = randIndex.nextInt(CardDeck.handSize);
                if(!CardDeck.cards[indexToDelete].equals(null)){
                    GroupOfCards.cardOnHand[ GroupOfCards.cardOnHand.length-1] = CardDeck.cards[indexToDelete];
                    CardDeck.cards[indexToDelete] = null;
                    return;
              }
             }
            
        }
    }
    public void drawFromDeck(){
        for(int a =0;a<108;a++){
            if(!CardDeck.cards[Math.min(a-1, a)].equals(null)){
                 GroupOfCards.cardOnHand[ GroupOfCards.cardOnHand.length-1] = CardDeck.cards[Math.min(a-1, a)];
                 CardDeck.cards[Math.min(a-1, a)] = null;
                 return;
            }
        }
        }
   public void sayUno(){
       boolean sayUno = false;
       if(GroupOfCards.cardOnHand.length==1){
           sayUno =  true;
           System.out.println("Uno!!!!!");
       }
   }
    
    @Override
    public String toString(){
        return super.getPlayerID();
    }
}
