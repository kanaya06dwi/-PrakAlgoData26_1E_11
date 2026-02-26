package P3;

public class MataKuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
 public MataKuliah11(){

 }
    public MataKuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData(String kode11, String nama, int sks, int jumlahJam) {
        this.kode = kode11;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void cetakInfo() {
        System.out.println("Kode       :  " + kode);
        System.out.println("Nama       :  " + nama);
        System.out.println("SKS        :  " + sks);
        System.out.println("Jumlah Jam :  " + jumlahJam);
        System.out.println("---------------------------------------------");
    }
}
