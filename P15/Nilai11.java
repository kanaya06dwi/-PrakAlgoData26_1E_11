package P15;

public class Nilai11 {
    Mahasiswa11 mahasiswa;
    Matakuliah11 matakuliah;
    double nilai;

    public Nilai11() {
    }
    public Nilai11(Mahasiswa11 mahasiswa, Matakuliah11 matakuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilai = nilai;
    }
    @Override
    public String toString() {
        return "Nilai11{" +
                "mahasiswa=" + mahasiswa +
                ", matakuliah=" + matakuliah +
                ", nilai=" + nilai +
                '}';
    }
    public Mahasiswa11 getMahasiswa() {
    return mahasiswa;
}

public Matakuliah11 getMatakuliah() {
    return matakuliah;
}

public double getNilai() {
    return nilai;
}
}
