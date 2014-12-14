/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Mall {
    
    String name;
    String address;
    String boothLocation;
    ArrayList<Shift> shifts;
    String desc;
    int year;
    
    public Mall(String name, String address, String boothLocation, String desc){
        this.name = name;
        this.address = address;
        this.boothLocation = boothLocation;
        shifts = new ArrayList<Shift>();
        this.desc = desc;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getBoothLocation(){
        return boothLocation;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public void editName(String name){
        this.name = name;
    }
    
    public void editAddress(String address){
        this.address = address;
    }
    
    public void editBoothLocation(String boothLocation){
        this.boothLocation = boothLocation;
    }
    
    public void editDesc(String desc){
        this.desc = desc;
    }
    
    
}
