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
public class dsBarang {
    private ArrayList<Integer> kdBrg;
    private ArrayList<String> nmaBrg;
    private ArrayList<Integer> satuan;
    private ArrayList<Integer> hrgBeli;
    private ArrayList<Integer> hrgJual;
    
    public dsBarang() {
        kdBrg = new ArrayList<Integer>();
        nmaBrg = new ArrayList<String>();
        satuan = new ArrayList<Integer>();
        hrgBeli = new ArrayList<Integer>();
        hrgJual = new ArrayList<Integer>();
    }
    
    public void insertKdBrg(int isi){
        this.kdBrg.add(isi);
    }
    public ArrayList<Integer> getRecordKdBrg(){
        return this.kdBrg;
    }
    
    public void insertNmaBrg(String isi){
        this.nmaBrg.add(isi);
    }
    public ArrayList<String> getRecordNmaBrg(){
        return this.nmaBrg;
    }
    
    public void insertSatuan(int isi){
        this.satuan.add(isi);
    }
    public ArrayList<Integer> getRecordSatuan(){
        return this.satuan;
    }
    
    public void insertHrgBeli(int isi){
        this.hrgBeli.add(isi);
    }
    public ArrayList<Integer> getRecordHrgBeli(){
        return this.hrgBeli;
    }
    
    public void insertHrgJual(int isi){
        this.hrgJual.add(isi);
    }
    public ArrayList<Integer> getRecordHrgJual(){
        return this.hrgJual;
    }
    
    public void insertBarang(int kdBrg, String nmaBrg, int satuan, int hrgBeli, 
            int hrgJual){
        this.kdBrg.add(kdBrg);
        this.nmaBrg.add(nmaBrg);
        this.satuan.add(satuan);
        this.hrgBeli.add(hrgBeli);
        this.hrgJual.add(hrgJual);
        
    }
}
