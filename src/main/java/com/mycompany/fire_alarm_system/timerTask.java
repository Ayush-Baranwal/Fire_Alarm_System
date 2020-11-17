/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;

import static com.mycompany.fire_alarm_system.MainScreen.f0;
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
        Location.allSet();
        switch(fno){
            case 0:
                DefaultTableModel tModel1=(DefaultTableModel)jTable1.getModel();
        if(tModel1.getRowCount()!=0){
            int c =tModel1.getRowCount();
        for(int i=0;i<c;i++){
            tModel1.removeRow(0);
        }}
       
        DefaultTableModel tModel=(DefaultTableModel)jTable1.getModel();
        for(Map.Entry<String,Location> mp : f0.entrySet()){
        String data[]={mp.getKey(),String.valueOf(mp.getValue().Scvalue),String.valueOf(mp.getValue().Hcvalue),String.valueOf(mp.getValue().Ccvalue)};
        tModel.addRow(data);
        }
        
        DefaultTableModel tModel22=(DefaultTableModel)jTable2.getModel();
        if(tModel22.getRowCount()!=0){
            int c =tModel22.getRowCount();
        for(int i=0;i<c;i++){
            tModel22.removeRow(0);
        }}
        
        DefaultTableModel tModel2=(DefaultTableModel)jTable2.getModel();
        for(Map.Entry<String,Location> mp : f0.entrySet()){
            if(mp.getValue().Scvalue>Location.Stvalue){
                String d[]={mp.getValue().Sid,"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                tModel2.addRow(d);
            }
            if(mp.getValue().Hcvalue>Location.Htvalue){
                String d[]={mp.getValue().Hid,"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                tModel2.addRow(d);
            }
            if(mp.getValue().Ccvalue>Location.Ctvalue){
                String d[]={mp.getValue().Cid,"CO","Ground",mp.getKey(),"Threshold Breached!"};
                tModel2.addRow(d);
            }
            if(mp.getValue().mcp==1){
                String d[]={"N/A","Manual Callpoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                tModel2.addRow(d);
            }
        }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }
    }
    
}
