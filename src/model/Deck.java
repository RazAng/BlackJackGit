package model;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

/**
 * Deck class 
 */
public class Deck {
	//***************************************** Variables *********************************************
	/**ArrayList of cards in a deck*/
	private ArrayList<Card> deck;
	/**the suit of the card (diamond/hart/clubs/spades)*/
	private ArrayList<ImageIcon>cards;
	/**picture cards*/	
	protected ImageIcon cardPic;
	/**picture of deck*/
	protected ImageIcon deckdPic;
	
	/*************************************************************************************************************************
	 create ImageIcons for all cards that will be inserted for every card in the constructor 
	 ************************************************************************************************************************/
	ImageIcon card1 = new ImageIcon("aceh.jpg");
	ImageIcon card2 = new ImageIcon("aces.jpg");
	ImageIcon card3 = new ImageIcon("acec.jpg");
	ImageIcon card4 = new ImageIcon("aced.jpg");
	ImageIcon card5 = new ImageIcon("2h.jpg");
	ImageIcon card6 = new ImageIcon("2s.jpg");
	ImageIcon card7 = new ImageIcon("2c.jpg");
	ImageIcon card8 = new ImageIcon("2d.jpg");
	ImageIcon card9 = new ImageIcon("3h.jpg");
	ImageIcon card10 = new ImageIcon("3s.jpg");
	ImageIcon card11 = new ImageIcon("3c.jpg");
	ImageIcon card12 = new ImageIcon("3d.jpg");
	ImageIcon card13 = new ImageIcon("4h.jpg");
	ImageIcon card14 = new ImageIcon("4s.jpg");
	ImageIcon card15 = new ImageIcon("4c.jpg");
	ImageIcon card16 = new ImageIcon("4d.jpg");
	ImageIcon card17 = new ImageIcon("5h.jpg");
	ImageIcon card18 = new ImageIcon("5s.jpg");
	ImageIcon card19 = new ImageIcon("5c.jpg");
	ImageIcon card20 = new ImageIcon("5d.jpg");
	ImageIcon card21 = new ImageIcon("6h.jpg");
	ImageIcon card22 = new ImageIcon("6s.jpg");
	ImageIcon card23 = new ImageIcon("6c.jpg");
	ImageIcon card24 = new ImageIcon("6d.jpg");
	ImageIcon card25 = new ImageIcon("7h.jpg");
	ImageIcon card26 = new ImageIcon("7s.jpg");
	ImageIcon card27 = new ImageIcon("7c.jpg");
	ImageIcon card28 = new ImageIcon("7d.jpg");
	ImageIcon card29 = new ImageIcon("8h.jpg");
	ImageIcon card30 = new ImageIcon("8s.jpg");
	ImageIcon card31 = new ImageIcon("8c.jpg");
	ImageIcon card32 = new ImageIcon("8d.jpg");
	ImageIcon card33 = new ImageIcon("9h.jpg");
	ImageIcon card34 = new ImageIcon("9s.jpg");
	ImageIcon card35 = new ImageIcon("9c.jpg");
	ImageIcon card36 = new ImageIcon("9d.jpg");
	ImageIcon card37 = new ImageIcon("10h.jpg");
	ImageIcon card38 = new ImageIcon("10s.jpg");
	ImageIcon card39 = new ImageIcon("10c.jpg");
	ImageIcon card40 = new ImageIcon("10d.jpg");
	ImageIcon card41 = new ImageIcon("jackh.jpg");
	ImageIcon card42 = new ImageIcon("jacks.jpg");
	ImageIcon card43 = new ImageIcon("jackc.jpg");
	ImageIcon card44 = new ImageIcon("jackd.jpg");
	ImageIcon card45 = new ImageIcon("queenh.jpg");
	ImageIcon card46 = new ImageIcon("queens.jpg");
	ImageIcon card47 = new ImageIcon("queenc.jpg");
	ImageIcon card48 = new ImageIcon("queend.jpg");
	ImageIcon card49 = new ImageIcon("kingh.jpg");
	ImageIcon card50 = new ImageIcon("kings.jpg");
	ImageIcon card51 = new ImageIcon("kingc.jpg");
	ImageIcon card52 = new ImageIcon("kingd.jpg");
	
	
	
	//***************************************** Constructors ******************************************
	/**
	 * Constructor.  Create an unshuffled deck of cards.
	 */  
	public Deck () {
		this.deck = new ArrayList<Card>();
		this.cards = new ArrayList<ImageIcon>();
		addCardImg();
		int h=0;
		for (int i=0; i<13; i++) {
			CardValue value = CardValue.values()[i];
			for (int j=0; j<4; j++) {
				Card card = new Card(cards.get(h) ,value, Suit.values()[j]);
				this.deck.add(card);
				h++;
			}
		}
		
		deckdPic = new ImageIcon("DeckImg.png");
	}	
	//***************************************** Methods ***********************************************
	/**Add the card images to an arrayList that will be used to construct the deck*/
	
	private void addCardImg () {
		cards.add(0, card1);
		cards.add(1, card2);
		cards.add(2, card3);
		cards.add(3, card4);
		cards.add(4, card5);
		cards.add(5, card6);
		cards.add(6, card7);
		cards.add(7, card8);
		cards.add(8, card9);
		cards.add(9, card10);
		cards.add(10, card11);
		cards.add(11, card12);
		cards.add(12, card13);
		cards.add(13, card14);
		cards.add(14, card15);
		cards.add(15, card16);
		cards.add(16, card17);
		cards.add(17, card18);
		cards.add(18, card19);
		cards.add(19, card20);
		cards.add(20, card21);
		cards.add(21, card22);
		cards.add(22, card23);
		cards.add(23, card24);
		cards.add(24, card25);
		cards.add(25, card26);
		cards.add(26, card27);
		cards.add(27, card28);
		cards.add(28, card29);
		cards.add(29, card30);
		cards.add(30, card31);
		cards.add(31, card32);
		cards.add(32, card33);
		cards.add(33, card34);
		cards.add(34, card35);
		cards.add(35, card36);
		cards.add(36, card37);
		cards.add(37, card38);
		cards.add(38, card39);
		cards.add(39, card40);
		cards.add(40, card41);
		cards.add(41, card42);
		cards.add(42, card43);
		cards.add(43, card44);
		cards.add(44, card45);
		cards.add(45, card46);
		cards.add(46, card47);
		cards.add(47, card48);
		cards.add(48, card49);
		cards.add(49, card50);
		cards.add(50, card51);
		cards.add(51, card52);
	}

	/**
	 * Shuffle the deck into a random order.
	 */
	public void shuffle() {
		Collections.shuffle(deck);
		System.out.println("Deck was shuffled");
	}

	/**
	 * As cards are dealt from the deck, the number of 
	 * cards left decreases.  This function returns the 
	 * number of cards that are still left in the deck.
	 */
	private int cardsLeft() {
		return deck.size();
	}

	/**
	 * Deals one card from the deck and returns it.
	 */
	public Card dealCard(){
		if (cardsLeft()>0){ 
			Card carddealt=deck.remove(0);
			return carddealt;
		}
		else return null;
	}

/**
 * prints the deck 
 */
	public void printDeck() {
		for (int i = 0; i < deck.size(); i++) {
			Card value = deck.get(i);
			System.out.println("card: " + value.getValue()+ " of "+value.suit);

		}
	}

	/**
	 * Returns the image of the deck.
	 */
	public ImageIcon getimageDeck(){
		return deckdPic;
	}
	
}

