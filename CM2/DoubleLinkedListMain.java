package CM2;
import CM2.LinkedListRekap.NodeRekap;
import java.util.Scanner;
public class DoubleLinkedListMain {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        DoubleLinkedListPesanan listPesanan = new DoubleLinkedListPesanan();
        DoubleLinkedListAntrian listAntrian = new DoubleLinkedListAntrian();
        int pilihan;
        do {
            System.out.println("============================================");
            System.out.println(" SISTEM ANTRIAN ROYAL DELISH ");
            System.out.println("============================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Tambah Antrian Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Laporan Rekap Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Naya.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = Naya.next();
                    System.out.print("Masukkan nomor telepon: ");
                    String noTelepon = Naya.next();
                    listAntrian.tambahAntrian(nama, noTelepon);
                    break;
                case 2:
                    listAntrian.cetakAntrian();
                    break;
                case 3:
                    Pembeli p = listAntrian.hapusAntrian();
                    if (p != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = Naya.nextInt(); Naya.nextLine(); 
                        System.out.print("Nama Pesanan : ");
                        String namaMakan = Naya.nextLine();
                        System.out.print("Harga : ");
                        int harga = Naya.nextInt();
                        listPesanan.tambahPesanan(kode, namaMakan, harga);
                        System.out.println(p.namaPembeli + " telah memesan " + namaMakan);
                    }
                    break;
                case 4:
                    listPesanan.cetakPesanan();
                    break;
                case 5:
                    NodeRekap head = null, tail = null;
                    LinkedListRekap rekap = new LinkedListRekap();
                    NodePesanan current = listPesanan.head;
                    while (current != null) {
                        rekap.updateRekap(current.data.namaPesanan);
                        current = current.next;
                    }
                    rekap.sortDescending();
                    System.out.println("Laporan Rekap Pesanan:");
                    System.out.println("Nama Pesanan\tJumlah");
                    NodeRekap currRekap = rekap.head;
                    while (currRekap != null) {
                        System.out.println(currRekap.namaPesanan + "\t\t" + currRekap.jumlah);
                        currRekap = currRekap.next;
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian Royal Delish!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
