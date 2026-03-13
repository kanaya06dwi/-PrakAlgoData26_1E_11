package P5;

public class MainNilai {
    public static void main(String[] args) {
        Mahasiswa mhs[] ={
             new Mahasiswa("Budi",85,88),
            new Mahasiswa("Cindy",90,87),
            new Mahasiswa("Dian",76,79),
            new Mahasiswa("Eko",92,95),
            new Mahasiswa("Fajar",88,85),
            new Mahasiswa("Gina",80,83),
            new Mahasiswa("Hadi",82,84)
        };
        Nilai n = new Nilai();
        int max = n.maxUts(mhs, 0, mhs.length-1);
        int min = n.minUts(mhs,0,mhs.length-1);
        double rata = n.rataUas(mhs);

        System.out.println("Nilai UTS tertinggi: " + max);
        System.out.println("Nilai UTS terendah: " + min);
        System.out.println("Rata-rata UAS: " + rata);
    }
}
