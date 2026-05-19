package P12;

import java.util.Scanner;

public class DoubleLinkeadListMain11 {
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

    public static void main(String[] args) {
        Scanner naya = new Scanner(System.in);
        DoubleLinkedList11 list = new DoubleLinkedList11();
        int pilihan;
        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data terbalik");
            System.out.println("--- Tugas Praktikum ---");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus node setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = naya.nextInt();
            naya.nextLine();

switch (pilihan) {
         case 1:
                Mahasiswa11 mhsAwal = inputMahasiswa(naya);
                    list.addFirst(mhsAwal);
                    break;
        case 2:
                    Mahasiswa11 mhsAkhir = inputMahasiswa(naya);
                    list.addLast(mhsAkhir);
                    break;
      case 3:
                 System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = naya.nextLine();
                 System.out.println("Masukkan data baru : ");
                    Mahasiswa11 dataBaru = inputMahasiswa(naya);
                    list.insertAfter(keyNim, dataBaru);
                    break;
      case 4:
                    list.removeFirst();
                    break;
        case 5:
                    list.removeLast();
                    break;
         case 6:
                    list.print();
                    break;
        case 7:
                    list.printReverse();
                    break;
                case 8:
                    System.out.print("Masukkan indeks: ");
                    int idx = naya.nextInt();
                    naya.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa11 mhsIdx = inputMahasiswa(naya);
                    list.add(idx, mhsIdx);
                    break;

                case 9:
                    System.out.print("Masukkan NIM: ");
                    String nimAfter = naya.nextLine();
                    list.removeAfter(nimAfter);
                    break;

           
                case 10:
                    System.out.print("Masukkan indeks: ");
                    int removeIdx = naya.nextInt();
                    naya.nextLine();
                    list.remove(removeIdx);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;

               
                case 13:
                    System.out.print("Masukkan indeks: ");
                    int getIdx = naya.nextInt();
                    naya.nextLine();
                    list.getIndex(getIdx);
                    break;

           
                case 14:
                    list.printSize();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}