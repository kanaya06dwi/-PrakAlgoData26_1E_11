package P3;
import java.util.Scanner;
public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner naya = new Scanner(System.in);
        System.out.println("Masukkan jumlah MataKuliah: ");
        int jumlahMataKuliah = naya.nextInt();
        MataKuliah11[] arrayOfMataKuliah = new MataKuliah11[jumlahMataKuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i<jumlahMataKuliah; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
            System.out.print("Kode       :  ");
            kode = naya.nextLine();
            System.out.print("Nama       :  ");
            nama = naya.nextLine();
            System.out.print("SKS        :  ");
            dummy = naya.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam :  ");
            dummy = naya.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah11(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
            }
            for (int i = 0; i < jumlahMataKuliah; i++) {
                System.out.println("Data MataKuliah ke-" + (i + 1));
                arrayOfMataKuliah[i].cetakInfo();
            }
    }
}

