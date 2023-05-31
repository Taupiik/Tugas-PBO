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
public class dsPenjualan {
    private ArrayList<Integer> noFaktur;
    private ArrayList<String> tglFaktur;
    private ArrayList<Integer> bykKeluar;
    private ArrayList<Integer> hrgBeli;
    private ArrayList<Integer> hrgJual;
    
    public dsPenjualan() {
        noFaktur = new ArrayList<Integer>();
        tglFaktur = new ArrayList<String>();
        bykKeluar = new ArrayList<Integer>();
        hrgBeli = new ArrayList<Integer>();
        hrgJual = new ArrayList<Integer>();
    }
    
    public void insertNoFaktur(int isi){
        this.noFaktur.add(isi);
    }
    public ArrayList<Integer> getRecordNoFaktur(){
        return this.noFaktur;
    }
    
    public void insertTglFaktur(String isi){
        this.tglFaktur.add(isi);
    }
    public ArrayList<String> getRecordTglFaktur(){
        return this.tglFaktur;
    }
    
    public void insertBykKeluar(int isi){
        this.bykKeluar.add(isi);
    }
    public ArrayList<Integer> getRecordBykKeluar(){
        return this.bykKeluar;
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
    
    public void insertPenjualan(int noFaktur, String tglFaktur, int bykKeluar, int hrgBeli, 
            int hrgJual){
        this.noFaktur.add(noFaktur);
        this.tglFaktur.add(tglFaktur);
        this.bykKeluar.add(bykKeluar);
        this.hrgBeli.add(hrgBeli);
        this.hrgJual.add(hrgJual);
    }
}
