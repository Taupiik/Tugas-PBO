/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010274;
import salary.*;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tblBarang barang = new tblBarang();
        tblPelanggan pelanggan = new tblPelanggan();
        tblPembelian pembelian = new tblPembelian();
        tblPenjualan penjualan = new tblPenjualan();
        tblSupplier supplier = new tblSupplier();
        tblUser user = new tblUser();
       
        //Set
        barang.setkdBrg(1001);
        barang.setnmaBrg("Bodrex");
        barang.setSatuan(5);
        barang.sethrgBeli(50000);
        barang.sethrgJual(30000);
        
        pelanggan.setkdPelanggan(0001);
        pelanggan.setnmaPelanggan("Muhammad Rafli Aditya");
        pelanggan.settelpPelanggan("08123456789");
        pelanggan.setfaxPelanggan(5000);
        pelanggan.setemailPelanggan("muhrafliaditya062@gmail.com");
        pelanggan.setalamatPelanggan("Jln. Sungai Lulut");
        pelanggan.setTgl("18 Mei 2023");
        
                
        //Get
        System.out.println("Kode Obat: " + barang.getkdBrg());
        System.out.println("Nama Obat : " + barang.getnmaBrg());
        System.out.println("Satuan : " + barang.getSatuan());
        System.out.println("Harga Beli : " + barang.gethrgBeli());
        System.out.println("Harga Jual : " + barang.gethrgJual());
        
        System.out.println("------------------------------------------");
        System.out.println("Kode Pelanggan :" + pelanggan.getkdPelanggan());
        System.out.println("Nama : " + pelanggan.getnmaPelanggan());
        System.out.println("Telepon : " + pelanggan.gettelpPelanggan());
        System.out.println("Fax : " + pelanggan.gettelpPelanggan());
        System.out.println("Email : " + pelanggan.getemailPelanggan());
        System.out.println("Alamat : " + pelanggan.getalamatPelanggan());
        System.out.println("Tgl : " + pelanggan.getTgl());
        
    }
    
}
