package model;
/**
 * CardValue class 
 */

public enum CardValue {
	
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(10),
	QUEEN(10),
	KING(10);
	
	//***************************************** Variables *********************************************
	/**the value of the card - an int from 1-10**/
	private int cardValue;
	//***************************************** Constructors ******************************************
	/**constructor of CardValue 
	 * @param value- the numerical value of the card **/
	private CardValue (int value)
	{
		this.cardValue = value;
	}
	//***************************************** Methods ***********************************************
	/**Getter for cardValue
	 * @returns the numerical value of a card**/
	public int getCardValue() {
			return cardValue;
	}
}
