package P11;

import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Data Mahasiswa ke-" + i);

            System.out.print("NIM   : ");
            String nim = Naya.nextLine();

            System.out.print("Nama  : ");
            String nama = Naya.nextLine();

            System.out.print("Kelas : ");
            String kelas = Naya.nextLine();

            System.out.print("IPK   : ");
            double ipk = Naya.nextDouble();
            Naya.nextLine();

            Mahasiswa00 mhs = new Mahasiswa00(nim, nama, kelas, ipk);

            sll.addLast(mhs);
            System.out.println("\nIsi Linked List:");
            sll.print();
            System.out.println();
        }


    }
}