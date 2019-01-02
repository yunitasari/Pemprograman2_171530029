package Praktikum10.tugas;

public class NilaiMatakuliah {
    public Double bobot_uts;
    public Double bobot_uas;
    public Double bobot_lain2;
    public Double nilai_uts;
    public Double nilai_uas;
    public Double nilai_lain2;
    public Double nilai_akhir;
    public String Grade;
    
    public double hitungNilai(){
        this.bobot_uts = 0.3;
        this.bobot_uas = 0.3;
        this.bobot_lain2 = 0.4;
        
        this.nilai_uts = 70.0;
        this.nilai_uas = 85.0;
        this.nilai_lain2 = 80.0;
        
        return 0;
    }
    
    public void hitungGrade(){
        
    }
}
