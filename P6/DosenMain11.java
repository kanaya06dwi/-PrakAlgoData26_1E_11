package P6;
import java.util.Scanner;
public class DosenMain11 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        DataDosen11 list = new DataDosen11();
        int pilih;
        do{
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data Dosen (ASC)");
            System.out.println("4. Urutkan Data Dosen (DESC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = Integer.parseInt(Naya.nextLine());
            if(pilih == 1){
                System.out.print("Masukkan Kode Dosen: ");
                String kode = Naya.nextLine();
                System.out.print("Masukkan Nama Dosen: ");
                String nama = Naya.nextLine();
                System.out.print("Masukkan Jenis Kelamin (L/P): ");
                String jk = Naya.nextLine();
                System.out.print("Masukkan Usia: ");
                int usia = Integer.parseInt(Naya.nextLine());
                Dosen11 d = new Dosen11(kode, nama, jk, usia);
                list.tambah(d);
            } else if (pilih == 2) {
                System.out.println("Data Dosen:");
                list.tampil();
            } else if (pilih == 3) {
                list.sortingASC();
                System.out.println("Data dosen sudah diurutkan secara ascending berdasarkan usia.");
                list.tampil();
            } else if (pilih == 4) {
                list.sortingDESC();
                System.out.println("Data dosen sudah diurutkan secara descending berdasarkan usia.");
                list.tampil();
            } else if (pilih == 5) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }while(pilih != 5);
    }
}
