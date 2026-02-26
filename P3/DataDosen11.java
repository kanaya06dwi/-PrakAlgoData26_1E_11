package P3;

public class DataDosen11 {
    public static void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        int index =1;
        for (Dosen11 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + index++);
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + (d.jenisKelamin ? "pria" : "wanita"));
            System.out.println("Usia: " + d.usia);
            System.out.println("---------------------------------------------");
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
        System.out.println("---------------------------------------------");
    }
    public static void rataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += d.usia;
                jumlahWanita++;
            }
        }

        double rataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria: " + rataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rataUsiaWanita);
        System.out.println("---------------------------------------------");
    }
    public static void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        Dosen11 dosenTua = arrayOfDosen[0];
        for (Dosen11 d : arrayOfDosen) {
            if (d.usia > dosenTua.usia) {
                dosenTua = d;
            }
        }
        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode: " + dosenTua.kode);
        System.out.println("Nama: " + dosenTua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTua.jenisKelamin ? "pria" : "wanita"));
        System.out.println("Usia: " + dosenTua.usia);
        System.out.println("---------------------------------------------");
    }
    public static void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        Dosen11 dosenMuda = arrayOfDosen[0];
        for (Dosen11 d : arrayOfDosen) {
            if (d.usia < dosenMuda.usia) {
                dosenMuda = d;
            }
        }
        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode: " + dosenMuda.kode);
        System.out.println("Nama: " + dosenMuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenMuda.jenisKelamin ? "pria" : "wanita"));
        System.out.println("Usia: " + dosenMuda.usia);
        System.out.println("---------------------------------------------");
    }
}
