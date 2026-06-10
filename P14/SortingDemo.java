package P14;
import java.util.ArrayList;
import java.util.Collections;
public class SortingDemo {
    public static void main(String[] args) {
    ArrayList<String> daftarSiswa = new ArrayList<>();
    daftarSiswa.add("Dwi");
    daftarSiswa.add("Yunia");
    daftarSiswa.add("Fizi");
    Collections.sort(daftarSiswa);

    System.out.println(daftarSiswa);

    daftarSiswa.sort((s1, s2) -> s1.compareTo(s2));
    System.out.println(daftarSiswa);
}

}
