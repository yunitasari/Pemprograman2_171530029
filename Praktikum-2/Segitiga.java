import java.util.Scanner;
public class Segitiga{
    public static void main (String[] args){
        int alas,tinggi;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Program Luas Segitiga");
        System.out.println("\n\nMAsukkan alas\t: ");
        alas = keyboard.nextInt();
        System.out.println("Masukkan tinggi\t: ");
        tinggi = keyboard.nextInt();
        float total = alas*tinggi/2f;
        System.out.println("\n\nLuas segitiga adalah " + total);
    }
}