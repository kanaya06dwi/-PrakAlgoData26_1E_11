package P15;

public class Mahasiswa11 {
    String nim;
    String nama;
    String telf;

    public Mahasiswa11() {
    }
    public Mahasiswa11(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }
    @Override
    public String toString() {
        return "Mahasiswa11{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", telf='" + telf + '\'' +
                '}';
    }
    public String getNim() {
    return nim;
}

public String getNama() {
    return nama;
}

public String getTelf() {
    return telf;
}
}
