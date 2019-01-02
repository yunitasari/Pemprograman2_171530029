/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum8;

/**
 *
 * @author Nyunnyun
 */
public class Tabungan {
    int saldo;
    
    Tabungan(int initsaldo){
        this.saldo=initsaldo;
    }
    
    public void ambilUang(int jumlah){
        this.saldo=(saldo-jumlah);
    }
}
