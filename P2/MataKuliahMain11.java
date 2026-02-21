package P2;

public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMK11 = "MK01";
        mk1.nama11 = "Bahasa Inggris";
        mk1.sks11 = 2;
        mk1.jumlahJam11 = 5;

        mk1.tampilanInformasi11();
        mk1.ubahSks11(3);
        mk1.tambahJam11(2);
        mk1.kurangiJam11(1);
        mk1.tampilanInformasi11();

            MataKuliah11 mk2 = new MataKuliah11();
        mk2.kodeMK11 = "MK02";
        mk2.nama11 = "Matematika";
        mk2.sks11 = 3;
        mk2.jumlahJam11 = 6;
        mk2.tampilanInformasi11();
        mk2.tambahJam11(2);
        mk2.tampilanInformasi11();
    }
}
