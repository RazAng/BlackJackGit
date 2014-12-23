package model;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Hand;
import model.Player;
/**
 * Game class 
 */
public class Game  {
	//***************************************** Variables *********************************************
	/**dealer */
	private Dealer dealer;
	/**player */
	private Player player;
	/**deck of cards */
	private Deck deck;	
	
	//***************************************** Constructors ******************************************
	/**class contractor*/
	public Game() {		
		this.dealer=new Dealer(new Hand());
		this.player=new Player(new Hand());
		this.deck=new Deck();		 
	}
	//***************************************** Methods ***********************************************
	
	/**get dealer method
	 * @return dealer
	 * */
	public Dealer getDealer() {
		return this.dealer;
	} 
	
	/**get player method
	 * @return player
	 * */
	public Player getPlayer() {
		return this.player;
	} 
	
	/**get deck method
	 * @return deck
	 * */
	public Deck  getDeck() {
		return this.deck;
	} 
	/*******************************************************************************
    new Game method - start new game- all records of previous game will be deleted* 
    ********************************************************************************/
	public void newGame() {
		System.out.println("********************************************************");
		System.out.println("new game has started");		
	}
	/***********************************************************
    deal method - Deal the 2 initial cards for each participant. 
    Starts a new round in a game*    
    ***********************************************************/
	public void deal() { 
		player.resetAceCounter();
		dealer.resetAceCounter();
		player.clear(); //clear hand array for player
		dealer.clear(); //clear hand array for dealer

		deck.shuffle();		
		for (int i=0; i<2; i++) {
			dealer.addCard(deck.dealCard());
			player.addCard(deck.dealCard());					
		}
		System.out.println("New round has Started! ");
		System.out.println("Dealer hand: "+dealer.getHandSum(dealer)+ "\nPlayer Hand: " + player.getHandSum(player));	
	}
	
	/***********************************************************
	Hit method - gives another card to the player 	    
	***********************************************************/
	public Card hit(Hand participant) {
		Card dealtCard=deck.dealCard();
		participant.addCard(dealtCard); //add the card to the hand
		System.out.println("Player pressed on Hit and got: "+dealtCard.getValue()+" of "+dealtCard.suit);
		return dealtCard;
	}

	/**********************************************************************
    winner method - determines the winner of the game and returns a string 
	 **********************************************************************/
	public String winner(Player p, Dealer d)	{
		String result = "";
		if((p.getHandSum(player) < d.getHandSum(dealer)) &&  
				d.getHandSum(dealer) <= 21 ){                 
			result = "Lose";
			System.out.println("Player lost");
		}
		else if ((p.getHandSum(player) == d.getHandSum(dealer)) && //push
				d.getHandSum(dealer) <= 21 ){
			result = "Lose";
			System.out.println("Player lost");
		}
		else if ((p.getHandSum(player)==21 && d.getHandSum(dealer)<21)||
				p.getHandSum(player)==21 && d.getHandSum(dealer)>21){
			result = "BlackJack";
			System.out.println("Player won! :) ");
		}
		else 
		{
			result = "Win";
			System.out.println("Player won! :) ");
		}
		return result;
	}
	
	/***********************************************************
    Stand method - adds cards to the dealer's hand
    until the value is >= 16
    ***********************************************************/
	 public Hand stand() {//dealer plays
	   Hand result = dealer;
	   
	   System.out.println("The player pressed stand button");	
	  
	   while(dealer.getHandSum(dealer) <= 16){
		   Card dealtCard=deck.dealCard();
		   dealer.addCard(dealtCard);;
	     System.out.println("Dealer got the card: "+dealtCard.getValue()+" of "+dealtCard.suit);
	   }	  
	   return result;	
	 }
	 /********************************************************************
     ResetRound method - create new deck. clear player and dealer hands.	 
    *********************************************************************/
	 public void resetRound() {
		this.deck=new Deck();
		player.getHandArray().clear();
		dealer.getHandArray().clear();
		System.out.println("Hands and deck were reseted");
	}
		
}

