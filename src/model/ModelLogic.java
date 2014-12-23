package model;
import java.io.IOException;
import model.Game;


/**
 * model logic class 
 */
public final class ModelLogic implements I_ModelLogic{
	//***************************************** Variables *********************************************
	/**Instance of this class, loaded on the first execution of ModelLogic.getInstance()*/
	private static ModelLogic instance;
	/**Boolean flag for class instance existence*/
	private static boolean exists = false;
	/**data reference pointer*/
	private static DataSys dData; 	
	
	//***************************************** Constructors ******************************************
	/**
	 * Full contractor
	 * @throws IOException 
	 */
	private ModelLogic()  {		
		
	}
	//***************************************** Methods ***********************************************
	/**
	 * The method creates this class's instance & provides access to it, by returning a reference.
	 * @return reference to this class's only instance, or null if reference was already returned.
	 * @throws GeneralException 
	 */
	public static ModelLogic getInstance() throws IOException {
		if(! exists){			
			dData = DataSys.getInstance();                        
			if(dData != null){				
				exists = true;				
				instance  = new ModelLogic();                               
				return instance;
			}
		}return null;
	}
	//***************************************** CRUD Methods ******************************************
	/**
	 * The method get the reference game from DataSys class.
	 * @return game.		
	 */
	public Game StartNewGame()  {			
			Game game = null;
			dData.setNewGame(game);
			game = dData.getNewGame();
		    return game;		
     }
}
	
	


