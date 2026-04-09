package CM1;

import java.util.Scanner;

public class ClassMainCM11 {
    public static void main(String[] args) {
        Scanner naya = new Scanner(System.in);
        //  Data Mahasiswa
        Mahasiswa11[] mahasiswa = {
            new Mahasiswa11("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa11("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa11("22003", "Citra", "Sistem Informasi Bisnis")
        };
        // Data Buku
        Buku11[] buku = {
            new Buku11("B001", "Algoritma", 2020),
            new Buku11("B002", "Basis Data", 2019),
            new Buku11("B003", "Pemograman", 2021),
            new Buku11("B004", "Fisika", 2024)
        };
        // Data Peminjaman
        Peminjaman11[] peminjaman = {
            new Peminjaman11(mahasiswa[0], buku[0], 7),
            new Peminjaman11(mahasiswa[1], buku[1], 3),
            new Peminjaman11(mahasiswa[2], buku[2], 10),
            new Peminjaman11(mahasiswa[2], buku[3], 6),
            new Peminjaman11(mahasiswa[0], buku[1], 4)
        };
        // Hitung denda
        for (int i = 0; i < peminjaman.length; i++) {
            peminjaman[i].hitungDenda();
        }
        int pilih = 0;
        do { 
            System.out.println("\n==== SISTEM PEMINJAMAN RUANG BACA JTI ====");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("Pilih: ");
            pilih = naya.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("\n=== DATA MAHASISWA ===");
                    for (Mahasiswa11 m : mahasiswa){
                        m.tampilMahasiswa();
                        System.out.println("-------------------------------------------------------");
                    }
                    break;
                    case 2:
                    System.out.println("\n=== DATA BUKU ===");
                    for (Buku11 b : buku){
                        b.tampilBuku();
                        System.out.println("---------------------------------------------------------------");
                    }
                    break;
                case 3:
                    for (Peminjaman11 p : peminjaman){
                        p.tampilPeminjaman11();
                    }
                    break;
                case 4:
                    // Urutkan berdasarkan denda terbesar
                    for (int i = 1; i < peminjaman.length - 1; i++) {
                            Peminjaman11 temp = peminjaman[i];
                            int j = i - 1;
                            while (j >= 0 && peminjaman[j].denda < temp.denda) {
                                peminjaman[j + 1] = peminjaman[j];
                                j--;
                            }
                            peminjaman[j + 1] = temp;
                        }
                        System.out.println("\n===  SETELAH DIURUTKAN (DENDA TERBESAR) ===");
                        for (Peminjaman11 p : peminjaman) {
                            p.tampilPeminjaman11();
                        }
                        break;
                    case 5:
                        System.out.println("Masukkan NIM:");
                        String cariNIM = naya.next();
                        boolean ditemukan = false;
                        for (Peminjaman11 p : peminjaman) {
                            if (p.mhs.nim.equals(cariNIM)) {
                                p.tampilPeminjaman11();
                                ditemukan = true;
                            }
                        }
                        if (!ditemukan) {
                            System.out.println("Data dengan NIM " + cariNIM + " tidak ditemukan.");
                        }
                        break;
                    }
        } while (pilih != 0);
    }
}


