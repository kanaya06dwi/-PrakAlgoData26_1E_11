package P7;

public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa11(String nim, String nama, String kls, double ip){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("IPK : " + this.ipk);
    }
}
