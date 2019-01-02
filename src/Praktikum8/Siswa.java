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
public class Siswa {
    int no_absen;
    String nis, nama_siswa, tmp_lahir, tgl_lahir;
    double nilai_ipa, nilai_ips;
    
    public void infoSiswa(){
        System.out.println("--- Data Siswa ---\n");
    }
    
    public void setNis(String i){
        nis=i;
    }
    
    public void setNama(String i){
        nama_siswa=i;
    }
    
    public void setTtl(String i, String j){
        tmp_lahir=i;
        tgl_lahir=j;
    }
    
    public void setNilai(double nipa, double nips){
        nilai_ipa=nipa;
        nilai_ips=nips;
    }
}
