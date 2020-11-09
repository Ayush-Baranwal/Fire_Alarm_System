/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rajen
 */
package com.mycompany.fire_alarm_system;
import javax.swing.*;


public class Main {
    public static void main(String[] args){
    
    
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
            MainScreen M=new MainScreen();
            M.setVisible(true);
            M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
        });
//       Register_a_sensor R=new Register_a_sensor();
//       Configure_a_sensor C=new Configure_a_sensor() ;
//       Start_Monitoring S=new Start_Monitoring();
    }
    
}
