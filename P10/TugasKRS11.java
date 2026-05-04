package P10;

import java.util.Scanner;

public class TugasKRS11 {
    public static void tampilkanMenu() {
        System.out.println("\n========================================");
        System.out.println("   SISTEM ANTRIAN PERSETUJUAN KRS DPA  ");
        System.out.println("========================================");
        System.out.println("1.  Tambah Mahasiswa ke Antrian");
        System.out.println("2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)");
        System.out.println("3.  Tampilkan Semua Antrian");
        System.out.println("4.  Tampilkan 2 Antrian Terdepan");
        System.out.println("5.  Tampilkan Antrian Paling Akhir");
        System.out.println("6.  Cetak Jumlah Antrian Saat Ini");
        System.out.println("7.  Cetak Jumlah yang Sudah Proses KRS");
        System.out.println("8.  Cetak Jumlah yang Belum Proses KRS");
        System.out.println("9.  Cek Antrian Kosong");
        System.out.println("10. Cek Antrian Penuh");
        System.out.println("11. Kosongkan Antrian");
        System.out.println("0.  Keluar");
        System.out.println("----------------------------------------");
        System.out.print("Pilih menu: ");
    }
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        AntrianKRS11 antrianKRS = new AntrianKRS11(10);
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = Naya.nextInt();
            Naya.nextLine(); // Konsumsi newline
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = Naya.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = Naya.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = Naya.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = Naya.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, prodi, kelas);
                    antrianKRS.tambahAntrian(mhs);
                    break;
                case 2:
                    antrianKRS.panggilAntrian();
                    break;
                case 3:
                    antrianKRS.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrianKRS.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrianKRS.tampilkanAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian Saat Ini: " + antrianKRS.size);
                    break;
                case 7:
                    System.out.println("Jumlah yang Sudah Proses KRS: " + antrianKRS.totalDiproses);
                    break;
                case 8:
                    System.out.println("Jumlah yang Belum Proses KRS: " + (antrianKRS.size));
                    break;
                case 9:
                    System.out.println("Apakah Antrian Kosong? " + antrianKRS.isEmpty());
                    break;
                case 10:
                    System.out.println("Apakah Antrian Penuh? " + antrianKRS.isFull());
                    break;
                case 11:
                    antrianKRS.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
         Naya.close();
    }
    }

