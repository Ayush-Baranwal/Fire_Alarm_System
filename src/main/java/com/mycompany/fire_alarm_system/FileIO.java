/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AADHARSH
 */
package com.mycompany.fire_alarm_system;
import java.io.*;

public class FileIO {
    
    public String filepath;
    
    public void WriteObjectToFile(Object serObj) {
 
        filepath = "D:\\Fire-Alarm-System\\src\\Data\\Exercise17_03.dat";
        
        try {
            File file = new File(filepath);
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void ReadObjectFromFile(Object serObj) {
        
        try{    
            File file = new File(filepath);
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            serObj = objectIn.readObject();
            System.out.println(serObj);
            Sensor s = (Sensor)serObj;
            System.out.println(s.SensorType);
            
        } catch (Exception ex){
            
        }
        
    }
    
}
