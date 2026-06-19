package P15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main11 {

    static List<Mahasiswa11> daftarMahasiswa = new ArrayList<>();
    static List<Matakuliah11> daftarMatakuliah = new ArrayList<>();
    static List<Nilai11> daftarNilai = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        isiDataAwal();
        int pilih;
        do {
            System.out.println("\n======================================");
            System.out.println("SISTEM DATA NILAI MAHASISWA");
            System.out.println("======================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Cari Nilai Mahasiswa");
            System.out.println("4. Urutkan Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 5);
    }

    static void isiDataAwal() {

        daftarMahasiswa.add(new Mahasiswa11("20001", "Thalhah", "081111"));
        daftarMahasiswa.add(new Mahasiswa11("20002", "Zubair", "082222"));
        daftarMahasiswa.add(new Mahasiswa11("20003", "Abdurrahman", "083333"));
        daftarMahasiswa.add(new Mahasiswa11("20004", "Abu Bakar", "084444"));
        daftarMahasiswa.add(new Mahasiswa11("20005", "Umar", "085555"));

        daftarMatakuliah.add(new Matakuliah11("MK001", "Algoritma", 3));
        daftarMatakuliah.add(new Matakuliah11("MK002", "Basis Data", 3));
        daftarMatakuliah.add(new Matakuliah11("MK003", "PBO", 3));
        daftarMatakuliah.add(new Matakuliah11("MK004", "Sistem Operasi", 3));
    }
    static void inputNilai() {
        System.out.println("\nDAFTAR MAHASISWA");
    for (Mahasiswa11 m : daftarMahasiswa) {
            System.out.println(
                    m.getNim() + " - "
                    + m.getNama());
        }
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        Mahasiswa11 mhsDipilih = null;
        for (Mahasiswa11 m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                mhsDipilih = m;
                break;
            }
        }
        if (mhsDipilih == null) {
            System.out.println("Mahasiswa tidak ditemukan!");
            return;
        }
        System.out.println("\nDAFTAR MATA KULIAH");
        for (Matakuliah11 mk : daftarMatakuliah) {
            System.out.println(
                    mk.getKode() + " - "
                    + mk.getNama());
        }
        System.out.print("Masukkan Kode MK : ");
        String kode = sc.nextLine();
        Matakuliah11 mkDipilih = null;
        for (Matakuliah11 mk : daftarMatakuliah) {
            if (mk.getKode().equalsIgnoreCase(kode)) {
                mkDipilih = mk;
                break;
            }
        }
        if (mkDipilih == null) {
            System.out.println("Mata kuliah tidak ditemukan!");
            return;
        }
        System.out.print("Masukkan Nilai : ");
        double nilai = sc.nextDouble();
        sc.nextLine();
        daftarNilai.add(
                new Nilai11(
                        mhsDipilih,
                        mkDipilih,
                        nilai));
        System.out.println("Data nilai berhasil ditambahkan.");
    }
    static void tampilNilai() {
        System.out.println("\nDATA NILAI");
        System.out.printf("%-8s %-15s %-20s %-5s%n",
                "NIM", "Nama", "Mata Kuliah", "Nilai");
        for (Nilai11 n : daftarNilai) {
            System.out.printf("%-8s %-15s %-20s %-5.0f%n",
             n.getMahasiswa().getNim(),
             n.getMahasiswa().getNama(),
             n.getMatakuliah().getNama(),
             n.getNilai());
        }
    }
    static void cariNilaiMahasiswa() {
        System.out.print("\nMasukkan NIM : ");
        String nim = sc.nextLine();
        boolean ditemukan = false;
        for (Nilai11 n : daftarNilai) {
            if (n.getMahasiswa().getNim().equals(nim)) {
                System.out.println("Nama : "
                        + n.getMahasiswa().getNama());

                System.out.println("Matakuliah : "
                        + n.getMatakuliah().getNama());

                System.out.println("Nilai : "
                        + n.getNilai());

                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan");
        }
    }
    static void urutDataNilai() {
        Collections.sort(
                daftarNilai,
                Comparator.comparingDouble(
                        Nilai11::getNilai).reversed());
        System.out.println("Data berhasil diurutkan.");
        tampilNilai();
    }
}