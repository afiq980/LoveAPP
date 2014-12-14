/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import org.joda.time.*;

/**
 *
 * @author ASUS
 */
public class Shift {
    
    Mall mall;
    DateTime datetime;
    Duration duration;
    Assign assign;
    
    public Shift(Mall mall, int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int minute){
        this.mall = mall;
        this.datetime = new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour);
        this.duration =  Duration.standardMinutes(minute);
    }
    
    
}
