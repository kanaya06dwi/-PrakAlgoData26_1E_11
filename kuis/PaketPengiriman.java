package kuis;

public class PaketPengiriman { // class untuk menyimpan data paket pengiriman
    public String nomorResi11; // nomor resi identifikasi untuk paket
    public double berat11; // berat paket dalam kg
    public double ongkosDasar11; // ongkos dasar untuk pengiriman paket, bisa dihitung berdasarkan berat atau jarak
    public double totalOngkos11; // total ongkos yang harus dibayar untuk pengiriman paket
     double totalOngkos11() { // method untuk menghitung total ongkos pengiriman paket
        double total = berat11 * ongkosDasar11; // hitung total ongkos

        if (total > 100000) { // loop untuk memberikan diskon
            total = total - (total * 0.1); // diskon 10% jika total ongkos lebih dari 10.000
        }

        return total; // mengembalikan total yang dibayar
    }
 public void printData11(){ // method untuk mencetak data paket pengiriman
        System.out.println("Nomor Resi: " + nomorResi11); // mencetak nomor resi paket
        System.out.println("Berat: " + berat11 + " kg"); // mencetak berat paket dalam kg
        System.out.println("Ongkos Dasar: Rp " + ongkosDasar11); // mencetak ongkos dasar untuk pengiriman paket
        System.out.println("Total Ongkos: Rp " + totalOngkos11); // mencetak total ongkos yang harus dibayar untuk pengiriman paket
        System.out.println("---------------------------------------------"); // cetak garis pemisah agar rapi  dan teratur saat mencetak data paket
 }
 }
