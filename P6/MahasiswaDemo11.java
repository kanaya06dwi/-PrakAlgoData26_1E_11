package P6;
import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan NIM: ");
            String nim = Naya.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = Naya.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = Naya.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = Double.parseDouble(Naya.nextLine());
            System.out.println("-------------------");
            Mahasiswa11 m = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
