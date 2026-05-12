package P2;

public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11();
        dosen1.idDosen11 = "D001";
        dosen1.nama11 = "Dr. Andi";
        dosen1.statusAktif11 = true;
        dosen1.tahunBergabung11 = 2010;
        dosen1.bidangKeahlian11 = "Pemrograman";

        dosen1.tampilkanInformasi11();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja11(2024) + " tahun");
        dosen1.ubahKeahlian11("Kecerdasan Buatan");
        dosen1.tampilkanInformasi11();

        Dosen11 dosen2 = new Dosen11();
        dosen2.idDosen11 = "D002";
        dosen2.nama11 = "Dr. Budi";
        dosen2.statusAktif11 = false;
        dosen2.tahunBergabung11 = 2005;
        dosen2.bidangKeahlian11 = "Basis Data";

        dosen2.tampilkanInformasi11();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja11(2024) + " tahun");
    }
}
