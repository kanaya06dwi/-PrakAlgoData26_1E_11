package P3;
import java.util.Scanner;
public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner naya = new Scanner (System.in);
    Dosen11[] arrayOfDosen = new Dosen11[3];

    for (int i = 0; i < 3; i++) {
        System.out.println("Data Dosen ke-" + (i+1));
        System.out.print("Kode: ");
        String kode = naya.nextLine();
        System.out.print("Nama: ");
        String nama = naya.nextLine();
        System.out.print("Jenis Kelamin (1=pria, 2=wanita): ");
        int pilihan = Integer.parseInt(naya.nextLine());
        Boolean jenisKelamin = (pilihan == 1 );
        System.out.print("Usia: ");
        int usia = Integer.parseInt(naya.nextLine());
        
       
        arrayOfDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
        System.out.println("---------------------------------------------");
    }
     
    int index = 1;
    for (Dosen11 dosen11 : arrayOfDosen) {
        System.out.println("Data Dosen ke-" + index++);
        System.out.println("Kode: " + dosen11.kode);
        System.out.println("Nama: " + dosen11.nama);
        System.out.println("Jenis Kelamin: " + (dosen11.jenisKelamin ? "pria" : "wanita"));
        System.out.println("Usia: " + dosen11.usia);
        System.out.println("---------------------------------------------");
    }
        DataDosen11.dataSemuaDosen(arrayOfDosen);
        DataDosen11.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen11.rataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen11.infoDosenPalingTua(arrayOfDosen);
        DataDosen11.infoDosenPalingMuda(arrayOfDosen);
        System.out.println("----------------------------------------------");
    }
 
}
