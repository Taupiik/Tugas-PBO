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
public class dsPelanggan {
    private ArrayList<Integer> kdPelanggan;
    private ArrayList<String> nmaPelanggan;
    private ArrayList<Integer> faxPelanggan;
    private ArrayList<String> alamatPelanggan;
    private ArrayList<String> emailPelanggan;
    private ArrayList<String> telpPelanggan;
    private ArrayList<String> tgl;
    
    public dsPelanggan() {
        kdPelanggan = new ArrayList<Integer>();
        nmaPelanggan = new ArrayList<String>();
        faxPelanggan = new ArrayList<Integer>();
        alamatPelanggan = new ArrayList<String>();
        emailPelanggan = new ArrayList<String>();
        telpPelanggan = new ArrayList<String>();
        tgl = new ArrayList<String>();
    }
    
    public void insertKdPelanggan(int isi){
        this.kdPelanggan.add(isi);
    }
    public ArrayList<Integer> getRecordKdPelanggan(){
        return this.kdPelanggan;
    }
    
    public void insertNmaPelanggan(String isi){
        this.nmaPelanggan.add(isi);
    }
    public ArrayList<String> getRecordNmaPelanggan(){
        return this.nmaPelanggan;
    }
    
    public void insertFaxPelanggan(int isi){
        this.faxPelanggan.add(isi);
    }
    public ArrayList<Integer> getRecordFaxPelanggan(){
        return this.faxPelanggan;
    }
    
    public void insertAlamatPelanggan(String isi){
        this.alamatPelanggan.add(isi);
    }
    public ArrayList<String> getRecordAlamatPelanggan(){
        return this.alamatPelanggan;
    }
    
    public void insertEmailPelanggan(String isi){
        this.emailPelanggan.add(isi);
    }
    public ArrayList<String> getRecordEmailPelanggan(){
        return this.emailPelanggan;
    }
    
    public void insertTelpPelanggan(String isi){
        this.telpPelanggan.add(isi);
    }
    public ArrayList<String> getRecordTelpPelanggan(){
        return this.telpPelanggan;
    }
    
    public void insertTgl(String isi){
        this.tgl.add(isi);
    }
    public ArrayList<String> getRecordTgl(){
        return this.tgl;
    }
    
    public void insertPelanggan(int kdPelanggan, String nmaPelanggan, int faxPelanggan, String alamatPelanggan, 
            String emailPelanggan, String telpPelanggan, String tgl){
        this.kdPelanggan.add(kdPelanggan);
        this.nmaPelanggan.add(nmaPelanggan);
        this.faxPelanggan.add(faxPelanggan);
        this.alamatPelanggan.add(alamatPelanggan);
        this.emailPelanggan.add(emailPelanggan);
        this.telpPelanggan.add(telpPelanggan);
        this.tgl.add(tgl);
    }
}
