package model;

import javax.swing.ImageIcon;
/**
 * Card class 
 */

public class Card {
	//***************************************** Variables *********************************************
	/**picture cards*/
	protected ImageIcon cardPic;	
	/**the suit of the card (diamond/hart/clubs/spades)*/
	protected Suit suit;
	/**the value of the card  */
	private CardValue cardValue;
	/**Creates a card with a specified suit and value.*/
	//***************************************** Constructors ******************************************
	/**Constructor for Card**/
	public Card (ImageIcon pic ,CardValue cardValue, Suit suit)
	{
		this.cardPic=pic;
		this.cardValue = cardValue;
		this.suit = suit;
	}
	//***************************************** Methods ***********************************************
	/**
	 * Returns the suit of this card.
	 * @returns the suit, which is Card.SPADES, 
	 * Card.HEARTS, Card.DIAMONDS or Card.CLUBS
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * Returns the value of this card.
	 * @return the value, which is one of the numbers 1 through 10.
	 */
	public CardValue getValue() {
		return cardValue;
	}
	
	 /**  Returns the image of the card.
	  * @returns the image of the card **/
	 public ImageIcon getimage(){
	   return cardPic;
	 }

}
