package Junit;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import model.Card;
import model.CardValue;
import model.Dealer;
import model.Game;
import model.Hand;
import model.Player;
import model.Suit;

import org.junit.Test;

/** Junit test class for Blackjack.
 * @author Maayan 
 * JUnit test 1-  check for sum of the dealer hand = 5 
 * JUnit test 2-  check for sum of the dealer hand = 24 
 * JUnit test 3-  check for sum of the player hand = 5     
 * JUnit test 4-  check for sum of the player hand = 24   
 * JUnit test 5-  check cardValue
 * JUnit test 6-  check player roles for ace
 * JUnit test 7-  check dealer roles for ace 
 * JUnit test 8 - check dealer roles for ace: 
 * JUnit test 9-  check if dealer hand was reset 
 * JUnit test 10- check if player hand was reset 
 * JUnit test 11- check if player is not busted
 * JUnit test 12- check if player is busted
 * JUnit test 13- check if dealer is not busted
 * JUnit test 14- check if dealer is busted
 * JUnit test 15- check for player BJ: player doesn't have BJ
 * JUnit test 16- check for player BJ: player have BJ 
 * JUnit test 17- check for dealer BJ: player doesn't have BJ
 * JUnit test 18- check for dealer BJ: player have BJ 
 * JUnit test 19- check if player lose
 * JUnit test 20- check if player win
 * JUnit test 21- check player score in the end of a game 
 */

public class BlackJackTest {	
	
	/*******************************************************************************
    JUnit test 1 - check for sum of the dealer hand = 5        
    ********************************************************************************/
	@Test
	public void test_DealerHandSum1() {		
		//create new CardValue
		CardValue value1 = CardValue.values()[1];
		CardValue value2 = CardValue.values()[2];
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[1];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("2h.jpg");
		ImageIcon card2 = new ImageIcon("3s.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer		
	
	//	System.out.println("JUnit tets: dealer hand sum equals: " +dealer.getHandSum());
		
		//test if the dealer hand equals 5
		assertEquals(5, dealer.getHandSum(dealer));
	}
	/*******************************************************************************
    JUnit test 2 - check for sum of the dealer hand = 24   
    ********************************************************************************/
	@Test
	public void test_DealerHandSum2() {	
		
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[2];
		CardValue value3 = CardValue.values()[8];
		CardValue value4 = CardValue.values()[0];
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];
		Suit suit3 = Suit.values()[1];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("3c.jpg");
		ImageIcon card3 = new ImageIcon("9s.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);
		Card c3 = new Card(card3, value3, suit3);		
		Card c4 = new Card(card1, value4, suit1);
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer
		dealer.addCard(c3);	//add card to dealer
		dealer.addCard(c4);	//add card to dealer	
		
	 //   System.out.println("JUnit tets: dealer hand sum equals: " +dealer.getHandSum());
		
		//test if the dealer hand equals 24
		assertEquals(14, dealer.getHandSum(dealer));
	}
	/*******************************************************************************
    JUnit test 3 -check for sum of the dealer hand = 5        
    ********************************************************************************/
	@Test
	public void test_PlayerHandSum1() {		
		//create new CardValue
		CardValue value1 = CardValue.values()[1];
		CardValue value2 = CardValue.values()[2];
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[1];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("2h.jpg");
		ImageIcon card2 = new ImageIcon("3s.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer		
	
	//	System.out.println("JUnit tets: player hand sum equals: " +player.getHandSum());
		
		//test if the dealer hand equals 5
		assertEquals(5, player.getHandSum(player));
	}
	/*******************************************************************************
     JUnit test 4 -check for sum of the player hand = 24   
    ********************************************************************************/
	@Test
	public void test_PlayerHandSum2() {	
		
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[2];
		CardValue value3 = CardValue.values()[8];
		CardValue value4 = CardValue.values()[0];
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];
		Suit suit3 = Suit.values()[1];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("3c.jpg");
		ImageIcon card3 = new ImageIcon("9s.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);
		Card c3 = new Card(card3, value3, suit3);		
		Card c4 = new Card(card1, value4, suit1);
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		player.addCard(c3);	//add card to dealer
		player.addCard(c4);	//add card to dealer
	
	//	System.out.println("JUnit tets: player hand sum equals: " +player.getHandSum());
		
		//test if the dealer hand equals 24
		assertEquals(24, player.getHandSum(player));
	}
	/*******************************************************************************
    JUnit test 5 - check cardValue
    ********************************************************************************/
	@Test
	public void test_CheckCardValue() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];
		CardValue value3 = CardValue.values()[2];
		CardValue value4 = CardValue.values()[3];	
		CardValue value5 = CardValue.values()[4];		
		CardValue value6 = CardValue.values()[5];		
		CardValue value7 = CardValue.values()[6];	
		CardValue value8 = CardValue.values()[7];	
		CardValue value9 = CardValue.values()[8];	
		CardValue value10 = CardValue.values()[9];	
		CardValue value11 = CardValue.values()[10];	
		CardValue value12 = CardValue.values()[11];	
		CardValue value13 = CardValue.values()[12];					
		
	    assertSame(1, value1.getCardValue());
	    assertSame(2, value2.getCardValue());
	    assertSame(3, value3.getCardValue());
	    assertSame(4, value4.getCardValue());
	    assertSame(5, value5.getCardValue());
	    assertSame(6, value6.getCardValue());
	    assertSame(7, value7.getCardValue());
	    assertSame(8, value8.getCardValue());
	    assertSame(9, value9.getCardValue());
	    assertSame(10, value10.getCardValue());
	    assertSame(10, value11.getCardValue());
	    assertSame(10, value12.getCardValue());
	    assertSame(10, value13.getCardValue());		   
    }
	/*******************************************************************************
    JUnit test 6 - check player roles for ace: 
                     - 1 is equal to 11, the first time it is dealt to the player. 
                     - The next "1" will be equal to its natural value.
                   sum of player hand with 3 aces + 2 = 15 
    ********************************************************************************/
	@Test
	public void test_CheckPlayerRolesForAce() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];
		CardValue value3 = CardValue.values()[0];
		CardValue value4 = CardValue.values()[0];
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];
		Suit suit3 = Suit.values()[1];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");
		ImageIcon card3 = new ImageIcon("aces.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);
		Card c3 = new Card(card3, value3, suit3);		
		Card c4 = new Card(card1, value4, suit1);
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		player.addCard(c3);	//add card to dealer
		player.addCard(c4);	//add card to dealer
	
	//	System.out.println("JUnit tets: chaeck for aces - player hand sum equals: " +player.getHandSum());
		
		//test if the dealer hand equals 24
		assertEquals(15, player.getHandSum(player));	   
     }	
	/*******************************************************************************
    JUnit test 7 - check dealer roles for ace: 
                     1 counts as 11 unless it causes the dealer to bust.
                   sum of player hand with 3 aces + 2 = 15 
    ********************************************************************************/
	@Test
	public void test_CheckDealerRolesForAce1() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];
		CardValue value3 = CardValue.values()[0];
		CardValue value4 = CardValue.values()[0];
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];
		Suit suit3 = Suit.values()[1];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");
		ImageIcon card3 = new ImageIcon("aces.jpg");
		ImageIcon card4 = new ImageIcon("aceh.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);
		Card c3 = new Card(card3, value3, suit3);		
		Card c4 = new Card(card4, value4, suit1);
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer
		dealer.addCard(c3);	//add card to dealer
		dealer.addCard(c4);	//add card to dealer
	
		//System.out.println("JUnit tets: chaeck for aces - dealer hand sum equals: " +dealer.getHandSum(dealer));
		//System.out.println("JUnit tets: chaeck aceCounter: " +dealer.getAceCounter());
		
		//test if the dealer hand equals 24
		assertEquals(15, dealer.getHandSum( dealer));	   
    }	
	/*******************************************************************************
    JUnit test 8 - check dealer roles for ace: 
                     1 counts as 11 unless it causes the dealer to bust.
                    sum of player hand  = 21 
    ********************************************************************************/
	@Test
	public void test_CheckDealerRolesForAce2() {
		//create new CardValue
		CardValue value1 = CardValue.values()[12];
		CardValue value2 = CardValue.values()[0];
				
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];
		
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");		
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);
				
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer		
	
		//System.out.println("JUnit tets: chaeck for aces - dealer hand sum equals: " +dealer.getHandSum(dealer));
		//System.out.println("JUnit tets: chaeck aceCounter: " +dealer.getAceCounter());
		
		//test if the dealer hand equals 24
		assertEquals(21, dealer.getHandSum( dealer));	   
    }	
	/*******************************************************************************
    JUnit test 9 - check if dealer hand was reset 
    ********************************************************************************/
	@Test
	public void test_CheckIfDealerHandWasReset() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];				
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];				
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");				
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);				
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer
		
		dealer.resetAceCounter();
		dealer.getHandArray().clear();//clear dealer hand			
		
		System.out.println("JUnit tets: hand was reset: " +dealer.getHandSum(dealer));
		
		//test if the dealer was reset
		assertEquals(0, dealer.getHandSum(dealer));	   
    }	
	/*******************************************************************************
    JUnit test 10 - check if player hand was reset 
    ********************************************************************************/
	@Test
	public void test_CheckIfPlayerHandWasReset() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];				
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];				
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");				
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);				
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		
		player.resetAceCounter();
		player.getHandArray().clear();//clear player hand				
		
		//test if the player hand was reset
		assertEquals(0, player.getHandSum(player));	   
    }	
	/*******************************************************************************
    JUnit test 11 - check if player is not busted
    ********************************************************************************/
	@Test
	public void test_CheckIfPlayerIsNotBusted() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];				
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];				
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");				
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);				
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		
		//test if the player hand is bust
		assertEquals(false, player.checkHandForBust(player));	   
     }	
	/*******************************************************************************
    JUnit test 12 - check if player is busted
    ********************************************************************************/
	@Test
	public void test_CheckIfPlayerIsBusted() {
		//create new CardValue
		CardValue value1 = CardValue.values()[9];
		CardValue value2 = CardValue.values()[9];
		CardValue value3 = CardValue.values()[9];	
		
		//create new Suit
		Suit suit1 = Suit.values()[0];	
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("9h.jpg");
		ImageIcon card2 = new ImageIcon("9h.jpg");
		ImageIcon card3 = new ImageIcon("9h.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit1);
		Card c3 = new Card(card3, value3, suit1);	
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		player.addCard(c3);	//add card to dealer
		
		//test if the player hand is bust
		assertEquals(true, player.checkHandForBust(player));	   
     }	
	/*******************************************************************************
    JUnit test 13 - check if dealer is not busted
    ********************************************************************************/
	@Test
	public void test_CheckIfDealerIsNotBusted() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];				
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];				
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");				
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);				
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer				
		
		//test if the dealer hand is bust
		assertEquals(false, dealer.checkHandForBust(dealer));	   
     }	
	/*******************************************************************************
    JUnit test 14 - check if dealer is busted
    ********************************************************************************/
	@Test
	public void test_CheckIfDealerIsBusted() {
		//create new CardValue
		CardValue value1 = CardValue.values()[9];
		CardValue value2 = CardValue.values()[9];
		CardValue value3 = CardValue.values()[9];	
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("9h.jpg");
		ImageIcon card2 = new ImageIcon("9h.jpg");
		ImageIcon card3 = new ImageIcon("9h.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit1);
		Card c3 = new Card(card3, value3, suit1);	
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer
		dealer.addCard(c3);	//add card to dealer			
		
		//test if the dealer hand is bust
		assertEquals(true, dealer.checkHandForBust(dealer));	   
     }
	/*******************************************************************************
    JUnit test 15 - check for player BJ: player doesn't have BJ
    ********************************************************************************/
	@Test
	public void test_CheckForPlayerBJ_NoBJ() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];				
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];				
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");				
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);				
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		
		//test if the player have BJ
		assertEquals(false, player.checkHandForBJ(player)	);	   
     }	
	/*******************************************************************************
    JUnit test 16- check for player BJ: player  have BJ 
    ********************************************************************************/
	@Test
	public void test_CheckForPlayerBJ_HaveBJ() {
		//create new CardValue
		CardValue value1 = CardValue.values()[5];
		CardValue value2 = CardValue.values()[6];
		CardValue value3 = CardValue.values()[7];	
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("6h.jpg");
		ImageIcon card2 = new ImageIcon("7h.jpg");
		ImageIcon card3 = new ImageIcon("8h.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit1);
		Card c3 = new Card(card3, value3, suit1);	
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		player.addCard(c3);	//add card to dealer
		
		//test if the player have BJ
		assertEquals(true, player.checkHandForBJ(player));	   
     }	
	/*******************************************************************************
    JUnit test 17 - check for dealer BJ: dealer doesn't have BJ
    ********************************************************************************/
	@Test
	public void test_CheckForDealerBJ_NoBJ() {
		//create new CardValue
		CardValue value1 = CardValue.values()[0];
		CardValue value2 = CardValue.values()[1];				
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		Suit suit2 = Suit.values()[2];				
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("aceh.jpg");
		ImageIcon card2 = new ImageIcon("2c.jpg");				
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit2);				
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer
		
		//test if dealer have BJ
		assertEquals(false, dealer.checkHandForBJ(dealer)	);	   
     }	
	/*******************************************************************************
    JUnit test 18 - check for dealer BJ: dealer  have BJ 
    ********************************************************************************/
	@Test
	public void test_CheckForDealerBJ_HaveBJ() {
		//create new CardValue
		CardValue value1 = CardValue.values()[5];
		CardValue value2 = CardValue.values()[6];
		CardValue value3 = CardValue.values()[7];	
		
		//create new Suit
		Suit suit1 = Suit.values()[0];
		
		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("6h.jpg");
		ImageIcon card2 = new ImageIcon("7h.jpg");
		ImageIcon card3 = new ImageIcon("8h.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card2, value2, suit1);
		Card c3 = new Card(card3, value3, suit1);	
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer
		dealer.addCard(c3);	//add card to dealer
		
		//test if dealer have BJ
		assertEquals(true, dealer.checkHandForBJ(dealer));	   
     }	
	/*******************************************************************************
    JUnit test 19 - check if player loss  
    ********************************************************************************/
	@Test
	public void test_CheckIfPlayerloss() {
		//create new CardValue
		CardValue value1 = CardValue.values()[4];
		CardValue value3 = CardValue.values()[8];	
		CardValue value4 = CardValue.values()[9];	
		
		//create new Suit
		Suit suit1 = Suit.values()[0];

		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("5h.jpg");
		ImageIcon card2 = new ImageIcon("9h.jpg");
		ImageIcon card3 = new ImageIcon("10h.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card1, value1, suit1);
		Card c3 = new Card(card2, value3, suit1);
		Card c4 = new Card(card3, value4, suit1);	
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Player		
		Player player = new Player(dh);	
		player.addCard(c1);	//add card to dealer
		player.addCard(c2);	//add card to dealer
		
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c3);	//add card to dealer
		dealer.addCard(c4);	//add card to dealer		
		
		Game game = new Game();
		
		//test if player lose
		assertEquals("Lose", game.winner(player, dealer));	   
     }	
	/*******************************************************************************
    JUnit test 20 - check if player win 
    ********************************************************************************/
	@Test
	public void test_CheckIfPlayerWin() {
		//create new CardValue
		CardValue value1 = CardValue.values()[4];
		CardValue value3 = CardValue.values()[8];	
		CardValue value4 = CardValue.values()[9];	
		
		//create new Suit
		Suit suit1 = Suit.values()[0];

		//create new ImageIcon
		ImageIcon card1 = new ImageIcon("5h.jpg");
		ImageIcon card2 = new ImageIcon("9h.jpg");
		ImageIcon card3 = new ImageIcon("10h.jpg");
		
		//create new Card
		Card c1 = new Card(card1, value1, suit1);		
		Card c2 = new Card(card1, value1, suit1);
		Card c3 = new Card(card2, value3, suit1);
		Card c4 = new Card(card3, value4, suit1);	
		
		//create new Hand		
		Hand dh = new Hand();
		
		//create new Player		
		Player player = new Player(dh);	
		player.addCard(c3);	//add card to dealer
		player.addCard(c4);	//add card to dealer
				
		//create new Dealer		
		Dealer dealer = new Dealer(dh);	
		dealer.addCard(c1);	//add card to dealer
		dealer.addCard(c2);	//add card to dealer
		
		Game game = new Game();
		
		//test if player win
		assertEquals("Win", game.winner(player, dealer));	   
     }	
	/*******************************************************************************
    * JUnit test 21- check player score in the end of a game 
    ********************************************************************************/
	@Test
	public void test_CheckPlayerScoreAfterRound() {			
		
		Game game = new Game();	//new game	
		
		assertEquals(10, game.calculateScore(1, 5, "Win"));	//new round		
		assertEquals(-20, game.calculateScore(2, 10, "Lose")); //new round	
		
        game = new Game();//new game     	
		
		assertEquals(42, game.calculateScore(1, 21, "BlackJack"));	//new round			
		assertEquals(12, game.calculateScore(2, 10, "Lose"));//new round				
		assertEquals(2, game.calculateScore(3, 5, "Lose"));	//new round	
			
	}	
	
}
