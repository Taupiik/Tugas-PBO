/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010274;
import salary.*;
import dataset.*;
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
        /*
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
        */
        //Memasukkan Array List kedalam Object
        dsBarang barang = new dsBarang();
        dsPelanggan pelanggan = new dsPelanggan();
        dsPembelian pembelian = new dsPembelian();
        dsPenjualan penjualan = new dsPenjualan();
        dsSupplier supplier = new dsSupplier();
        dsUser user = new dsUser();
        
        //Menginput data ArrayList pada masing-masing tabel
        barang.insertKdBrg(001);
        barang.insertNmaBrg("Bodrex");
        barang.insertSatuan(1);
        barang.insertHrgBeli(5000);
        barang.insertHrgJual(10000);
        barang.insertBarang(002, "Paracetamol", 1, 2000, 4000);
        
        pelanggan.insertKdPelanggan(101);
        pelanggan.insertNmaPelanggan("Muhammad Taufik");
        pelanggan.insertFaxPelanggan(3000);
        pelanggan.insertAlamatPelanggan("Jl. Kelayan A");
        pelanggan.insertEmailPelanggan("muhammadtaufik140903@gmail.com");
        pelanggan.insertTelpPelanggan("081234567890");
        pelanggan.insertTgl("31 Mei 2023");
        pelanggan.insertPelanggan(102, "Muhammad Rafli", 5000, "Jl. Veteran", 
                "muhrafliaditya062@gmail.com", "08122229384", "31 Mei 2023");
        
        pembelian.insertNoFaktur(201);
        pembelian.insertTglFaktur("31 Mei 2023");
        pembelian.insertBykKeluar(50);
        pembelian.insertHrgBeli(5000);
        pembelian.insertHrgJual(10000);
        pembelian.insertPembelian(202, "31 Mei 2023", 20, 3000, 6000);
        
        penjualan.insertNoFaktur(301);
        penjualan.insertTglFaktur("31 Mei 2023");
        penjualan.insertBykKeluar(40);
        penjualan.insertHrgBeli(15000);
        penjualan.insertHrgJual(20000);
        penjualan.insertPenjualan(302, "31 Mei 2023", 30, 10000, 10000);
        
        supplier.insertKdSupplier(401);
        supplier.insertNmaSupplier("Fachrudinnor");
        supplier.insertFaxSupplier(3000);
        supplier.insertAlamatSupplier("Jl. Veteran");
        supplier.insertTelpSupplier("081774983864");
        supplier.insertEmailSupplier("fachrudinor224@gmail.com");
        supplier.insertSupplier(402, "Rifaldi", 4000, "Jl. Manggis", 
                "08183839355", "akhmadrifaldi43@gmail.com");
        
        user.insertUserId("admin");
        user.insertPassId("admin");
        user.insertLevelUser(1);
        user.insertUser("user", "user", 2);
        
        
        //Menampilkan data ArrayList
        System.out.println("===============DATA OBAT==============");
        System.out.println(barang.getRecordKdBrg());
        System.out.println(barang.getRecordNmaBrg());
        System.out.println(barang.getRecordSatuan());
        System.out.println(barang.getRecordHrgBeli());
        System.out.println(barang.getRecordHrgJual());
        
        System.out.println("\t");
        System.out.println("===============DATA PELANGGAN==============");
        System.out.println(pelanggan.getRecordKdPelanggan());
        System.out.println(pelanggan.getRecordNmaPelanggan());
        System.out.println(pelanggan.getRecordFaxPelanggan());
        System.out.println(pelanggan.getRecordAlamatPelanggan());
        System.out.println(pelanggan.getRecordEmailPelanggan());
        System.out.println(pelanggan.getRecordTelpPelanggan());
        System.out.println(pelanggan.getRecordTgl());
        
        System.out.println("\t");
        System.out.println("===============DATA PEMBELIAN==============");
        System.out.println(pembelian.getRecordNoFaktur());
        System.out.println(pembelian.getRecordTglFaktur());
        System.out.println(pembelian.getRecordBykKeluar());
        System.out.println(pembelian.getRecordHrgBeli());
        System.out.println(pembelian.getRecordHrgJual());
        
        System.out.println("\t");
        System.out.println("===============DATA PENJUALAN==============");
        System.out.println(penjualan.getRecordNoFaktur());
        System.out.println(penjualan.getRecordTglFaktur());
        System.out.println(penjualan.getRecordBykKeluar());
        System.out.println(penjualan.getRecordHrgBeli());
        System.out.println(penjualan.getRecordHrgJual());
        
        System.out.println("\t");
        System.out.println("===============DATA SUPPLIER==============");
        System.out.println(supplier.getRecordKdSupplier());
        System.out.println(supplier.getRecordNmaSupplier());
        System.out.println(supplier.getRecordFaxSupplier());
        System.out.println(supplier.getRecordAlamatSupplier());
        System.out.println(supplier.getRecordTelpSupplier());
        System.out.println(supplier.getRecordEmailSupplier());
        
        System.out.println("\t");
        System.out.println("===============DATA USER==============");
        System.out.println(user.getRecordUserId());
        System.out.println(user.getRecordPassId());
        System.out.println(user.getRecordLevelUser());
    }
    
}
