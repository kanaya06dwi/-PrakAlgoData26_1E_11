package P3;
import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
       Scanner naya = new Scanner (System.in);
       mahasiswa[] arrayOfMahasiswa = new mahasiswa[3];
       String dummy;
       for (int i = 0; i < 3; i++) {
         arrayOfMahasiswa[i] = new mahasiswa();

         System.out.println("Masukkan Data Mahasiswa ke-"  + (i + 1));
         System.out.print("NIM    : ");
         arrayOfMahasiswa[i].nim = naya.nextLine();
         System.out.print("Nama   : ");
         arrayOfMahasiswa[i].nama = naya.nextLine();
         System.out.print("Kelas  : ");
         arrayOfMahasiswa[i].kelas = naya.nextLine();
         System.out.print("IPK    : ");
         dummy = naya.nextLine();
         arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
         System.out.println("-------------------------------");
       }
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i].cetakInfo();
        } 
       }
    }
    

