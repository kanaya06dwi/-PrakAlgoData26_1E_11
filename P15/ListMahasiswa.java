package P15;
import java.util.ArrayList;
import java.util.List;
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    public void addMahasiswa(Mahasiswa mahasiswa) {
        mahasiswas.add(mahasiswa);
    }
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }
    int LinearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (mahasiswas.get(i).nim.equals(nim)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("20001", "Thalhah", "081111");
        Mahasiswa m1 = new Mahasiswa("20002", "Zubair", "082222");
        Mahasiswa m2 = new Mahasiswa("20003", "Abdurrahman", "083333");
        lm.addMahasiswa(m);
        lm.addMahasiswa(m1);
        lm.addMahasiswa(m2);
        lm.tampil();
        lm.update(lm.LinearSearch("20002"), new  Mahasiswa("20002", "Zubair bin Awam", "082222"));
        lm.tampil();
    }
}
