package P1;
import java.util.Scanner;
public class array11 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
    String [] namaMK11 = { 
      "Pancasila", 
      "Konsep Teknologi Informasi",
      "Crirical Thinking dan Problem Solving",
      "Matematika Dasar",
      "Bahasa Inggris",
      "Dasar Pemograman",
      "Praktikum Dasar Pemograman",
      "Keselamatan dan Kesehatan Kerja " };
    
    double [] nilaiAngka11 = new double[namaMK11.length];
    String [] nilaiHuruf11 = new String[namaMK11.length];
    double [] bobotNilai11 = new double[namaMK11.length];
    System.out.println("====================================");
    System.out.println("Program Menghitung IP Semester");
    System.out.println("====================================");

    for (int i = 0; i < namaMK11.length; i++) {
        System.out.print("Masukkan nilai Angka untuk MK " + namaMK11[i] + " : ");
        nilaiAngka11[i] = Naya.nextDouble();
        
        if (nilaiAngka11[i] >= 80) {
           nilaiHuruf11[i] = "A";
           bobotNilai11[i] = 4.0;
        } else if (nilaiAngka11[i] >= 73) {
           nilaiHuruf11[i] = "B+";
           bobotNilai11[i] = 3.5;
        } else if (nilaiAngka11[i] >= 65) {
           nilaiHuruf11[i] = "B";
           bobotNilai11[i] = 3.0;
        } else if (nilaiAngka11[i] >= 60) {
           nilaiHuruf11[i] = "C+";
           bobotNilai11[i] = 2.5;
        } else if (nilaiAngka11[i] >= 50) {
           nilaiHuruf11[i] = "C";
           bobotNilai11[i] = 2.0;
        } else if (nilaiAngka11[i] >= 39) {
           nilaiHuruf11[i] = "D";
           bobotNilai11[i] = 1.0;
        } else {
           nilaiHuruf11[i] = "E";
           bobotNilai11[i] = 0.0;
        }
  
    }
     System.out.println("\nHasil Konversi Nilai");
        System.out.printf("%-40s %-12s %-12s %-12s%n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int j = 0; j < namaMK11.length; j++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f%n",
                    namaMK11[j], nilaiAngka11[j], nilaiHuruf11[j], bobotNilai11[j]);
        }
    double totalBobot = 0;

    for (int i = 0; i < namaMK11.length; i++) {
        totalBobot += bobotNilai11[i];
    }
    double IP = totalBobot / namaMK11.length;
    System.out.println("IP  : " + IP);
    }
}
