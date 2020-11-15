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
    static int Sdur, Hdur, Cdur, log, vol;
    float Scvalue, Hcvalue, Ccvalue;
    String Sid, Hid, Cid;
    Location(){
        Scvalue=0;
        Hcvalue=0;
        Ccvalue=0;
        Sid=""; 
        Hid=""; 
        Cid="";   
    }
    
//    public void setLoc(Sensor s){
//        loc=s.location;
//    }
    public static void conSsensor(int d, int v, int l, float t){
        Sdur=d; vol=v; log=l; Stvalue=t;
    }
    public static void conHsensor(int d, int v, int l, float t){
        Hdur=d; vol=v; log=l; Htvalue=t;
    }
    public static void conCsensor(int d, int v, int l, float t){
        Cdur=d; vol=v; log=l; Ctvalue=t;
    }
    public void setScvalue(){
        float min=Stvalue/2;
        float max=(float) (Stvalue*1.5);
        Scvalue=RandomGenerator.RandomGenerator(min, max);
    }
    public void setHcvalue(){
        float min=Htvalue/2;
        float max=(float) (Htvalue*1.5);
        Hcvalue=RandomGenerator.RandomGenerator(min, max);
    }
    public void setCcvalue(){
        float min=Ctvalue/2;
        float max=(float) (Ctvalue*1.5);
        Ccvalue=RandomGenerator.RandomGenerator(min, max);
    }
    }

