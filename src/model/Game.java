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
	/**counts the rounds in a game**/
	private int roundCount;
	/**counts the player's wins in a game*/
	private int winsCount;
	/**counts the player's losses in a game*/
	private int lossCount;
	/**holds the player's game score*/
	private int score;
	//***************************************** Constructors ******************************************
	/**class contractor*/
	public Game() {		
		this.dealer=new Dealer(new Hand());
		this.player=new Player(new Hand());
		this.deck=new Deck();	
		this.roundCount=0;
		this.winsCount=0;
		this.lossCount=0;
		this.score=0;
	}
	//***************************************** Getters and Setters ************************************
	
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
	/**get roundCount 
	 * @return roundCount
	 */
	public int getRoundCount(){
		return this.roundCount;
	}
	
	public void setRoundCount(int newCount) {
		this.roundCount=newCount;
	}
	public int getWinsCount(){
		return this.winsCount;
	}
	
	public void setWinCount(int newWinCount) {
		this.winsCount=newWinCount;
	}
	public int getLossCount(){
		return this.lossCount;
	}
	
	public void setLossCount(int newLossCount) {
		this.lossCount=newLossCount;
	}
	
	public int getScore(){
		return this.score;
	}
	
	public void setScore(int newScore) {
		this.score=newScore;
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
	 /********************************************************************
	  * calculateScore method - calculate player's score at the end of a round
	  ********************************************************************/
	 public int calculateScore(int round, int handSum, String result) {
		 if (round%2==0 && result=="Win" || round%2==0 && result=="BlackJack") //if round is even && win 
			 this.score = score+(handSum*3);
		 
		 else if (round%2 != 0 && result=="Win" || round%2 != 0 && result=="BlackJack")//if round is un-even && win 
			 this.score = score+(handSum*2);
		 
		 else if (round%2==0 && result=="Lose")//if round is even && Lose
			 this.score = score+(handSum*(-3));
			 
		 else if (round%2 != 0 && result=="Lose")//if round is un-even && Lose
			 this.score = score+(handSum*(-2));
		 
		 return score;
		 
	 }
		
}

