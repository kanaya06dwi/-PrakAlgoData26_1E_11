package P9;
import java.util.Scanner;
public class SuratDemo11 {
    public static void main(String[] args) {
        StackSurat11 stack = new StackSurat11(5);
        Scanner Naya = new Scanner(System.in);
        int pilih;
do{
    System.out.println("\nMenu:");
    System.out.println("1. Terima Surat Izin");
    System.out.println("2. Proses Surat Izin");
    System.out.println("3. Lihat Surat Izin Terakhir");
    System.out.println("4. Cari Surat Izin");
    System.out.println("5. Keluar");
    System.out.print("Pilih menu: ");
    pilih = Naya.nextInt();
    Naya.nextLine(); 
    switch (pilih){
        case 1:
            System.out.print("ID Surat: ");
            String idSurat = Naya.nextLine();
            System.out.print("Nama Mahasiswa: ");
            String namaMahasiswa = Naya.nextLine();
            System.out.print("Kelas: ");
            String kelas = Naya.nextLine();
            System.out.print("Jenis Izin (S/I): ");
            char jenisIzin = Naya.nextLine().toUpperCase().charAt(0);
            System.out.print("Durasi (hari): ");
            int durasi = Naya.nextInt();
            Naya.nextLine(); 
            Surat11 surat = new Surat11(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
            stack.push(surat);
            System.out.println("Surat izin berhasil diterima!");
            break;
        case 2:
            Surat11 proses = stack.pop();
            if (proses != null) {
                System.out.println("Memproses surat izin dari " + proses.namaMahasiswa);
                System.out.println("ID Surat   : " + proses.idSurat);
                System.out.println("Nama       : " + proses.namaMahasiswa);
                System.out.println("Kelas      : " + proses.kelas);
                System.out.println("Jenis Izin : " + (proses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi     : " + proses.durasi + " hari");
            }
            break;
        case 3:
            Surat11 lihat = stack.peek();
            if (lihat != null) {
                System.out.println("Surat izin terakhir dari " + lihat.namaMahasiswa);
                System.out.println("ID Surat   : " + lihat.idSurat);
                System.out.println("Nama       : " + lihat.namaMahasiswa);
                System.out.println("Kelas      : " + lihat.kelas);
                System.out.println("Jenis Izin : " + (lihat.jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi     : " + lihat.durasi + " hari");
            }
            break;
        case 4:
            System.out.print("Masukkan nama mahasiswa untuk mencari surat izin: ");
            String cariNama = Naya.nextLine();
            stack.cariSUrat(cariNama);
            break;
        case 5:
            System.out.println("Keluar dari program. Terima kasih!");
            break;
            default:
            System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
    }
    }while (pilih >= 1 && pilih <=4);
}
}
