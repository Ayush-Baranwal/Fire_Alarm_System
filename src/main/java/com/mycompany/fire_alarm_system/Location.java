/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;

/**
 *
 * @author rajen
 */
/**
Stvalue, Htvalue, Ctvalue, Scvalue, Hcvalue, Ccvalue, Sid, Hid, Cid,;
*/
public class Location {
    static float Stvalue, Htvalue, Ctvalue;
    static int Sdur, Hdur, Cdur, Slog, Clog, Hlog, vol;
    float Scvalue, Hcvalue, Ccvalue;
    String loc;
    String Sid, Hid, Cid;
    Location(){
        Stvalue=0;
        Htvalue=0;
        Ctvalue=0;
        Scvalue=0;
        Hcvalue=0;
        Ccvalue=0; 
        Sid=Hid=Cid=loc="N/A";   
    }
    public void regSsensor(Sensor s){
        Sid=s.SensorID;
    }
    public void regHsensor(Sensor s){
        Hid=s.SensorID;
    }
    public void regCsensor(Sensor s){
        Cid=s.SensorID;
    }
    
    public void setLoc(Sensor s){
        loc=s.location;
    }
    public static void conSsensor(int d, int v, int l, float t){
        Sdur=d; vol=v; Slog=l; Stvalue=t;
    }
    public static void conHsensor(int d, int v, int l, float t){
        Hdur=d; vol=v; Hlog=l; Htvalue=t;
    }
    public static void conCsensor(int d, int v, int l, float t){
        Cdur=d; vol=v; Clog=l; Ctvalue=t;
    }
    }

