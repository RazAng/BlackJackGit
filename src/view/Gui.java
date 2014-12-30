package view;

import javax.swing.*;

import controller.ControllerLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import model.Card;
import model.Game;
import model.Hand;

/**
 *
 * @author Jessica
 */
public class Gui extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * controller instance
	 */
	public ControllerLogic controller;
	/**
	 * game instance
	 */
	private Game newGameInstance;
	/**
	 * ***********************************************************************************************************************
	 * labels and variables 
	 * ***********************************************************************************************************************
	 */

	private javax.swing.JLabel showHiddenCard;
	private javax.swing.JLabel playercardhit;
	private javax.swing.JLabel dealercardhit;
	private int hitCount = 0;
	private int dhitCount = 0;
	private int flag = 0;

	private Timer lableTimer;
	private Timer movingTimer;
	private Timer movingTimer2;
	private Timer movingTimer3;
	private Timer movingTimer4;

	int DELAY = 15; 
	int startY = 130;
	int startX = 920;
	int startY1 = 130;
	int startX1 = 920;
	int startY2 = 130;
	int startX2 = 920;
	int startY3 = 130;
	int startX3 = 920;

	Icon dealerCard1; //the image of the dealer's hidden card
	Card hidden;
	private int lableSize=0;


	/**
	 * Creates new form Black_Jack_GUI
	 *
	 * @param controller
	 */
	public Gui(ControllerLogic controller) {
		setAlwaysOnTop(true);

		initComponents();

		this.controller = controller;//new controller instance
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		dealerlable.setVisible(false);
		playerlable.setVisible(false);
		standButton.setEnabled(false);
		hitButton.setEnabled(false);
		dealButton.setEnabled(false);

		pack();
		this.setVisible(true);  
		movingTimer=new Timer(DELAY,new TimerHandler());
		movingTimer2=new Timer(DELAY, new TimerHandler1());
		movingTimer3=new Timer(DELAY, new TimerHandler2());
		movingTimer4=new Timer(DELAY, new TimerHandler3());
		lableTimer= new Timer(15, new TimerHandler4());
	}

	/**
	 * ***********************************************************************************************************************
	 * Sound Method
	 * ***********************************************************************************************************************
	 */
	public SoundClass sound(String soundAddress) {
		SoundClass sound = new SoundClass(soundAddress);
		return sound;
	}
	/****************************************************************************************************************************
	 * Animation Methods
	 ****************************************************************************************************************************/
     private class TimerHandler implements ActionListener
     {
          public void actionPerformed(ActionEvent actionEvent)
          {
               moveToDealer1();
          }
     } 

     private class TimerHandler1 implements ActionListener
     {
          public void actionPerformed(ActionEvent actionEvent)
          {
               moveToPlayer1();
          }
     } 
      private class TimerHandler2 implements ActionListener
     {
          public void actionPerformed(ActionEvent actionEvent)
          {
               moveToDealer2();
          }
     } 
      private class TimerHandler3 implements ActionListener
     {
          public void actionPerformed(ActionEvent actionEvent)
          {
               moveToPlayer2();         
          }
     } 
      private class TimerHandler4 implements ActionListener
      {
           public void actionPerformed(ActionEvent actionEvent)
           {
                enlargeLable();         
           }
      }  

      private void enlargeLable(){
    	  if(lableSize<25)
    	  {
    		  winLoseLabel.setFont(new java.awt.Font("Tahoma", 1, lableSize+1));
    		  lableSize+=1;
    	  }
   		
      }
      
     private void moveToDealer1()
     {
          if(startX>=500 && startY>=70){
          dealercard0.setBounds(startX, startY, 90, 120);
          startX = startX-21;
          startY = startY-3;         
          }
          else dealercard0.setBounds(500, 66, 90, 120);     
     }
     private void moveToPlayer1()
     {
        if(startX1>=500 && startY1<=370){
          playercard1.setBounds(startX1, startY1, 90, 120);
          startX1 = startX1-21;
          startY1 = startY1+12;
          } 
        else playercard1.setBounds(500, 366, 90, 120);
     }
     private void moveToDealer2()
     {
          if(startX2>=530 && startY2>=70){
          dealercard2.setBounds(startX2, startY2, 90, 120);
          startX2 = startX2-21;
          startY2 = startY2-3;
          }
          else dealercard2.setBounds(530, 66, 90, 120);     
     }
     private void moveToPlayer2()
     {
        if(startX3>=530 && startY3<=370){
          playercard2.setBounds(startX3, startY3, 90, 120);
          startX3 = startX3-21;
          startY3 = startY3+12;
          } 
        else playercard2.setBounds(530, 366, 90, 120);
     }

    //***************************************************************************************************************************

    /**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	//  @SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		gamePanel = new javax.swing.JPanel();
		exitButton = new javax.swing.JButton();
		newGameButton = new javax.swing.JButton();
		dealButton = new javax.swing.JButton();
		standButton = new javax.swing.JButton();
		hitButton = new javax.swing.JButton();
		playerlable = new javax.swing.JLabel();
		dealerlable = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		scorelable = new javax.swing.JLabel();
		scorePane = new javax.swing.JScrollPane();
		jTextPane2 = new javax.swing.JTextPane();
		roundNumberlable = new javax.swing.JLabel();
		roundNumberPane = new javax.swing.JScrollPane();
		jTextPane3 = new javax.swing.JTextPane();
		winslable = new javax.swing.JLabel();
		winsPane = new javax.swing.JScrollPane();
		jTextPane4 = new javax.swing.JTextPane();
		losseslable = new javax.swing.JLabel();
		lossesPane = new javax.swing.JScrollPane();
		jTextPane5 = new javax.swing.JTextPane();
		playercard1 = new javax.swing.JLabel();
		playercard2 = new javax.swing.JLabel();
		Background = new javax.swing.JLabel();
		dealercard0 = new javax.swing.JLabel();
		dealercard2 = new javax.swing.JLabel();
		winLoseLabel = new javax.swing.JLabel();
		winLoseLabel2 = new javax.swing.JLabel();
		winLoseLabel3 = new javax.swing.JLabel();
		newGameLabel = new javax.swing.JLabel();
		newGameLabel2 = new javax.swing.JLabel();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Black Jack");
		setMinimumSize(null);
		setUndecorated(true);

		gamePanel.setLayout(null);

		newGameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		newGameButton.setText("New Game");
		newGameButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				newGameButtonActionPerformed(evt);
			}
		});
		gamePanel.add(newGameButton);
		newGameButton.setBounds(10, 540, 100, 30);

		exitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		exitButton.setText("Exit");
		exitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitButtonActionPerformed(evt);
			}
		});
		gamePanel.add(exitButton);
		exitButton.setBounds(10, 10, 100, 30);

		dealButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		dealButton.setText("Deal");
		dealButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dealButtonActionPerformed(evt);
			}
		});
		gamePanel.add(dealButton);
		dealButton.setBounds(400, 540, 100, 30);

		standButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		standButton.setText("Stand");
		standButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				standButtonActionPerformed(evt);
			}
		});
		gamePanel.add(standButton);
		standButton.setBounds(620, 540, 100, 30);

		hitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		hitButton.setText("Hit");
		hitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hitButtonActionPerformed(evt);
			}
		});
		gamePanel.add(hitButton);
		hitButton.setBounds(510, 540, 100, 30);

		playerlable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		playerlable.setForeground(new java.awt.Color(255, 255, 255));
		playerlable.setText("Player :");
		gamePanel.add(playerlable);
		playerlable.setBounds(380, 410, 110, 17);

		dealerlable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		dealerlable.setForeground(new java.awt.Color(255, 255, 255));
		dealerlable.setText("Dealer :");
		gamePanel.add(dealerlable);
		dealerlable.setBounds(380, 90, 110, 17);

		winLoseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		winLoseLabel.setForeground(new java.awt.Color(255, 255, 255));
		winLoseLabel.setText("");	
		winLoseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gamePanel.add(winLoseLabel);
		winLoseLabel.setBounds(510, 250, 130, 80);
		
		winLoseLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		winLoseLabel2.setForeground(new java.awt.Color(255, 255, 255));
		winLoseLabel2.setText("");	
		winLoseLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		gamePanel.add(winLoseLabel2);
		winLoseLabel2.setBounds(320, 280, 500, 80);
		
		winLoseLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		winLoseLabel3.setForeground(new java.awt.Color(255, 255, 255));
		winLoseLabel3.setText("");	
		winLoseLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		gamePanel.add(winLoseLabel3);
		winLoseLabel3.setBounds(320, 300, 500, 80);
		
		newGameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		newGameLabel.setForeground(new java.awt.Color(255, 255, 255));
		newGameLabel.setText("");	
		newGameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gamePanel.add(newGameLabel);
		newGameLabel.setBounds(300, 250, 500, 80);
		
		newGameLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		newGameLabel2.setForeground(new java.awt.Color(255, 255, 255));
		newGameLabel2.setText("");	
		newGameLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		gamePanel.add(newGameLabel2);
		newGameLabel2.setBounds(300, 280, 500, 80);
		
		gamePanel.add(jSeparator1);
		jSeparator1.setBounds(190, 50, 730, 10);

		scorelable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		scorelable.setForeground(new java.awt.Color(255, 255, 255));
		scorelable.setText("Score :");
		gamePanel.add(scorelable);
		scorelable.setBounds(700, 20, 60, 20);

		jTextPane2.setBackground(new java.awt.Color(0, 0, 0));
		jTextPane2.setBorder(null);
		jTextPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
		scorePane.setViewportView(jTextPane2);

		gamePanel.add(scorePane);
		scorePane.setBounds(760, 15, 60, 30);

		roundNumberlable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		roundNumberlable.setForeground(new java.awt.Color(255, 255, 255));
		roundNumberlable.setText("Round Number :");
		gamePanel.add(roundNumberlable);
		roundNumberlable.setBounds(210, 20, 120, 20);

		roundNumberPane.setForeground(new java.awt.Color(255, 255, 255));

		jTextPane3.setBackground(new java.awt.Color(0, 0, 0));
		jTextPane3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jTextPane3.setForeground(new java.awt.Color(255, 255, 255));
		jTextPane3.setToolTipText("");
		roundNumberPane.setViewportView(jTextPane3);

		gamePanel.add(roundNumberPane);
		roundNumberPane.setBounds(330, 15, 50, 30);

		winslable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		winslable.setForeground(new java.awt.Color(255, 255, 255));
		winslable.setText("Wins :");
		winslable.setToolTipText("");
		gamePanel.add(winslable);
		winslable.setBounds(400, 20, 50, 20);

		winsPane.setBackground(new java.awt.Color(0, 0, 0));
		winsPane.setForeground(new java.awt.Color(255, 255, 255));
		winsPane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

		jTextPane4.setBackground(new java.awt.Color(0, 0, 0));
		jTextPane4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jTextPane4.setForeground(new java.awt.Color(255, 255, 255));
		jTextPane4.setToolTipText("");
		winsPane.setViewportView(jTextPane4);

		gamePanel.add(winsPane);
		winsPane.setBounds(450, 15, 50, 30);

		losseslable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		losseslable.setForeground(new java.awt.Color(255, 255, 255));
		losseslable.setText("Losses :");
		gamePanel.add(losseslable);
		losseslable.setBounds(520, 20, 60, 20);

		lossesPane.setBackground(new java.awt.Color(0, 0, 0));
		lossesPane.setForeground(new java.awt.Color(255, 255, 255));

		jTextPane5.setBackground(new java.awt.Color(0, 0, 0));
		jTextPane5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jTextPane5.setForeground(new java.awt.Color(255, 255, 255));
		lossesPane.setViewportView(jTextPane5);

		gamePanel.add(lossesPane);
		lossesPane.setBounds(580, 15, 50, 30);
		gamePanel.add(playercard1);
		playercard1.setBounds(500, 370, 90, 110);
		gamePanel.add(playercard2);
		playercard2.setBounds(530, 370, 90, 110);

		Background.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/TABLE-BJ.jpg"))); // NOI18N
		Background.setMaximumSize(null);
		Background.setMinimumSize(null);
		Background.setName(""); // NOI18N
		gamePanel.add(Background);
		Background.setBounds(0, 0, 1100, 620);

		dealercard0.setText("jLabel1");
		gamePanel.add(dealercard0);
		dealercard0.setBounds(500, 70, 90, 110);
		gamePanel.add(dealercard2);
		dealercard2.setBounds(530, 70, 90, 110);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
				);

		setSize(new java.awt.Dimension(1100, 620));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	//***************************************************************************************************************************
	private void exitButtonActionPerformed(ActionEvent evt) {		
		//****************************************************************************************************************************
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the game?", "BlackJack",dialogButton);
		if(dialogResult==0)
			dispose();      
		
	}
	//****************************************************************************************************************************
	private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
		//****************************************************************************************************************************
		if(flag==0){
			flag=1;
		
			sound("sounds/btnClick2.wav"); //play button sound
			//start new game
			newGameInstance = controller.StartNewGame();
			newGameInstance.newGame(); // print "new game" 
	
			//remove all the cards that were hit in previous rounds
			if ((hitCount + dhitCount) > 0) { 
				for (int i = 0; i < (hitCount + dhitCount); i++) {
					gamePanel.remove(1);
				}
				gamePanel.repaint();
				gamePanel.revalidate();
				hitCount = 0; //reset hitCound for new round
				dhitCount = 0;
			}
	
			//set labels and buttons 
			playercard1.setVisible(false);
			playercard2.setVisible(false);
			dealercard0.setVisible(false);
			dealercard2.setVisible(false);
			dealerlable.setText("Dealer : ");
			playerlable.setText("Player : ");
			dealerlable.setVisible(true);
			playerlable.setVisible(true);
			dealButton.setEnabled(true);
			hitButton.setEnabled(false);
			standButton.setEnabled(false);
			winLoseLabel.setText("");
			winLoseLabel2.setText("");
			winLoseLabel3.setText("");
			newGameLabel.setText("");
			jTextPane3.setText("");
			jTextPane4.setText("");
			jTextPane5.setText("");
			jTextPane2.setText("");
			newGameLabel.setText("New Game has started!");
			newGameLabel2.setText("Please click the 'Deal' button to strat a new round");
		}			
		else{	
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to start a new game?", "BlackJack",dialogButton);
			if(dialogResult==0){	// new game button was pressed		    
			
				sound("sounds/btnClick2.wav"); //play button sound
				//start new game
				newGameInstance = controller.StartNewGame();
				newGameInstance.newGame(); // print "new game" 
		
				//remove all the cards that were hit in previous rounds
				if ((hitCount + dhitCount) > 0) { 
					for (int i = 0; i < (hitCount + dhitCount); i++) {
						gamePanel.remove(1);
					}
					gamePanel.repaint();
					gamePanel.revalidate();
					hitCount = 0; //reset hitCound for new round
					dhitCount = 0;
				}
		
				//set labels and buttons 
				playercard1.setVisible(false);
				playercard2.setVisible(false);
				dealercard0.setVisible(false);
				dealercard2.setVisible(false);
				dealerlable.setText("Dealer : ");
				playerlable.setText("Player : ");
				dealerlable.setVisible(true);
				playerlable.setVisible(true);
				dealButton.setEnabled(true);
				hitButton.setEnabled(false);
				standButton.setEnabled(false);
				winLoseLabel.setText("");
				winLoseLabel2.setText("");
				winLoseLabel3.setText("");
				newGameLabel.setText("");
				jTextPane3.setText("");
				jTextPane4.setText("");
				jTextPane5.setText("");
				jTextPane2.setText("");
				newGameLabel.setText("New Game has started!");
				newGameLabel2.setText("Please click the 'Deal' button to strat a new round");
			}			
		}
		
	}//GEN-LAST:event_newGameButtonActionPerformed
	
	//************************************************************************************************************************
	private void dealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealButtonActionPerformed
		//*************************************************************************************************************************
		sound("sounds/shuffling-cards-1.wav"); //play shuffle and deal sound
		try {
			Thread.sleep(150);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		//reset round
		newGameInstance.resetRound();
		newGameInstance.setRoundCount(newGameInstance.getRoundCount()+1);
		winLoseLabel.setText("");
		winLoseLabel2.setText("");
		winLoseLabel3.setText("");
		newGameLabel.setText("");
		newGameLabel2.setText("");
		jTextPane3.setText(""+newGameInstance.getRoundCount());


		if ((hitCount + dhitCount) > 0) { //remove all the cards that were hit in previous rounds
			for (int i = 0; i < (hitCount + dhitCount); i++) {
				gamePanel.remove(1);
			}
			gamePanel.repaint();
			gamePanel.revalidate();
			hitCount = 0; //reset hitCound for new round
			dhitCount = 0;
		}
		//deal cards
		newGameInstance.deal();
		System.out.println("Dealer cards: ");
		newGameInstance.getDealer().printHand();
		System.out.println("Player cards: ");
		newGameInstance.getPlayer().printHand();
		/**
		 * Get's dealer and player cards from Hand and the image associated with
		 * that random card and puts them on the screen.
		 */

		//to iterate set and get current dealer cards
		Card dcard = null;
		Iterator<Card> dscan = (newGameInstance.getDealer().getHandArray()).iterator();
		int count = 0;
		while (dscan.hasNext()) {
			dcard = dscan.next();
			if (count == 0) {
				hidden=dcard;
				//create new jLable and save the image of the 'hidden' card
				showHiddenCard=new JLabel();
				showHiddenCard.setIcon(dcard.getimage()); 
			} else {
				dealercard2.setIcon(dcard.getimage());
			}
			count++;
		}

		//to iterate set and get current player cards
		Iterator<Card> pscan = (newGameInstance.getPlayer().getHandArray()).iterator();
		count = 0;
		while (pscan.hasNext()) {
			Card pcard = pscan.next();
			if (count == 0)//if first card                               					
			{
				playercard1.setIcon(pcard.getimage());
			} else {
				playercard2.setIcon(pcard.getimage());
			}
			count++;
		}

		dealercard0.setIcon(new ImageIcon(getClass().getResource("/model/images/card_back.jpg"))); //set the first dealer card to have the "hidden card" image

		//--------------- START DEAL ANIMATION-----------  

		//reset coordinates for new deal
		startY=130; 
		startY1= 130;
		startY2=130;
		startY3=130;
		startX = 920;
		startX1=920;
		startX2=920;
		startX3=920;
		
		//animate first card
		moveToDealer1();
		movingTimer.start();      
		gamePanel.add(dealercard0, 1);

		//animate second card
		moveToPlayer1();
		movingTimer2.start();      
		gamePanel.add(playercard1, 1);

		//animate third card
		moveToDealer2();
		movingTimer3.start();      
		gamePanel.add(dealercard2, 1);

		//animate fourth card
		moveToPlayer2();
		movingTimer4.start();  
		gamePanel.add(playercard2, 1);

		//---------END ANIMATION --------------------

		//display cards and sum after deal
		playercard1.setVisible(true);
		playercard2.setVisible(true);
		dealercard0.setVisible(true);
		dealercard2.setVisible(true);    
		if(hidden.getValue().getCardValue()==1) {
			dealerlable.setText("Dealer :  " + (newGameInstance.getDealer().getHandSum( newGameInstance.getDealer())-(11) )); 
		}
		else {
			dealerlable.setText("Dealer :  " + (newGameInstance.getDealer().getHandSum( newGameInstance.getDealer())-(hidden.getValue().getCardValue()) ));
		}
		playerlable.setText("Player :  " + newGameInstance.getPlayer().getHandSum( newGameInstance.getPlayer()));

		//set buttons enabled/ disabled
		hitButton.setEnabled(true);
		standButton.setEnabled(true);
		dealButton.setEnabled(false);

	}//GEN-LAST:event_dealButtonActionPerformed

	//****************************************************************************************************************************
	private void hitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitButtonActionPerformed
		//****************************************************************************************************************************
		hitCount++; //counts how many cards were hit

		sound("sounds/hit.wav"); //add the "hit" sound      
		Card hitcard = newGameInstance.hit(newGameInstance.getPlayer()); //performs the "hit" 

		//create new label for the new card
		playercardhit = new JLabel();
		playercardhit.setIcon(hitcard.getimage());

		//add and position the new card image
		gamePanel.add(playercardhit, 1);
		playercardhit.setBounds((530 + (30 * hitCount)), 370, 90, 110); //position the new card image

		gamePanel.repaint();
		gamePanel.revalidate();

		//if player busted on hit - display hidden card and update labels and buttons 
		if (newGameInstance.getPlayer().checkHandForBust(newGameInstance.getPlayer())) 
		{
			sound("sounds/lose.wav");//play lose sound

			dealercard0.setIcon(showHiddenCard.getIcon());//display the hidden card
			dealerlable.setText("Dealer :   " + newGameInstance.getDealer().getHandSum(newGameInstance.getDealer()));
			System.out.println("Player was bust");
			hitButton.setEnabled(false);
			dealButton.setEnabled(true);
			standButton.setEnabled(false);
			newGameButton.setEnabled(true);
			newGameInstance.setLossCount(newGameInstance.getLossCount()+1);
			jTextPane5.setText(""+newGameInstance.getLossCount());
			jTextPane2.setText(""+newGameInstance.calculateScore(newGameInstance.getRoundCount(), newGameInstance.getPlayer().getHandSum(newGameInstance.getPlayer()), "Lose"));
			
			//animate winLose label
			lableSize=0;
			winLoseLabel.setText("Bust");
			winLoseLabel2.setText("Please click on 'Deal' button to start a new round");
			winLoseLabel3.setText("If you what to start a new game, please click on 'New Game' button");
			enlargeLable();
			lableTimer.start();			
			repaint();
			revalidate();
		}

		//display player's sum
		playerlable.setText("Player :   " + newGameInstance.getPlayer().getHandSum( newGameInstance.getPlayer()));

	}//GEN-LAST:event_hitButtonActionPerformed

	//************************************************************************************************************************
	private void standButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standButtonActionPerformed
		//************************************************************************************************************************
		sound("sounds/Dealing_Stand.wav"); //play sound

		Hand dealerHand = newGameInstance.getDealer().getHandParticipant();
		dealerHand = newGameInstance.stand();//dealer's hand after hit until 17 or more
		newGameInstance.getDealer().setHand(dealerHand);

		dealerlable.setText(" " + dealerlable.getText());

		//iterate through cards and re-display
		Card dhitcard = null;
		Iterator<Card> scan = (newGameInstance.getDealer().getHandParticipant().getHandArray()).iterator();
		//gamePanel.remove(dealercard0);
		dealercard0.setIcon(showHiddenCard.getIcon());//display the hidden card
		while (scan.hasNext()) {
			dhitCount++;
			dhitcard = scan.next();

			if (dhitCount > 2) { //start displaying the "hit" cards                  
				dealercardhit = new JLabel();
				dealercardhit.setIcon(dhitcard.getimage());
				//add and position new dealer
				gamePanel.add(dealercardhit, 1);
				dealercardhit.setBounds((530 + (30 * (dhitCount - 2))), 70, 90, 110); //position the new hit card image
				gamePanel.repaint();
				gamePanel.revalidate();
			}
		}

		dealerlable.setText("Dealer : " + newGameInstance.getDealer().getHandSum(newGameInstance.getDealer())); //get the whole sum including the hidden card
		playerlable.setText("Player : " + newGameInstance.getPlayer().getHandSum(newGameInstance.getPlayer()));

		//play sound and update win/loss textbox
		if (newGameInstance.winner(newGameInstance.getPlayer(), newGameInstance.getDealer()) == "Win") {
			sound("sounds/youWin.wav");
			newGameInstance.setWinCount(newGameInstance.getWinsCount()+1);
			jTextPane4.setText(""+newGameInstance.getWinsCount());
		} else if (newGameInstance.winner(newGameInstance.getPlayer(), newGameInstance.getDealer()) == "Lose") {
			sound("sounds/lose.wav");
			newGameInstance.setLossCount(newGameInstance.getLossCount()+1);
			jTextPane5.setText(""+newGameInstance.getLossCount());
		} else {
			sound("sounds/blackjack.wav");
			newGameInstance.setWinCount(newGameInstance.getWinsCount()+1);
			jTextPane4.setText(""+newGameInstance.getWinsCount());
		}

		jTextPane2.setText(""+newGameInstance.calculateScore(newGameInstance.getRoundCount(), newGameInstance.getPlayer().getHandSum(newGameInstance.getPlayer()), newGameInstance.winner(newGameInstance.getPlayer(), newGameInstance.getDealer())));
		//animate win-lose label
		winLoseLabel.setText(newGameInstance.winner(newGameInstance.getPlayer(), newGameInstance.getDealer()));
		winLoseLabel2.setText("Please click on 'Deal' button to start a new round");
		winLoseLabel3.setText("If you what to start a new game, please click on 'New Game' button");
		lableSize=0;
		enlargeLable();
		lableTimer.start();
		//set buttons
		hitButton.setEnabled(false);
		standButton.setEnabled(false);
		dealButton.setEnabled(true);
		newGameButton.setEnabled(true);
	}//GEN-LAST:event_standButtonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	//    public static void main(String args[]) {
	//        /* Set the Nimbus look and feel */
	//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	//         */
	//        try {
	//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	//                if ("Nimbus".equals(info.getName())) {
	//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	//                    break;
	//                }
	//            }
	//        } catch (ClassNotFoundException ex) {
	//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	//        } catch (InstantiationException ex) {
	//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	//        } catch (IllegalAccessException ex) {
	//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	//            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	//        }
	//        //</editor-fold>
	//        //</editor-fold>
	//
	//        /* Create and display the form */
	//        java.awt.EventQueue.invokeLater(new Runnable() {
	//            public void run() {
	//              //  new Gui(controller).setVisible(true);
	//            }
	//        });
	//    }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton exitButton;
	private javax.swing.JLabel Background;
	private javax.swing.JButton dealButton;
	private javax.swing.JLabel dealercard0;
	private javax.swing.JLabel dealercard2;
	private javax.swing.JLabel dealerlable;
	private javax.swing.JPanel gamePanel;
	private javax.swing.JButton hitButton;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextPane jTextPane2;
	private javax.swing.JTextPane jTextPane3;
	private javax.swing.JTextPane jTextPane4;
	private javax.swing.JTextPane jTextPane5;
	private javax.swing.JScrollPane lossesPane;
	private javax.swing.JLabel losseslable;
	private javax.swing.JButton newGameButton;
	private javax.swing.JLabel playercard1;
	private javax.swing.JLabel playercard2;
	private javax.swing.JLabel playerlable;
	private javax.swing.JScrollPane roundNumberPane;
	private javax.swing.JLabel roundNumberlable;
	private javax.swing.JScrollPane scorePane;
	private javax.swing.JLabel scorelable;
	private javax.swing.JButton standButton;
	private javax.swing.JScrollPane winsPane;
	private javax.swing.JLabel winslable;
	private javax.swing.JLabel winLoseLabel;
	private javax.swing.JLabel winLoseLabel2;
	private javax.swing.JLabel winLoseLabel3;
	private javax.swing.JLabel newGameLabel;
	private javax.swing.JLabel newGameLabel2;
	
	// End of variables declaration//GEN-END:variables
}
