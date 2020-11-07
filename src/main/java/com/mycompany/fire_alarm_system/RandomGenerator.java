/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;
import java.util.Random ;
/**
 *
 * @author sahil
 */
public class RandomGenerator {
    float Thresholdvalue ;
    float Min = Thresholdvalue/2 ;
    float Max = Thresholdvalue*2 ;
     
    public static float RandomGenerator(float Min, float Max)
    {
        Random rand ;
        rand = new Random();
        float RandNum =  Min + rand.nextFloat()*(Max-Min);
        return RandNum ;
    } 
    
    
}
