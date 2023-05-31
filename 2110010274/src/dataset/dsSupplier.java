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
public class dsSupplier {
    private ArrayList<Integer> kdSupplier;
    private ArrayList<String> nmaSupplier;
    private ArrayList<Integer> faxSupplier;
    private ArrayList<String> alamatSupplier;
    private ArrayList<String> telpSupplier;
    private ArrayList<String> emailSupplier;
    
    public dsSupplier() {
        kdSupplier = new ArrayList<Integer>();
        nmaSupplier = new ArrayList<String>();
        faxSupplier = new ArrayList<Integer>();
        alamatSupplier = new ArrayList<String>();
        telpSupplier = new ArrayList<String>();
        emailSupplier = new ArrayList<String>();
    }
    
    public void insertKdSupplier(int isi){
        this.kdSupplier.add(isi);
    }
    public ArrayList<Integer> getRecordKdSupplier(){
        return this.kdSupplier;
    }
    
    public void insertNmaSupplier(String isi){
        this.nmaSupplier.add(isi);
    }
    public ArrayList<String> getRecordNmaSupplier(){
        return this.nmaSupplier;
    }
    
    public void insertFaxSupplier(int isi){
        this.faxSupplier.add(isi);
    }
    public ArrayList<Integer> getRecordFaxSupplier(){
        return this.faxSupplier;
    }
    
    public void insertAlamatSupplier(String isi){
        this.alamatSupplier.add(isi);
    }
    public ArrayList<String> getRecordAlamatSupplier(){
        return this.alamatSupplier;
    }
    
    public void insertTelpSupplier(String isi){
        this.telpSupplier.add(isi);
    }
    public ArrayList<String> getRecordTelpSupplier(){
        return this.telpSupplier;
    }
    
    public void insertEmailSupplier(String isi){
        this.emailSupplier.add(isi);
    }
    public ArrayList<String> getRecordEmailSupplier(){
        return this.emailSupplier;
    }
    
    public void insertSupplier(int kdSupplier, String nmaSupplier, int faxSupplier, String alamatSupplier, 
            String telpSupplier, String emailSupplier){
        this.kdSupplier.add(kdSupplier);
        this.nmaSupplier.add(nmaSupplier);
        this.faxSupplier.add(faxSupplier);
        this.alamatSupplier.add(alamatSupplier);
        this.telpSupplier.add(telpSupplier);
        this.emailSupplier.add(emailSupplier);
    }
}
