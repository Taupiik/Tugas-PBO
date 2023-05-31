/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ASUS
 */
public class tblSupplier {
    private int kdSupplier, telpSupplier, faxSupplier;
    private String nmaSupplier, alamatSupplier, emailSupplier;
    
    public void setkdSupplier(int kdSupplier){
        this.kdSupplier = kdSupplier;
    }
    public int getkdSupplier(){
        return kdSupplier;
    }
    
    public void settelpSupplier(int telpSupplier){
        this.telpSupplier = telpSupplier;
    }
    public int gettelpSupplier(){
        return telpSupplier;
    }
    
    public void setfaxSupplier(int faxSupplier){
        this.faxSupplier = faxSupplier;
    }
    public int getfaxSupplier(){
        return faxSupplier;
    }
    
    public void setnmaSupplier(String nmaSupplier){
        this.nmaSupplier = nmaSupplier;
    }
    public String getnmaSupplier(){
        return nmaSupplier;
    }
    
    public void setalamatSupplier(String alamatSupplier){
        this.alamatSupplier = alamatSupplier;
    }
    public String getalamatSupplier(){
        return alamatSupplier;
    }
    
    public void setemailSupplier(String emailSupplier){
        this.emailSupplier = emailSupplier;
    }
    public String getemailSupplier(){
        return emailSupplier;
    }
}
