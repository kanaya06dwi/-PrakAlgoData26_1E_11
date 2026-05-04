package P10;

public class AntrianKRS11 {
    Mahasiswa11[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDiproses;
    int batasPerDPA = 30;
 public AntrianKRS11(int max) {
        this.max = max;
        this.data = new Mahasiswa11[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void kosongkanAntrian() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            totalDiproses = 0;
            System.out.println("Antrian KRS telah dikosongkan.");
        } else {
            System.out.println("Antrian KRS sudah kosong.");
        }
    }
    public void tambahAntrian(Mahasiswa11 mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " ditambahkan ke antrian KRS.");
        } else {
            System.out.println("Antrian KRS sudah penuh. Tidak bisa menambahkan mahasiswa.");
        }
    }
    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }
        if (totalDiproses >= batasPerDPA) {
            System.out.println("DPA sudah mencapai batas maksimal " + batasPerDPA + "mahasiswa.");
            return;
        }
        System.out.println("=== Memanggil Antrian untuk proses KRS ===");
        int jumlahPanggil = Math.min(2, size);
        jumlahPanggil = Math.min(jumlahPanggil, batasPerDPA - totalDiproses);
        for (int i = 0; i < jumlahPanggil; i++) {
            Mahasiswa11 mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDiproses++;
            System.out.println("Dipanggil ");
            mhs.tampilkanData();
        }
        System.out.println("Total mahasiswa yang sudah diproses: " + totalDiproses + "mahasiswa.");
    }
    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("=== Daftar Antrian KRS ===");
        System.out.println("NO  | NIM         | Nama        | Prodi   | Kelas");
        System.out.println("----+-------------+-------------+---------+-------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.printf("%-3d| ", i + 1);
            data[index].tampilkanData();
        }
        System.out.println("Total antrian: " + size);
    }
    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }
        System.out.println("=== Dua Mahasiswa Terdepan dalam Antrian KRS ===");
        int jumlahTampil = Math.min(2, size);
        for (int i = 0; i < jumlahTampil; i++) {
            int index = (front + i) % max;
            System.out.printf("%-3d| ", i + 1);
            data[index].tampilkanData();
        }
    }
    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }
        int indexAkhir = rear;
        System.out.println("=== Mahasiswa Terakhir dalam Antrian KRS ===");
        System.out.printf("%-3d| ", size);
        data[indexAkhir].tampilkanData();
    }
    public int getJumlahAntrian() {
        return size;
    }
    public int getTotalDiproses() {
        return totalDiproses;
    }
    public int getBelumProses() {
        return size;
    }
}
