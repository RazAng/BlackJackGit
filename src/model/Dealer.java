package model;
import model.Hand;
/**
 * Dealer class 
 */
public class Dealer extends Hand implements Participant{
	//***************************************** Variables *********************************************
	/**dealer hand */
	private Hand dealerHand;
	//***************************************** Constructors ******************************************
	/**class contractor*/
	public Dealer(Hand hand) {		
			super();
			this.dealerHand=hand;			
		}	
	//***************************************** Methods ***********************************************
	/**get player method
	 * @return dealer hand
	 * */
	public Hand getHandParticipant(){
		return this.dealerHand;
	}

	/**set hand method
	 * @param hand
	 */
	public void setHand(Hand hand){
    	this.dealerHand=hand;
    }

	
	
}
