package ContohModifCM1;

public class Peminjaman11 {
    Mahasiswa11 mhs;
    Buku11 buku;
    int lamaPinjam;
    int denda;
    int telat;
    String status;

    public Peminjaman11(Mahasiswa11 mhs, Buku11 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.denda = 0;
        this.telat = 0;
    }
    void hitungDenda(){
        if(this.lamaPinjam > 5){
            this.telat = this.lamaPinjam - 5;
            this.denda = this.telat * 2000;
        } else {
            this.telat = 0;
            this.denda = 0;
        }
        if(this.telat > 10){
            this.status = "Blokir";
        } else {
            this.status = "Aktif";
        }
    }
    
    void tampilPeminjaman11(){
        System.out.println("Nama : " + this.mhs.nama + 
        " | Judul Buku : " + this.buku.judul + 
        " | Lama Pinjam : " + this.lamaPinjam + " hari " +
         "| Terlambat : " + this.telat + 
         " hari | Denda : Rp " + this.denda +
         " | Status : " + this.status);
    
    }
}
