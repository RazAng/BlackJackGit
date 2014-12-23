package model;


import java.util.ArrayList;
import java.util.Iterator;
/**
 * Hand class 
 */
public class Hand {
	//***************************************** Variables *********************************************
	/** The ArrayList that will hold the participants hand*/
	private ArrayList<Card> hand;	 
	 /** This counter will hold the number of "Aces" dealt to a participant*/
	 private int aceCounter=0;
	//***************************************** Constructors ******************************************
	 /**
     * Constructor. Create a Hand object that is initially empty.
     */
    public Hand(){
    	this.hand=new ArrayList<>();
    }
  //***************************************** Methods ***********************************************
    /**
     * Discard all cards from the hand, making the hand empty.(at a new round).
     */
    public void clear(){    
    	hand.clear();
    	System.out.println("Hand was clear");    	
    }

    /**
     * Add the card c to the hand.  c should be non-null.
     * @throws NullPointerException if c is null.
     * this function is used mainly for the "hit" and "deal" methods
     */
    public void addCard(Card c) throws NullPointerException{ 
    	if (c.getValue()==CardValue.ACE){
    		aceCounter++;
    		System.out.println("First Ace was dealt");
    	}
    	hand.add(c);
    	System.out.println("Card was added to the hand");
    }

    /**
     * Return the cards sum in the hand.
     */
    public int getHandSum(Participant p){ 
    	int sum=0;
    	for (int i=0; i<hand.size(); i++){
    		sum= sum+hand.get(i).getValue().getCardValue();
    	}
    	
    	 if (p instanceof Player)  {
    		 if (aceCounter>0) //if there was 1 ace dealt the value will be 11. the next aces will count as their neutral value=1 automatically
    	    		sum=sum+(10);//if one aces or more was dealt--> add to sum: neutral value(1) + 10 = 11	
    	 }
    	 
    	 else
    		 if(p instanceof Dealer)  {        		
    			 if (aceCounter>0) {
     	    		int chackSumWithAces=0;
     	    		int j=aceCounter;
     	    		while(j>0){
     	    			j--;
     	    			chackSumWithAces= sum+10; //sum+10 because card value =1 + 10 = 11    	    			
         	    		if(chackSumWithAces<22) //ace count as 11, unless it's causes the dealer to lose    	    			  
        				    sum=sum+(10);         	    		
     	    		}     	    		
    			 }    				 
     	     }
    	
    	return sum;
    }    
        
    /**
     * checks if the hand bust
     * @returns true if the hand bust , otherwise returns false
     */
    public boolean checkHandForBust(Participant p){
    	System.out.print("Checking if hand exceed 21: ");
    	if(getHandSum(p)>21){
    		System.out.println("Yes");
    		return true;
    	}       	
    	else {
    		System.out.println("No");
    		return false; 
    	}
    }
    
    /**
     * Checks if the hand achieved a Black-Jack
     * @return true if hand reached black-jack , otherwise false.
     */
   public boolean checkHandForBJ(Participant p){ 
	   System.out.print("Checking if hand is exactly 21: ");
	   if (getHandSum(p)==21){
		   System.out.println("Yes");
		   return true;
	   }
	   
	   else{
		   System.out.println("No");
		   return false;
	   }
   }
  
    /**
     * Prints the hand 
     */
    public void printHand() {
		for (int i = 0; i < hand.size(); i++) {
			Card value = hand.get(i);
			System.out.println("card: " + value.getValue()+ " of "+value.suit);

		}
	
	}
        
    @Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}
    
    /**
     * Getter for handArray
     * @returns the array list containing the cards of the hand
     */
	public ArrayList<Card> getHandArray(){
    	return this.hand;
    }
    
	 /**
	  *  Returns an iterator over this hand.
	  */
	 public Iterator<Card> iterator()
	 {
	   return hand.iterator();
	 }
	 
	 /**
	  * Resets the ace counter (for every new round in the game)
	  */
	 public void resetAceCounter(){
		 this.aceCounter=0;
	 } 
	 
	 /**
	  * get ace counter
	  */
	 public int getAceCounter(){
		return this.aceCounter;
	 } 

}

