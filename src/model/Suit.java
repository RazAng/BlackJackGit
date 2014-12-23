package model;
/**
 * Suit class enum
 */
public enum Suit {
	HEARTS,
	SPADES,
	CLUBS,
	DIAMONDS;
	
	   //***************************************** Variables *********************************************
		/**the value of the card - an int from 1-10**/
		private Suit suitValue;
		
		//***************************************** Constructors ******************************************
		/**constructor of CardValue 
		 * @param value- the numerical value of the card **/
		private Suit ()
		{
			
		}
		//***************************************** Methods ***********************************************
		/**Getter for cardValue
		 * @returns the numerical value of a card**/
		public Suit getSuitValue() {
			return suitValue;
		}
}

