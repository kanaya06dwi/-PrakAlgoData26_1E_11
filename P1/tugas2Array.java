package P1;
import java.util.Scanner;
public class tugas2Array {
    public static void inputJadwal11(String[][] jadwal11, Scanner Naya) {
     for (int i = 0; i < jadwal11.length; i++) {
        System.out.println("\nJadwal ke-" + (i + 1));
        System.out.print("Nama Mata Kuliah: ");
        jadwal11[i][0] = Naya.nextLine();
        System.out.print("Ruang:");
        jadwal11[i][1] = Naya.nextLine();
        System.out.print("Hari Kuliah: ");
        jadwal11[i][2] = Naya.nextLine();
        System.out.print("Jam Kuliah: ");
        jadwal11[i][3] = Naya.nextLine();
     }
    }
    public static void tampilJadwal11(String[][] jadwal11) {
        System.out.println("============================");
        System.out.println("       JADWAL KULIAH     ");
        System.out.println("============================");
        System.out.printf("%-25s %-15s %-15s %-10s%n",
                "Mata Kuliah", "Ruang", "Hari Kuliah", "Jam Kuliah");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < jadwal11.length; i++) {
            System.out.printf("%-25s %-15s %-15s %-10s%n",
                    jadwal11[i][0], jadwal11[i][1], jadwal11[i][2], jadwal11[i][3]);
        }
    }
    public static void cariHari11(String[][] jadwal11, String hariCari11) {
        System.out.println("\nJadwal Hari " + hariCari11 + ":");
        boolean ketemu = false;
        for (int i = 0; i < jadwal11.length; i++) {
            if (jadwal11[i][2].equalsIgnoreCase(hariCari11)) {
                System.out.printf("%-25s %-15s %-10s %-10s%n",
                        jadwal11[i][0], jadwal11[i][1], jadwal11[i][2], jadwal11[i][3]);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariCari11);
        }
    }
    public static void cariMK11(String[][] jadwal11, String mkCari11) {
        boolean ketemu = false;
        for (int i = 0; i < jadwal11.length; i++) {
            if (jadwal11[i][0].equalsIgnoreCase(mkCari11)) {
                System.out.println("\nMata kuliah ditemukan!");
                System.out.println("Mata Kuliah : " + jadwal11[i][0]);
                System.out.println("Ruang       : " + jadwal11[i][1]);
                System.out.println("Hari        : " + jadwal11[i][2]);
                System.out.println("Jam         : " + jadwal11[i][3]);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int jumlahJadwal = Naya.nextInt();
        Naya.nextLine();
        String[][] jadwal11 = new String[jumlahJadwal][4];
        inputJadwal11(jadwal11, Naya);
        tampilJadwal11(jadwal11);
        System.out.print("\nMasukkan hari: ");
        String hariCari11 = Naya.nextLine();
        cariHari11(jadwal11, hariCari11);
        System.out.print("\nMasukkan nama mata kuliah: ");
        String mkCari11 = Naya.nextLine();
        cariMK11(jadwal11, mkCari11);
    }
}
