/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Random;

import java.util.Arrays;

/**
 *
 * @author JASKARAN
 */
public class CardDeck  {
    
    final static int handSize = 108;
    public static CardUno[] cards = new CardUno[handSize];
    public static CardUno[] ActiveDeck; 
  
    
    public void generateDeck(){
        int countCards = 0;
        
        
        for(CardUno.Color color: CardUno.Color.values())
                {
                    for(CardUno.Rank r: CardUno.Rank.values())
                    {
                        //Creating objects using constructor and 
                        //assigning values of emun fields 
                        //from list of possible discrete values
                        cards[countCards] = (new CardUno(r,color));
                        countCards++;
                    }
                
       
                    for(CardUno.Rank r: CardUno.Rank.values())
                    {
                        if(!(r.equals(CardUno.Rank.ZERO)||r.equals(CardUno.Rank.DRAWFOUR)||r.equals(CardUno.Rank.WILDCARD))){
                        //Creating objects using constructor and 
                        //assigning values of emun fields 
                        //from list of possible discrete values
                        cards[countCards] = (new CardUno(r,color));
                        countCards++;
                        }
                    
                }
    }
    }
 public static CardUno[] shuffle(CardUno[] cards){
     Random rand = new Random();
     
     for(int i=0; i<cards.length;i++){
         int randPos = rand.nextInt(cards.length);
         CardUno temp = cards[i];
         cards[i] = cards[randPos];
         cards[randPos] = temp;
     }
     return cards;
 }
   public void checkDeck(){
       int activeCardCount = 0;
       for(int i=0;i<cards.length;i++){
          
           if(!cards[i].equals(null)){
              
               ActiveDeck = new CardUno[activeCardCount];
               ActiveDeck[ activeCardCount]=cards[i];
               activeCardCount ++;        
           }
       }
       
   }
   
    
}
