package P3;

public class MahasiswaDemo {
    public static void main(String[] args) {
        mahasiswa[] arrayOfMahasiswa = new mahasiswa[3];
        arrayOfMahasiswa[0] = new mahasiswa();
        arrayOfMahasiswa[0].nim = "254107020028";
        arrayOfMahasiswa[0].nama = "KANAYA DWI YUNIA RAHMAWATI";
        arrayOfMahasiswa[0].kelas = "TI-1E";
        arrayOfMahasiswa[0].ipk = (float) 4.00;

        arrayOfMahasiswa[1] = new mahasiswa();
        arrayOfMahasiswa[1].nim = "254107020029";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-1E";
        arrayOfMahasiswa[1].ipk = (float) 3.75;

        arrayOfMahasiswa[2] = new mahasiswa();
        arrayOfMahasiswa[2].nim = "254107020030";
        arrayOfMahasiswa[2].nama = "FARHAN ALFIAN";
        arrayOfMahasiswa[2].kelas = "TI-1E";
        arrayOfMahasiswa[2].ipk = (float) 3.50;

        System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama    :" + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   :" + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswa[0].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama    :" + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas   :" + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswa[1].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama    :" + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas   :" + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswa[2].ipk);
        System.out.println("-------------------------------------");  
    }
    
}
