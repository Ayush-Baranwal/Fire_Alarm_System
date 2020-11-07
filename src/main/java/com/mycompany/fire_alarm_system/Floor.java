/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;
import java.util.ArrayList;

/**
 *
 * @author rajen
 */
public class Floor {
    static ArrayList<Location> f0,f1,f2,f3,f4,f5 ;

//    static{
//       floor=new Location[6][11];
//    }
    Floor(){
       f0=new ArrayList<>(11);
       f1=new ArrayList<>(11);
       f2=new ArrayList<>(11);
       f3=new ArrayList<>(11);
       f4=new ArrayList<>(11);
       f5=new ArrayList<>(11);
    }
}
