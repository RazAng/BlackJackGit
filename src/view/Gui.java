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
     * the labels to represent the cards for the game
     * ***********************************************************************************************************************
     */
    //JLabel playercard1;
    //JLabel playercard2;
    private javax.swing.JLabel playercardhit;
    //JLabel dealercard0;
    //JLabel dealercard2;
    //JLabel dealercard1;
    private javax.swing.JLabel dealercardhit;
    private int hitCount = 0;
    private int dhitCount = 0;
    
    private Timer movingTimer;
   // private Timer movingTimer2;
  //  private Timer movingTimer3;
   // private Timer movingTimer4;
     int startY = 130;
     int startX = 920;
     int DELAY = 18;
     
     int startY1 = 130;
     int startX1 = 920;
     
     int startY2 = 130;
     int startX2 = 920;
    
     int startY3 = 130;
     int startX3 = 920;


    Icon dealerCard1; //the image of the dealer's hidden card
    Card hidden;
    
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
//************************************************* ANIMATION ********************************************************************
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
     
     private void moveToDealer1()
     {
          if(startX>=500 && startY>=70){
          dealercard0.setBounds(startX, startY, 90, 120);
          startX = startX-21;
          startY = startY-3;
          }
          else dealercard0.setBounds(500, 67, 90, 120);     
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
          else dealercard2.setBounds(530, 67, 90, 120);     
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
        newGameButton = new javax.swing.JButton();
        dealButton = new javax.swing.JButton();
        standButton = new javax.swing.JButton();
        hitButton = new javax.swing.JButton();
        playerlable = new javax.swing.JLabel();
        dealerlable = new javax.swing.JLabel();
        winlosebox = new javax.swing.JScrollPane();
        winlose = new javax.swing.JTextPane();
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

        winlosebox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        winlose.setBackground(new java.awt.Color(0, 102, 51));
        winlose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0)));
        winlose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        winlose.setForeground(new java.awt.Color(255, 255, 255));
        winlose.setToolTipText("");
        winlosebox.setViewportView(winlose);

        gamePanel.add(winlosebox);
        winlosebox.setBounds(10, 10, 110, 40);
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

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed

        System.out.println("y: "+startY);
        System.out.println("X: "+startX);
        newGameInstance = controller.StartNewGame();
        newGameInstance.newGame(); // print "new game" 
        newGameInstance.resetRound();	 //reset hands and deck 

        if ((hitCount + dhitCount) > 0) { //remove all the cards that were hit in previous rounds
            for (int i = 0; i < (hitCount + dhitCount); i++) {
                gamePanel.remove(1);
            }
            gamePanel.repaint();
            gamePanel.revalidate();
            hitCount = 0; //reset hitCound for new round
            dhitCount = 0;
        }
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
        winlose.setText("");
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void dealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealButtonActionPerformed

        sound("sounds/shuffling-cards-1.wav"); //play shuffle and deal sound
        try {
            Thread.sleep(150);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        
        newGameInstance.resetRound();
        winlose.setText("");

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
                dealerCard1 = new ImageIcon("" + dcard.getimage()); //save the hidden card image for later use
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

        dealercard0.setIcon(new ImageIcon("card_back.jpg")); //set the first dealer card to have the "hidden card" image
         //---------------------------------------- DEAL CARDS-ANIMATION --------------------------------------------------
       
        startY=130; 
        startY1= 130;
        startY2=130;
        startY3=130;
        startX = 920;
        startX1=920;
        startX2=920;
        startX3=920;

        moveToDealer1();
        movingTimer = new Timer(DELAY,new TimerHandler());
        movingTimer.start();      
        gamePanel.add(dealercard0, 1);
        
        moveToPlayer1();
        movingTimer = new Timer(DELAY,new TimerHandler1());
        movingTimer.start();      
        gamePanel.add(playercard1, 1);

        moveToDealer2();
        movingTimer = new Timer(DELAY,new TimerHandler2());
        movingTimer.start();      
        gamePanel.add(dealercard2, 1);
 
        moveToPlayer2();
        movingTimer = new Timer(DELAY,new TimerHandler3());
        movingTimer.start();  
        gamePanel.add(playercard2, 1);
 
        //--------------------------------------------------------------------------------------------------------------------------------

        playercard1.setVisible(true);
        playercard2.setVisible(true);
        dealercard0.setVisible(true);
        dealercard2.setVisible(true);
        
       dealerlable.setText("Dealer :  " + (newGameInstance.getDealer().getHandSum( newGameInstance.getDealer())-(hidden.getValue().getCardValue()) ));        
       playerlable.setText("Player :  " + newGameInstance.getPlayer().getHandSum( newGameInstance.getPlayer()));

        hitButton.setEnabled(true);
        standButton.setEnabled(true);
        dealButton.setEnabled(false);
      

    }//GEN-LAST:event_dealButtonActionPerformed

    private void hitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitButtonActionPerformed
        hitCount++; //counts how many cards were hit

        sound("sounds/hit.wav"); //add the "hit" sound      
        Card hitcard = newGameInstance.hit(newGameInstance.getPlayer()); //performs the "hit" 

        //create new lable for the new card
        playercardhit = new JLabel();
        playercardhit.setIcon(hitcard.getimage());

        //add and position the new card image
        gamePanel.add(playercardhit, 1);
        playercardhit.setBounds((530 + (30 * hitCount)), 370, 90, 110); //position the new card image

        gamePanel.repaint();
        gamePanel.revalidate();

        if (newGameInstance.getPlayer().checkHandForBust(newGameInstance.getPlayer())) //if player busted
        {
            sound("sounds/lose.wav");//play lose sound

            dealercard0.setIcon(dealerCard1);//display the hidden card
            dealerlable.setText("Dealer :   " + newGameInstance.getDealer().getHandSum(newGameInstance.getDealer()));
            System.out.println("Player was bust");
            winlose.setText("Bust");
            hitButton.setEnabled(false);
            dealButton.setEnabled(true);
            standButton.setEnabled(false);
            newGameButton.setEnabled(true);
            repaint();
            revalidate();
        }
        playerlable.setText("Player :   " + newGameInstance.getPlayer().getHandSum( newGameInstance.getPlayer()));
    }//GEN-LAST:event_hitButtonActionPerformed

    private void standButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standButtonActionPerformed
        sound("sounds/Dealing_Stand.wav");
//        gamePanel.revalidate();
//        gamePanel.repaint();
        Hand dealerHand = newGameInstance.getDealer().getHandParticipant();
        dealerHand = newGameInstance.stand();//dealer's hand after hit until 17 or more
        newGameInstance.getDealer().setHand(dealerHand);//-----------------------------

        // gamePanel.remove(dealercard0);
        // gamePanel.remove(dealercard2);
        dealerlable.setText(" " + dealerlable.getText());

        //iterate through cards and re-display
        Card dhitcard = null;
        Iterator<Card> scan = (newGameInstance.getDealer().getHandParticipant().getHandArray()).iterator();
        //gamePanel.remove(dealercard0);
        dealercard0.setIcon(dealerCard1);//display the hidden card
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

        //play sound
        if (newGameInstance.winner(newGameInstance.getPlayer(), newGameInstance.getDealer()) == "Win") {
            sound("sounds/youWin.wav");
        } else if (newGameInstance.winner(newGameInstance.getPlayer(), newGameInstance.getDealer()) == "Lose") {
            sound("sounds/lose.wav");
        } else {
            sound("sounds/blackjack.wav");
        }

        winlose.setText(newGameInstance.winner(newGameInstance.getPlayer(), newGameInstance.getDealer()));
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
//                new Gui(controller).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextPane winlose;
    private javax.swing.JScrollPane winlosebox;
    private javax.swing.JScrollPane winsPane;
    private javax.swing.JLabel winslable;
    // End of variables declaration//GEN-END:variables
}
