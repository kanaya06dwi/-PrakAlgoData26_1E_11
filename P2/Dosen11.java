package P2;

public class Dosen11 {
    String idDosen11;
    String nama11;
    boolean statusAktif11;
    int tahunBergabung11;
    String bidangKeahlian11;
    void tampilkanInformasi11() {
        System.out.println("ID Dosen: " + idDosen11);
        System.out.println("Nama: " + nama11);

        if (statusAktif11) {
            System.out.println("Status: Aktif");
        } else {
            System.out.println("Status: Tidak Aktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung11);
        System.out.println("Bidang Keahlian: " + bidangKeahlian11);
    }

    void setStatusAktif11(boolean statusAktifBaru11) {
        statusAktif11 = statusAktifBaru11;
    }

    int hitungMasaKerja11(int tahunSekarang11) {
        return tahunSekarang11 - tahunBergabung11;
    }

    void ubahKeahlian11(String keahlianBaru11) {
        bidangKeahlian11 = keahlianBaru11;
    }
}