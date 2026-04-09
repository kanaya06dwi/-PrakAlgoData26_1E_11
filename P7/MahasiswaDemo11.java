package P7;

import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(Naya.nextLine());
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11(jumlah);
        
        for (int i = 0; i < jumlah; i++) {
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
            list.tambah(new Mahasiswa11(nim, nama, kelas, ipk));
        }
        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("--------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan IPK yang dicari: ");
        System.out.println("IPK: ");
        double cari = Double.parseDouble(Naya.nextLine());

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // melakukan pencarian data binary
        System.out.println("--------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        cari = Double.parseDouble(Naya.nextLine());
        System.out.println("----------------------------------------");
        System.out.println("menggunakan binary searching");
        System.out.println("------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
