package view;

import java.io.IOException;

import controller.ControllerLogic;
/**
 * class view. 
 */
public class ViewLogic {
	   //***************************************** Variables *********************************************
		/**instance of this class*/
		private static ViewLogic instance;
		/**Boolean flag for class instance existence */
		private static boolean exists = false;
	    /**ControllerLogic reference*/
	    private  ControllerLogic controller;
	        
		//***************************************** Constructors ******************************************
		/**
		 * Full contractor
		 */
		private ViewLogic(ControllerLogic cl) {
			this.controller=cl;		                
		}
		//***************************************** Methods ***********************************************
		/**
		 * The method creates this class's instance & provides access to it, by returning a reference.
		 * @return reference to this class's only instance, or null if reference was already returned.
		 * @throws GeneralException 
		 */
		public static ViewLogic getInstance(ControllerLogic controller) throws IOException {
			if(! exists){	
				exists = true;
				instance  = new ViewLogic(controller);
				return instance;				
			}return null;
		}
		
		/**
		 * The method get the controllerlogic
	         @return controller
		 */ 
	    public ControllerLogic  getControllerLogic() {
			 return controller;
		}
	     
	    
	     /**
		  * The method operate the game window        
		 */ 
		public void executeNewGameView() {
		     new Gui(controller);		     
		}		
}
