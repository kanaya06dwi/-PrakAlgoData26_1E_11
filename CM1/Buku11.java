package CM1;

public class Buku11 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    
    public Buku11(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    void tampilBuku(){
        System.out.println("Kode Buku : " + this.kodeBuku + " | Judul : " + this.judul + " | Tahun Terbit : " + this.tahunTerbit);
        
    }
}
