/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author JASKARAN
 */
public class CardUno extends Card{

   

    public enum Rank {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIC,SEVEN,EIGHT,NINE,REVERSE
    ,DRAWTWO,DRAWFOUR,SKIP,WILDCARD};
    
    public enum Color{RED,GREEN,BLUE,YELLOW};
    

    
    private final Rank rank;
    private final Color color;
    
   
    
    public CardUno(Rank rank, Color color){
        this.rank = rank;
        this.color = color;
    }
   
    /**
     * @return the rank
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }
        
    
    
    public String toString(){
        return "the card is: "+this.getRank()+"of "+this.getColor();
    }
    
    
    
}
