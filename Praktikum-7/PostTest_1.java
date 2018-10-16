import java.io.*;

public class PostTest_1{

    public static void main(String[] args) throws IOException{
        BufferedReader dataInput = new BufferedReader(
            new InputStreamReader(String.in)
        );

        int menu;
        String kodebarang[] = new String[50];
        String namabarang[] = new String[50];
        float harga[] = new float[50];
        int jumlah[] = new int[50];
        String pilih = "";
        boolean status1 = false;
        boolean status2 = false;
        int x = 0;

        do{
            System.out.println(".: Menu App :.");
            System.out.println("(1) Input Data Barang ");
            System.out.println("(2) Cetak Data Barang ");

            System.out.println("Pilih menu : ");
            menu = Integer.parseInt(dataInput.readLine());

            if(menu == 1){
                do{
                    System.out.print("Masukkan Kode Barang : ");
                        kodebarang[x] = dataInput.readLine();
                    System.out.print("Masukkan Nama Barang : ");
                        namabarang[x] = dataInput.readLine();
                    System.out.print("Masukkan Harga : ");
                        harga[x] = Float.parseFloat(dataInput.readLine());
                    System.out.print("Masukkan Jumlah : ");
                        jumlah[x] = Integer.parseFloat(dataInput.readLine());
                    
                    System.out.print("Apakah akan melakukan input lagi? Y/N");
                        pilih = dataInput.readLine();
                    if(pilih.equals("Y")){
                        status1 = true;
                        X++;
                    }else{
                        status1 = false;
                        status2 = true;
                    }
                }while(status1);
            }else if(menu == 2){
                for(int i=0 ; i<kodebarang.length ; i++){

                    if(!kodebarang[i].equals("")){
                        System.out.println("Kode Barang : " + kodebarang[i]);
                        System.out.println("Nama Barang : " + namabarang[i]);
                        System.out.println("Harga : " + harga[i]);
                        System.out.println("Jumlah : " + jumlah[i]);
                        System.out.println("\n");
                    }else{
                        break;
                    }
                }
            }
        }
    }
}