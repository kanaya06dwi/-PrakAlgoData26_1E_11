package CM1;

public class Peminjaman11 {
    Mahasiswa11 mhs;
    Buku11 buku;
    int lamaPinjam;
    int denda;
    int telat;


    public Peminjaman11(Mahasiswa11 mhs, Buku11 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.denda = 0;
        this.telat = 0;
    }
    void hitungDenda(){
        if(this.lamaPinjam > 5){
            int telat = this.lamaPinjam - 5;
            this.denda = telat * 2000;
            this.telat = telat;
        } else {
            this.telat = 0;
            this.denda = 0;
        }
    }
    
    void tampilPeminjaman11(){
        System.out.println("Nama : " + this.mhs.nama + " | Judul Buku : " + this.buku.judul + " | Lama Pinjam : " + this.lamaPinjam + " hari | Terlambat : " + this.telat + " hari | Denda : Rp " + this.denda);
    
    }
    
}
