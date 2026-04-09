package CM1;

public class Mahasiswa11 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa11(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa(){
        System.out.println("NIM: " + this.nim + " | Nama: " + this.nama + " | Prodi: " + this.prodi);
    }
}
