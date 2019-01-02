/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum9;

/**
 *
 * @author Nyunnyun
 */
public class Truk {
    double muatan;
    double muatanmaks;
    
    public Truk(double beratmaks){
        this.muatanmaks= beratmaks;
    }
    
    public double getMuatan(){
        return muatan;
    }
    
    public double getMuatanMaks(){
        
        return muatanmaks;
        
    }
    
    public void tambahMuatan(double berat){
         if((berat+muatan)<=muatanmaks){
             muatan=muatan+berat;
         }
    }
}
