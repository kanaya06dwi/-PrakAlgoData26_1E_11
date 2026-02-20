package P2;

public class Mahasiswa11 {
    String nama11;
    String nim11;
    String kelas11;
    double ipk11;
    void tampilkanInformasi11 (){
        System.out.println("Nama: " + nama11);
        System.out.println("NIM: " + nim11);
        System.out.println("IPK: " + ipk11);
        System.out.println("Kelas: " + kelas11);
    }
    void ubahKelas11 (String kelasBaru11){
        kelas11 = kelasBaru11;
    }
    void updateIPK11 (double ipkBaru11){
        ipk11 = ipkBaru11;
    }
    String nilaiKinerja11(){
        if (ipk11 >= 3.5){
            return "Kinerja sangat baik";
        } else if (ipk11 >= 3.0){
            return "Kinerja baik";
        } else if (ipk11 >= 2.5){
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public Mahasiswa11(){
    }
    public Mahasiswa11(String nm11, String nim11, double ipk11, String kls11){
        nama11 = nm11;
        this.nim11 = nim11;
        this.ipk11 = ipk11;
        kelas11 = kls11;
    }
}
