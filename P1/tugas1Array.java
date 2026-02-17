package P1;
import java.util.Scanner;
public class tugas1Array {
    public static int cariKode11(char inputKode, char [] kodePlat11) {
        for (int i = 0; i < kodePlat11.length; i++) {
            if (kodePlat11[i] == inputKode) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);
        char [] kodePlat11 = {
            'A', 'B', 'D', 'E', 'F', 
            'G', 'H', 'L', 'N', 'T'
        };
        String[] kota11 = {
            "Banten", "Jakarta", "Bandung", "Cirebon", "Bogor","Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"
        };
        System.out.println("===================================");
        System.out.println("Program Cek Kota Dari Kode Plat");
        System.out.println("===================================");
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = Naya.next().charAt(0);
        int index = cariKode11(inputKode, kodePlat11);
        if (index != -1) {
            System.out.println("Kota yang sesuai dengan kode plat " + inputKode + " adalah " + kota11[index]);
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }
        }
}
