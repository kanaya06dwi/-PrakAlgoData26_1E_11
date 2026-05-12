package P11;

import java.util.Scanner;

public class LinkedListMain11 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        LinkedList11 q = new LinkedList11();
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Antrian Terdepan");
            System.out.println("5. Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = Naya.nextInt();
            Naya.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM        : ");
                    String nim = Naya.nextLine();

                    System.out.print("Nama       : ");
                    String nama = Naya  .nextLine();

                    System.out.print("Keperluan  : ");
                    String keperluan = Naya.nextLine();

                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, keperluan);
                    q.enqueue(mhs);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    q.peekFront();
                    break;

                case 5:
                    q.peekRear();
                    break;

                case 6:
                    q.jumlahAntrian();
                    break;

                case 7:
                    q.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);

    }
}
