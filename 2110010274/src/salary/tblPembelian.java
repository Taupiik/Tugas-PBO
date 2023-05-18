/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ASUS
 */
public class tblPembelian {
    private int noFaktur, hrgBeli, hrgJual, bykKeluar;
    private String tglFaktur;
    
    public void setnoFaktur(int noFaktur){
        this.noFaktur = noFaktur;
    }
    public int getnoFaktur(){
        return noFaktur;
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
    
    public void setbykKeluar(int bykKeluar){
        this.bykKeluar = bykKeluar;
    }
    public int getbykKeluar(){
        return bykKeluar;
    }
    
    public void settglFaktur(String tglFaktur){
        this.tglFaktur = tglFaktur;
    }
    public String gettglFaktur(){
        return tglFaktur;
    }
}
