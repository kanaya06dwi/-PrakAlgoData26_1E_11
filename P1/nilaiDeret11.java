package P1;
import java.util.Scanner;

public class nilaiDeret11 {
    public static void main(String[] args) {
        Scanner Naya = new Scanner(System.in);

        //Input NIM
        System.out.print("Masukkan NIM: ");
        String nim11 = Naya.nextLine();

        // Mengambil 2 digit terakhir dari NIM 
        int n = Integer.parseInt(nim11.substring(nim11.length() - 2));
        // Jika n kurang dari 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }
        System.out.println(" Maka n adalah : " + n);

        //  Perulangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }

            
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}