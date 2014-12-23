package model;
import model.Hand;
/**
 * Player class 
 */
public class Player extends Hand implements Participant{
	//***************************************** Variables *********************************************
	/**player hand */
	private Hand playerHand;
	//***************************************** Constructors ******************************************
	/**class contractor*/
	public Player(Hand hand) {
		super();
		this.playerHand=hand;		
	}
	//***************************************** Methods ***********************************************
	/**get player method
	 * @return player hand
	 * */
	public Hand getHandParticipant() {
		return this.playerHand;
	} 
	
	
	
}
