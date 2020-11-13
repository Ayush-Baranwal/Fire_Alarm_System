/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogGenerator {
    
    public static void main(String[] args) {
 
		Logger FireAlarmLogger = Logger.getLogger("FireAlarmLog");
 
		// Simple file logging Handler.
		FileHandler FileHandler;
		
		try {
 
			// We are setting handler to true = append data to file
			FileHandler = new FileHandler("C:\\Users\\HP\\Documents\\Code-Base\\Fire-Alarm-System\\src\\main\\java\\com\\mycompany\\fire_alarm_system\\FireAlarm.log", true);
			FireAlarmLogger.addHandler(FileHandler);
 
			// Print a brief summary of the LogRecord in a human readable format.
			SimpleFormatter formatter = new SimpleFormatter();	
			FileHandler.setFormatter(formatter);
			
 
 
			// infinite loop
			while (true) {
				// Log an INFO message.
                                for(int i=0;i<6;i++){
                                     String log = "Floor" + i + "\n"; 
                                     log += "Location: Room 1: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Room 2: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Room 3: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Room 4: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Room 5: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Room 6: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Lab 1: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: lab 2: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Stairs 1: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Strairs 2: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";
                                     log += "Location: Hall: ";
                                     log += "CO Sensor " + 1 + " Heat Sensor " + 2 + " Smoke Sensor " + 3 + "\n";    
                                     FireAlarmLogger.info(log);    
                                }
				Thread.sleep(100000);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
	}
    
}