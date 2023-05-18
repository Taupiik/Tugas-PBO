/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ASUS
 */
public class tblPelanggan {
    private int kdPelanggan, faxPelanggan;
    private String nmaPelanggan, alamatPelanggan, emailPelanggan, telpPelanggan, tgl;
    
    public void setkdPelanggan(int kdPelanggan){
        this.kdPelanggan = kdPelanggan;
    }
    public int getkdPelanggan(){
        return kdPelanggan;
    }
    
    public void settelpPelanggan(String telpPelanggan){
        this.telpPelanggan = telpPelanggan;
    }
    public String gettelpPelanggan(){
        return telpPelanggan;
    }
    
    public void setfaxPelanggan(int faxPelanggan){
        this.faxPelanggan = faxPelanggan;
    }
    public int getfaxPelanggan(){
        return faxPelanggan;
    }
    
    public void setnmaPelanggan(String nmaPelanggan){
        this.nmaPelanggan = nmaPelanggan;
    }
    public String getnmaPelanggan(){
        return nmaPelanggan;
    }
    
    public void setalamatPelanggan(String alamatPelanggan){
        this.alamatPelanggan = alamatPelanggan;
    }
    public String getalamatPelanggan(){
        return alamatPelanggan;
    }
    
    public void setemailPelanggan(String emailPelanggan){
        this.emailPelanggan = emailPelanggan;
    }
    public String getemailPelanggan(){
        return emailPelanggan;
    }
    
    public void setTgl(String tgl){
        this.tgl = tgl;
    }
    public String getTgl(){
        return tgl;
    }
}
