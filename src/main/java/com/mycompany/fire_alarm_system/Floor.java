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

    Floor(){
       f0=new ArrayList<>(11);
       f1=new ArrayList<>(11);
       f2=new ArrayList<>(11);
       f3=new ArrayList<>(11);
       f4=new ArrayList<>(11);
       f5=new ArrayList<>(11);
       
       for(int i=0;i<6;i++){
           Location l=new Location();
           l.loc="Room "+String.valueOf(i+1);
           f0.add(l);
           f1.add(l);
           f2.add(l);
           f3.add(l);
           f4.add(l);
           f5.add(l);
       }
       for(int i=0;i<2;i++){
           Location l=new Location();
           l.loc="Lab "+String.valueOf(i+1);
           f0.add(l);
           f1.add(l);
           f2.add(l);
           f3.add(l);
           f4.add(l);
           f5.add(l);
       }
       for(int i=0;i<2;i++){
           Location l=new Location();
           l.loc="Stairs "+String.valueOf(i+1);
           f0.add(l);
           f1.add(l);
           f2.add(l);
           f3.add(l);
           f4.add(l);
           f5.add(l);
       }
       for(int i=0;i<1;i++){
           Location l=new Location();
           l.loc="Hall";
           f0.add(l);
           f1.add(l);
           f2.add(l);
           f3.add(l);
           f4.add(l);
           f5.add(l);
       }
    }
}
