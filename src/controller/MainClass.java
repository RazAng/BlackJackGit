package controller;

/**
 * The main class of the system. 
 */
public class  MainClass {
	/**ControllerLogic reference pointer*/
	private static ControllerLogic controller;

	/**
	 * The main method of the system.
	 * @param args'
	 */
	public static void main(String[] args) {	
	
		setController(ControllerLogic.getInstance());	
			
	}

	public static ControllerLogic getController() {
		return controller;
	}

	public static void setController(ControllerLogic controller) {
		MainClass.controller = controller;
	}
	

}
