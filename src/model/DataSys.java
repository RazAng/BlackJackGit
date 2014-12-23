package model;
import java.io.Serializable;



/**System Data class*/
public final class DataSys  implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//***************************************** Variables *********************************************
	/**instance of this class, loaded on the first execution of SysData.getInstance()*/
	private static DataSys instance;
	/**Boolean flag for class instance existence (singleton)*/
	private static boolean exists = false;
	
	/**current game*/
	private Game game;
	
	/**class constructor*/
	protected DataSys(){
		setNewGame(this.game);
	}
	/**
	 * set a new game
	 */
	public void setNewGame(Game game) {		
		this.game= new Game();
	}
	/**
	 * @return the game
	 */
	public Game getNewGame() {		
		return this.game;
	}
	
	/**
	 * The method creates this class's instance & provides access to it, by returning a reference (singleton).
	 * @return reference to this class's only instance, or null if reference was already returned (singleton).
	 */
	protected static DataSys getInstance() {                    
            if(instance == null){            	
			setExists(true);
			instance = new DataSys();
			return instance;
		}            
            setExists(true);           
            return instance;
           
	}

	public static boolean isExists() {
		return exists;
	}

	public static void setExists(boolean exists) {
		DataSys.exists = exists;
	}
		
}
