package P6;

public class Dosen11 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;
    Dosen11(String kd, String nm, String jk, int us){
        this.kode = kd;
        this.nama = nm;
        this.jenisKelamin = jk;
        this.usia = us;
    }
    void tampil(){
        System.out.println("Kode Dosen : " + this.kode);
        System.out.println("Nama Dosen : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Usia : " + this.usia);
    }
}
