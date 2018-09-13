public class Penjualan2{
    public static void main (String[] args){
        int kue = 50000;
        System.out.println("Harga kue : " + kue);
        int kopi = 20000;
        System.out.println("Harga kopi : " + kopi);

        long Total = kue+kopi;
        System.out.println("Total : " + Total);

        float Bayar = 100000;
        double Kembalian = Total-Bayar;
        int Kembali = (int)Kembalian;
        System.out.println("Kembali adalah : " + Kembalian);
    }
}