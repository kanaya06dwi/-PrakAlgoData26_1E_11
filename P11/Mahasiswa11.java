package P11;

public class Mahasiswa11 {
     String nim, nama, keperluan;

    Mahasiswa11(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    void tampilData() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Keperluan  : " + keperluan);
    }
}
