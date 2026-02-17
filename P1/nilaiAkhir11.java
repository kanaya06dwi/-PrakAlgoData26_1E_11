package P1;
import java.util.Scanner;

public class nilaiAkhir11 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        int nilaiTugas11, nilaiKuis11, nilaiUTS11, nilaiUAS11;
        double nilaiAkhir11;
        String nilaiHuruf11, status11;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================================");
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas11 = Naya.nextInt();
        System.out.print("Masukkan nilai Kuis:  ");
        nilaiKuis11 = Naya.nextInt();
        System.out.print("Masukkan nilai UTS:   ");
        nilaiUTS11 = Naya.nextInt();
        System.out.print("Masukkan nilai UAS:   ");
        nilaiUAS11 = Naya.nextInt();
        System.out.println("=================================");

        // Validasi input nilai
        if (nilaiTugas11 < 0 || nilaiTugas11 > 100 || 
            nilaiKuis11 < 0 || nilaiKuis11 > 100 || 
            nilaiUTS11 < 0 || nilaiUTS11 > 100 || 
            nilaiUAS11 < 0 || nilaiUAS11 > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        // Menghitung nilai akhir
        nilaiAkhir11 = (0.2 * nilaiTugas11) + (0.2 * nilaiKuis11) + (0.3 * nilaiUTS11) + (0.3 * nilaiUAS11);

        // Penentuan Nilai Huruf Akhir
        if (nilaiAkhir11 > 80) {
            nilaiHuruf11 = "A";
        } else if (nilaiAkhir11 > 73) {
            nilaiHuruf11 = "B+";
        } else if (nilaiAkhir11 > 65) {
            nilaiHuruf11 = "B";
        } else if (nilaiAkhir11 > 60) {
            nilaiHuruf11 = "C+";
        } else if (nilaiAkhir11 > 50) {
            nilaiHuruf11 = "C";
        } else if (nilaiAkhir11 > 39) {
            nilaiHuruf11 = "D";
        } else {
            nilaiHuruf11 = "E";
        }

        // Menentukan kelulusan
        if (nilaiHuruf11.equals("A") || nilaiHuruf11.equals("B+") ||
            nilaiHuruf11.equals("B") || nilaiHuruf11.equals("C+") ||
            nilaiHuruf11.equals("C")) {
             status11 = "LULUS";
        } else {
            status11 = "TIDAK LULUS";
        }

        // Output hasil akhir yang rapi
        System.out.println("Nilai Akhir : " + nilaiAkhir11);
        System.out.println("Nilai Huruf : " + nilaiHuruf11);
        System.out.println("=================================");
        System.out.println("SELAMAT ANDA " + status11);
        Naya.close();
    }
}