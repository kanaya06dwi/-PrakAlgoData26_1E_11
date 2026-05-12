package CM1;

public class Buku11 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String statusBuku;
    
    public Buku11(String kodeBuku, String judul, int tahunTerbit, String statusBuku) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.statusBuku = statusBuku;
        
    }
    void tampilBuku(){
        System.out.println("Kode Buku : " + this.kodeBuku + " | Judul : " + this.judul + " | Tahun Terbit : " + this.tahunTerbit + " | Status : " + this.statusBuku);
    }
    int hitungStatusBuku(){  // method untuk menghitung denda berdaasrkan status buku
        if(this.statusBuku.equals ("Grade A")){ // jika status buku grade A maka deneda 5000  per hari
            return 5000; 
        }else if(this.statusBuku.equals("Grade B")){ // jika status buku grade B maka denda 2000 per hari
            return 2000;
        }
        return 0; // jika status buku tidak dikenakan denda
    }
    }

