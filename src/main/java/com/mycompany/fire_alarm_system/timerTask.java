/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;

import static com.mycompany.fire_alarm_system.MainScreen.f0;
import static com.mycompany.fire_alarm_system.MainScreen.f1;
import static com.mycompany.fire_alarm_system.MainScreen.f2;
import static com.mycompany.fire_alarm_system.MainScreen.f3;
import static com.mycompany.fire_alarm_system.MainScreen.f4;
import static com.mycompany.fire_alarm_system.MainScreen.f5;
import static com.mycompany.fire_alarm_system.Start_Monitoring.fno;
import static com.mycompany.fire_alarm_system.Start_Monitoring.jTable1;
import static com.mycompany.fire_alarm_system.Start_Monitoring.jTable2;
import java.util.Map;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajen
 */
public class timerTask extends TimerTask{

    @Override
    public void run() {
        switch(fno){
            case 0:
                Location.allSet();
        DefaultTableModel tm01=(DefaultTableModel)jTable1.getModel();
        if(tm01.getRowCount()!=0){
            int c =tm01.getRowCount();
        for(int i=0;i<c;i++){
            tm01.removeRow(0);
        }}
       
        DefaultTableModel tm02=(DefaultTableModel)jTable1.getModel();
        for(Map.Entry<String,Location> mp : f0.entrySet()){
        String data[]={mp.getKey(),String.valueOf(mp.getValue().Scvalue),String.valueOf(mp.getValue().Hcvalue),String.valueOf(mp.getValue().Ccvalue)};
        tm02.addRow(data);
        }
        
//        DefaultTableModel tm03=(DefaultTableModel)jTable2.getModel();
//        if(tm03.getRowCount()!=0){
//            int c =tm03.getRowCount();
//        for(int i=0;i<c;i++){
//            tm03.removeRow(0);
//        }}
        
        DefaultTableModel tm04=(DefaultTableModel)jTable2.getModel();
        for(Map.Entry<String,Location> mp : f0.entrySet()){
            if(mp.getValue().Scvalue>Location.Stvalue){
                String d[]={mp.getValue().Sid,"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                tm04.addRow(d);
            }
            if(mp.getValue().Hcvalue>Location.Htvalue){
                String d[]={mp.getValue().Hid,"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                tm04.addRow(d);
            }
            if(mp.getValue().Ccvalue>Location.Ctvalue){
                String d[]={mp.getValue().Cid,"CO","Ground",mp.getKey(),"Threshold Breached!"};
                tm04.addRow(d);
            }
            if(mp.getValue().mcp==1){
                String d[]={"N/A","Manual Callpoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                tm04.addRow(d);
            }
        }
            case 1:
                Location.allSet();
                DefaultTableModel tm11=(DefaultTableModel)jTable1.getModel();
        if(tm11.getRowCount()!=0){
            int c =tm11.getRowCount();
        for(int i=0;i<c;i++){
            tm11.removeRow(0);
        }}
       
        DefaultTableModel tm12=(DefaultTableModel)jTable1.getModel();
        for(Map.Entry<String,Location> mp : f1.entrySet()){
        String data[]={mp.getKey(),String.valueOf(mp.getValue().Scvalue),String.valueOf(mp.getValue().Hcvalue),String.valueOf(mp.getValue().Ccvalue)};
        tm12.addRow(data);
        }
        
//        DefaultTableModel tm13=(DefaultTableModel)jTable2.getModel();
//        if(tm13.getRowCount()!=0){
//            int c =tm13.getRowCount();
//        for(int i=0;i<c;i++){
//            tm13.removeRow(0);
//        }}
        
        DefaultTableModel tm14=(DefaultTableModel)jTable2.getModel();
        for(Map.Entry<String,Location> mp : f1.entrySet()){
            if(mp.getValue().Scvalue>Location.Stvalue){
                String d[]={mp.getValue().Sid,"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                tm14.addRow(d);
            }
            if(mp.getValue().Hcvalue>Location.Htvalue){
                String d[]={mp.getValue().Hid,"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                tm14.addRow(d);
            }
            if(mp.getValue().Ccvalue>Location.Ctvalue){
                String d[]={mp.getValue().Cid,"CO","Ground",mp.getKey(),"Threshold Breached!"};
                tm14.addRow(d);
            }
            if(mp.getValue().mcp==1){
                String d[]={"N/A","Manual Callpoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                tm14.addRow(d);
            }
        }
            case 2:
                Location.allSet();
                DefaultTableModel tm21=(DefaultTableModel)jTable1.getModel();
        if(tm21.getRowCount()!=0){
            int c =tm21.getRowCount();
        for(int i=0;i<c;i++){
            tm21.removeRow(0);
        }}
       
        DefaultTableModel tm22=(DefaultTableModel)jTable1.getModel();
        for(Map.Entry<String,Location> mp : f2.entrySet()){
        String data[]={mp.getKey(),String.valueOf(mp.getValue().Scvalue),String.valueOf(mp.getValue().Hcvalue),String.valueOf(mp.getValue().Ccvalue)};
        tm22.addRow(data);
        }
        
//        DefaultTableModel tm23=(DefaultTableModel)jTable2.getModel();
//        if(tm23.getRowCount()!=0){
//            int c =tm23.getRowCount();
//        for(int i=0;i<c;i++){
//            tm23.removeRow(0);
//        }}
        
        DefaultTableModel tm24=(DefaultTableModel)jTable2.getModel();
        for(Map.Entry<String,Location> mp : f2.entrySet()){
            if(mp.getValue().Scvalue>Location.Stvalue){
                String d[]={mp.getValue().Sid,"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                tm24.addRow(d);
            }
            if(mp.getValue().Hcvalue>Location.Htvalue){
                String d[]={mp.getValue().Hid,"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                tm24.addRow(d);
            }
            if(mp.getValue().Ccvalue>Location.Ctvalue){
                String d[]={mp.getValue().Cid,"CO","Ground",mp.getKey(),"Threshold Breached!"};
                tm24.addRow(d);
            }
            if(mp.getValue().mcp==1){
                String d[]={"N/A","Manual Callpoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                tm24.addRow(d);
            }
        }
            case 3:
                Location.allSet();
                DefaultTableModel tm31=(DefaultTableModel)jTable1.getModel();
        if(tm31.getRowCount()!=0){
            int c =tm31.getRowCount();
        for(int i=0;i<c;i++){
            tm31.removeRow(0);
        }}
       
        DefaultTableModel tm32=(DefaultTableModel)jTable1.getModel();
        for(Map.Entry<String,Location> mp : f3.entrySet()){
        String data[]={mp.getKey(),String.valueOf(mp.getValue().Scvalue),String.valueOf(mp.getValue().Hcvalue),String.valueOf(mp.getValue().Ccvalue)};
        tm32.addRow(data);
        }
        
//        DefaultTableModel tm33=(DefaultTableModel)jTable2.getModel();
//        if(tm33.getRowCount()!=0){
//            int c =tm33.getRowCount();
//        for(int i=0;i<c;i++){
//            tm33.removeRow(0);
//        }}
        
        DefaultTableModel tm34=(DefaultTableModel)jTable2.getModel();
        for(Map.Entry<String,Location> mp : f3.entrySet()){
            if(mp.getValue().Scvalue>Location.Stvalue){
                String d[]={mp.getValue().Sid,"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                tm34.addRow(d);
            }
            if(mp.getValue().Hcvalue>Location.Htvalue){
                String d[]={mp.getValue().Hid,"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                tm34.addRow(d);
            }
            if(mp.getValue().Ccvalue>Location.Ctvalue){
                String d[]={mp.getValue().Cid,"CO","Ground",mp.getKey(),"Threshold Breached!"};
                tm34.addRow(d);
            }
            if(mp.getValue().mcp==1){
                String d[]={"N/A","Manual Callpoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                tm34.addRow(d);
            }
        }
            case 4:
                Location.allSet();
                DefaultTableModel tm41=(DefaultTableModel)jTable1.getModel();
        if(tm41.getRowCount()!=0){
            int c =tm41.getRowCount();
        for(int i=0;i<c;i++){
            tm41.removeRow(0);
        }}
       
        DefaultTableModel tm42=(DefaultTableModel)jTable1.getModel();
        for(Map.Entry<String,Location> mp : f4.entrySet()){
        String data[]={mp.getKey(),String.valueOf(mp.getValue().Scvalue),String.valueOf(mp.getValue().Hcvalue),String.valueOf(mp.getValue().Ccvalue)};
        tm42.addRow(data);
        }
        
//        DefaultTableModel tm43=(DefaultTableModel)jTable2.getModel();
//        if(tm43.getRowCount()!=0){
//            int c =tm43.getRowCount();
//        for(int i=0;i<c;i++){
//            tm43.removeRow(0);
//        }}
        
        DefaultTableModel tm44=(DefaultTableModel)jTable2.getModel();
        for(Map.Entry<String,Location> mp : f4.entrySet()){
            if(mp.getValue().Scvalue>Location.Stvalue){
                String d[]={mp.getValue().Sid,"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                tm44.addRow(d);
            }
            if(mp.getValue().Hcvalue>Location.Htvalue){
                String d[]={mp.getValue().Hid,"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                tm44.addRow(d);
            }
            if(mp.getValue().Ccvalue>Location.Ctvalue){
                String d[]={mp.getValue().Cid,"CO","Ground",mp.getKey(),"Threshold Breached!"};
                tm44.addRow(d);
            }
            if(mp.getValue().mcp==1){
                String d[]={"N/A","Manual Callpoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                tm44.addRow(d);
            }
        }
            case 5:
                Location.allSet();
                DefaultTableModel tm51=(DefaultTableModel)jTable1.getModel();
        if(tm51.getRowCount()!=0){
            int c =tm51.getRowCount();
        for(int i=0;i<c;i++){
            tm51.removeRow(0);
        }}
       
        DefaultTableModel tm52=(DefaultTableModel)jTable1.getModel();
        for(Map.Entry<String,Location> mp : f5.entrySet()){
        String data[]={mp.getKey(),String.valueOf(mp.getValue().Scvalue),String.valueOf(mp.getValue().Hcvalue),String.valueOf(mp.getValue().Ccvalue)};
        tm52.addRow(data);
        }
        
//        DefaultTableModel tm53=(DefaultTableModel)jTable2.getModel();
//        if(tm53.getRowCount()!=0){
//            int c =tm53.getRowCount();
//        for(int i=0;i<c;i++){
//            tm53.removeRow(0);
//        }}
        
        DefaultTableModel tm54=(DefaultTableModel)jTable2.getModel();
        for(Map.Entry<String,Location> mp : f5.entrySet()){
            if(mp.getValue().Scvalue>Location.Stvalue){
                String d[]={mp.getValue().Sid,"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                tm54.addRow(d);
            }
            if(mp.getValue().Hcvalue>Location.Htvalue){
                String d[]={mp.getValue().Hid,"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                tm54.addRow(d);
            }
            if(mp.getValue().Ccvalue>Location.Ctvalue){
                String d[]={mp.getValue().Cid,"CO","Ground",mp.getKey(),"Threshold Breached!"};
                tm54.addRow(d);
            }
            if(mp.getValue().mcp==1){
                String d[]={"N/A","Manual Callpoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                tm54.addRow(d);
            }
        }
        }
    }
    
}
