package model;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** 
 * A utility class for logging output text to a file
 * @author GuyK
 */
public final class MyFileLogWriter{
	
	/** an output file */
	static private File outputLogFile;
	
	/** a file writer buffer */
	static private FileWriter writer; 
	
	/**
	 * Creates a file and a writer for logging
	 */
	public static void initializeMyFileWriter(){
		//outputLogFile= new File("output.txt"+Calendar.getInstance().getTimeInMillis());
		 outputLogFile= new File("output.txt");
		 try {
            writer=new FileWriter(outputLogFile);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * Writes given text message to the log file.
	 * @param message
	 * @param isSeparatorNeeded
	 */
	public static void writeToLogFile(String message){
		try {
			writer.write(message);			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Writes separator to log file.
	 */
	public static void writeHyphenSeparatorToLogFile(){
		try {
			writer.write("\n-----------------------------------------------------------------------------");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Writes separator to log file.
	 */
	public static void writeAsteriskSeparatorToLogFile(){
		try {
			writer.write("\n****************************************************************************\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Saves the log file (by closing the file writer).
	 */
	public static void saveLogFile(){
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
