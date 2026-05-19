package P12;

import java.util.Scanner;

public class Mahasiswa11 {
    Scanner naya = new Scanner(System.in);
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampil() {
        System.out.println(
            "NIM   : " + nim +
            "\nNama  : " + nama +
            "\nKelas : " + kelas +
            "\nIPK   : " + ipk
        );
    }
    public static Mahasiswa11 inputMahasiswa(Scanner naya) {
        System.out.print("Masukkan NIM: ");
        String nim = naya.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = naya.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = naya.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = naya.nextDouble();
        naya.nextLine(); 
        return new Mahasiswa11(nim, nama, kelas, ipk);
    }
}
