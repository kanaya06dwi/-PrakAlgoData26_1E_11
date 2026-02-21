package P2;

public class MataKuliah11 {
    String kodeMK11;
    String nama11;
    int sks11;
    int jumlahJam11;
    void tampilanInformasi11(){
        
        System.out.println("Nama: " + nama11);
        System.out.println("Sks: " + sks11);
        System.out.println("Jumlah Jam: " + jumlahJam11);
    }
    void ubahSks11 (int sksBaru11){
        sks11 = sksBaru11;
    }
    void tambahJam11 (int jamBaru11){
        jumlahJam11 += jamBaru11;
    }
    void kurangiJam11 (int jamKurang11){
        if (jumlahJam11 - jamKurang11 >= 0){
            jumlahJam11 -= jamKurang11;
        } else {
            System.out.println("Jumlah jam tidak dapat dilakukan pengurangan.");
        }
    }
}
