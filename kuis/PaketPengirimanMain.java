package kuis;
import java.util.Scanner; // Import Scanner untuk membaca input dari pengguna
public class PaketPengirimanMain {
    public static void main(String[] args) {
    Scanner naya = new Scanner (System.in); // membuat class new scanner
    PaketPengiriman[] arrayOfPaket = new PaketPengiriman[3] ; // membuat instansiasi terlebih dahulu
    String dummy; // untuk scan input
    for (int i = 0; i < 3; i++) { // loop untuk mengisi data paket pengiriman
        arrayOfPaket[i] = new PaketPengiriman(); // buat objek baru untuk setiap paket pengiriman
        System.out.println("Data Paket ke-" + (i+1)); // cetak nomor paket untuk memudahkan pengguna dalam memasukkan data paket
        System.out.print("Masukkan Nomor Resi: "); // mpenggunan menginput nomor resi untuk paket pengiriman
        arrayOfPaket[i].nomorResi11 = naya.nextLine(); // menyimpan nomor resi yang diinput oleh pengguna ke dalam atribut nomorResi11 pada objek paket pengiriman
        System.out.print("Masukkan Berat (kg): "); // meminta pengguna untuk menginput berat paket dalam kg
        arrayOfPaket[i].berat11 = Double.parseDouble(naya.nextLine()); // menyimpan berat paket yang diinput oleh pengguna ke dalam atribut berat11 pada objek paket pengiriman, dengan mengkonversi input string menjadi double
        System.out.print("Masukkan Ongkos Dasar: "); // pengguna menginput ongkos dasar untuk mengirim paket
        arrayOfPaket[i].ongkosDasar11 = Double.parseDouble(naya.nextLine()); // menyimpan ongkos dasar yang diinput oleh pengguna
        System.out.println("---------------------------------------------"); // kasih tanda garis (-) agar rapi dan enak dibaca
    }
    double totalOngkos11 = 0; // membuat tipe data totaalOngkos11, lalu kenapa 0? karena semua index harus berawalan dari 0.
for (int i = 0; i < arrayOfPaket.length; i++) { // loop untuk mengisi urutan total ongkos setiap per data paket nya
    totalOngkos11 += arrayOfPaket[i].totalOngkos11(); // melakukan penambahan totalOngkos setiap per data paket nya
    System.out.println("Total ongkos ke-" + (i+1) + ": " + arrayOfPaket[i].totalOngkos11()); // menampilkan dan mencetak output total ongkos pada setiap per data nya
}
    double totalSemua = 0; // membuat tipe data totalSemua, index harus dimulai dari 0.
for (int i = 0; i < arrayOfPaket.length; i++) { // loop untuk menampilkan urutan agar rata-rata bisa dibuat
    totalSemua += arrayOfPaket[i].totalOngkos11(); // melakukan cara menambahkan totalsmua agar dijadiin rata rata
}
double rataRata = totalSemua / arrayOfPaket.length; // membuat tipe data untuk rata rata 
System.out.print("Rata-rata ongkos pengiriman: " + rataRata); // menampilakan output rata rata ongkos pengiriman dari semua paket per data nya
    }
}

