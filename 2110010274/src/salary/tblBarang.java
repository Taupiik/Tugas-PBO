/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ASUS
 */
public class tblBarang {
    private int kdBrg, satuan, hrgBeli, hrgJual;
    private String nmaBrg;
   
    public void setkdBrg(int kdBrg){
        this.kdBrg = kdBrg;
    }
    public int getkdBrg(){
        return kdBrg;
    }
    
    public void setSatuan(int satuan){
        this.satuan = satuan;
    }
    public int getSatuan(){
        return satuan;
    }
    
    public void sethrgBeli(int hrgBeli){
        this.hrgBeli = hrgBeli;
    }
    public int gethrgBeli(){
        return hrgBeli;
    }
    
    public void sethrgJual(int hrgJual){
        this.hrgJual = hrgJual;
    }
    public int gethrgJual(){
        return hrgJual;
    }
    
    public void setnmaBrg(String nmaBrg){
        this.nmaBrg = nmaBrg;
    }
    public String getnmaBrg(){
        return nmaBrg;
    }
}
