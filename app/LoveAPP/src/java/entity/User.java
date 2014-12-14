/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author ASUS
 */
public class User {
    
    private String name;
    private String nickName;
    private int hpNumber;
    private int hNumber;
    private String email;
    private String password;
    private String company;
    private int year;
    private boolean admin;
    
    public User(String name, String nickName, int hpNumber, int hNumber, String email, String password, String company, int year, boolean admin){
        
        this.name = name;
        this.nickName = nickName;
        this.hpNumber = hpNumber;
        this.hNumber = hNumber;
        this.email = email;
        this.password = password;
        this.company = company;
        this.year = year;
        this.admin = admin;        
    }
    
    public String getName(){
        return name;
    }
    
    public String getNickName(){
        return nickName;
    }
    
    public int getHpNumber(){
        return hpNumber;
    }
    
    public int getHNum(){
        return hNumber;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getCompany(){
        return company;
    }
    
    public int getYear(){
        return year;
    }
    
    public boolean isAdmin(){
        return admin;
    }
    
    public void editName(String name){
        this.name = name;
    }
    
    public void editNickName(String nickName){
        this.nickName = nickName;
    }
    
    public void editHpNumber(int hpNumber){
        this.hpNumber = hpNumber;
    }
    
    public void editHNumber(int hNumber){
        this.hNumber = hNumber;
    }
    
    public void editPassword(String password){
        this.password = password;
    }
    
    public void editCompany(String company){
        this.company = company;
    }
    
    public void editAdmin(boolean admin){
        this.admin = admin;
    }
    
}
