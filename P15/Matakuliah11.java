package P15;

public class Matakuliah11 {
    String kode;
    String nama;
    int sks;
    public Matakuliah11() {
    }
    public Matakuliah11(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    @Override
    public String toString() {
        return "Matakuliah11{" +
                "kode='" + kode + '\'' +
                ", nama='" + nama + '\'' +
                ", sks=" + sks +
                '}';
    }
    public String getKode() {
    return kode;
}

public String getNama() {
    return nama;
}

public int getSks() {
    return sks;
}
}
