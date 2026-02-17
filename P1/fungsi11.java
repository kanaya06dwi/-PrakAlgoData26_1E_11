package P1;
import java.util.Scanner;
public class fungsi11 {
        static int hargaAglonema = 75000;
        static int hargaKeladi = 50000;
        static int hargaAlocasia = 60000;
        static int hargaMawar = 10000;
        public static void main(String[] args) {
            Scanner Naya = new Scanner(System.in);
            int [][] stok11 = new int [4][4];
            System.out.println("===================================");
            System.out.println(" PROGRAM ROYALGARDEN");
            System.out.println("===================================");

            System.out.println("\nMasukkan stok bunga tiap cabang: ");
            for (int i = 0; i < stok11.length; i++) {
                System.out.println("\nRoyalGarden " + (i + 1));
                System.out.print("Stok Aglonema: ");
                stok11[i][0] = Naya.nextInt();
                System.out.print("Stok Keladi: ");
                stok11[i][1] = Naya.nextInt();
                System.out.print("Stok Alocasia: ");
                stok11[i][2] = Naya.nextInt();
                System.out.print("Stok Mawar: ");
                stok11[i][3] = Naya.nextInt();
            }
            System.out.println("\n====================================");
            System.out.println("TABEL PENDAPATAN SETIAP CABANG");
            System.out.println("====================================");
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "Cabang", "Pendapatan", "Status",
                "Aglonema", "Keladi", "Mawar");
                 System.out.println("--------------------------------------------------------------------------");

        // Variabel total semua cabang
        int totalSemuaPendapatan = 0;
        // Hitung + status tiap cabang
        for (int i = 0; i < stok11.length; i++) {

            int pendapatan = hitungPendapatan(stok11[i]);
            totalSemuaPendapatan += pendapatan;

            String status = cekStatus(pendapatan);

            System.out.printf("%-15s Rp%-13d %-15s %-15d %-15d %-15d%n",
                    "RG " + (i + 1),
                    pendapatan,
                    status,
                    stok11[i][0],
                    stok11[i][1],
                    stok11[i][3]);
        }
        // Total semua cabang
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("TOTAL PENDAPATAN SEMUA CABANG = Rp " + totalSemuaPendapatan);

        System.out.println("==========================================");

        Naya.close();
    }
    // Fungsi hitung pendapatan
    public static int hitungPendapatan(int[] stokCabang) {

        int aglonema = stokCabang[0];
        int keladi   = stokCabang[1];
        int alocasia = stokCabang[2];
        int mawar    = stokCabang[3];

        return (aglonema * hargaAglonema) +
               (keladi   * hargaKeladi) +
               (alocasia * hargaAlocasia) +
               (mawar    * hargaMawar);
    }
    // Fungsi cek status
    public static String cekStatus(int pendapatan) {

        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
}

