package controller;

import java.io.IOException;

import model.Game;
import model.ModelLogic;

import view.ViewLogic;
/**
 * controllerLogic class 
 */
public class ControllerLogic implements I_ControllerLogic{
	//***************************************** Variables *********************************************
		/**instance of this class, loaded on the first execution of ControllerLogic.getInstance()*/
		private static ControllerLogic instance;
		/**Boolean flag for class instance existence */
		private static boolean exists = false;
		/**ViewLogic reference pointer*/
		private static ViewLogic view;
		/**ModelLogic reference pointer*/
		private static ModelLogic model;
		//***************************************** Constructors ******************************************
		/**
		 * Full contractor
		 */
		private ControllerLogic() {
			
		}
		//***************************************** Methods ***********************************************
		/**
		 * The method creates this class's instance & provides access to it, by returning a reference.
		 * @return reference to this class's only instance, or null if reference was already returned.
		 */
		protected static ControllerLogic getInstance() {
			try {
				if(! exists){				
					exists = true;
					model = ModelLogic.getInstance(); 
	                               instance = new ControllerLogic();
				        view = ViewLogic.getInstance(instance);
					view.executeNewGameView();				
					return instance;
				}
			} catch (IOException e) {			
				System.err.println("Error: cannot initialize ModelLogic, please contact you administrator!");
				e.printStackTrace(); 
			}return instance;
		}
		//***************************************** CRUD Methods ******************************************
		/**
		 * The method call the new game method from modelLogic class		
		 */
		public Game StartNewGame() {
			Game game = model.StartNewGame();
			return game;
		}

}
