package P2;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 mhs1 = new Mahasiswa11();
        mhs1.nama11 = "Kanaya Dwi Yunia Rahmawati";
        mhs1.nim11 = "254107020028";
        mhs1.kelas11 = "TI 1E";
        mhs1.ipk11 = 3.40;

        mhs1.tampilkanInformasi11();
        mhs1.ubahKelas11("TI 1F");
        mhs1.updateIPK11(3.60);
        mhs1.tampilkanInformasi11();
         Mahasiswa11 mhs2 = new Mahasiswa11("Heni Tri", "254107020029", 3.50, "TI 2P");
    mhs2.updateIPK11(3.70);
    mhs2.tampilkanInformasi11();
    }
}
