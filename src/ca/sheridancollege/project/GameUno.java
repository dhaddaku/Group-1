/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 *
 * @author JASKARAN
 */
public class GameUno extends Game{

    public GameUno(String givenName, int num) {
        super(givenName, num);
    }

    //method  to initialize playes 
   

    //this method to define the process og gaming and giving points to players14
    
       
        //players enter the game 
     
            
        
    
    public static void main(String[] args){
    
        System.out.println("enter the name of game(uno) and the number of platers ");
        Scanner input = new Scanner(System.in);
        
         CardDeck deck = new CardDeck();
        deck.generateDeck();
        CardDeck.shuffle(CardDeck.cards);
    
        
        GameUno game = new GameUno(input.nextLine(), input.nextInt());
        
        
        
        GroupOfCards hand = new GroupOfCards(12);
        hand.distributeCards();
        
        for(int i=0;i<=game.getNumOfPlayers();i++){
            
            PlayerUno player = new PlayerUno(input.nextLine(),0);
            players.add(player);
            
        }
       
        
        
    }

   
    public int calculatePoints(){
    
    return 0;
    };

  
    
    
}
