/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class dsUser {
    private ArrayList<String> userId;
    private ArrayList<String> passId;
    private ArrayList<Integer> levelUser;
    
    public dsUser() {
        userId = new ArrayList<String>();
        passId = new ArrayList<String>();
        levelUser = new ArrayList<Integer>();
    }
    
    public void insertUserId(String isi){
        this.userId.add(isi);
    }
    public ArrayList<String> getRecordUserId(){
        return this.userId;
    }
    
    public void insertPassId(String isi){
        this.passId.add(isi);
    }
    public ArrayList<String> getRecordPassId(){
        return this.passId;
    }
    
    public void insertLevelUser(int isi){
        this.levelUser.add(isi);
    }
    public ArrayList<Integer> getRecordLevelUser(){
        return this.levelUser;
    }
    
    public void insertUser(String userId, String passId, int levelUser){
        this.userId.add(userId);
        this.passId.add(passId);
        this.levelUser.add(levelUser);
    }
}
