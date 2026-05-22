package CM2;

public class LinkedListRekap {
    class NodeRekap { // Node untuk menyimpan rekap pesanan
    String namaPesanan;
    int jumlah; 
    NodeRekap next; 
    NodeRekap prev; 

    NodeRekap(String namaPesanan) { // Konstruktor untuk inisialisasi node rekap dengan nama pesanan
        this.namaPesanan = namaPesanan; // Inisialisasi nama pesanan
        this.jumlah = 1;  
        this.next = null; 
        this.prev = null; 
    }
}
    NodeRekap head, tail; // Pointer ke node pertama dan terakhir dalam linked list rekap
 // Tambah rekap baru
    void tambahRekap(Pembeli pembeli, Pesanan pesanan) {
        NodeRekap newNode = new NodeRekap(pesanan.namaPesanan); // membuat node rekap baru dengan nama pesanan
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    // dipanggil setiap ada pesanan baru masuk
    void updateRekap(String namaPesanan) {
        // cek dulu apakah nama menu sudah ada atau tidak, jika sudah ada lalu jumlahnya di tambah 1
        NodeRekap curr = head;
        while (curr != null) {
            if (curr.namaPesanan.equalsIgnoreCase(namaPesanan)) {
                curr.jumlah++; // sudah ada lalu di tambah jumlah
                return;
            }
            curr = curr.next;
        }

        // jika belum ada lalu buat node baru dijumlah 1
        NodeRekap baru = new NodeRekap(namaPesanan);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
    }

    // Bubble sort descending berdasarkan jumlah
    void sortDescending() {
        if (head == null) return;
        boolean swap;
        do {
            swap = false; // flag mengecek apakah yang terjadi pertukaran atau tidak
            NodeRekap curr = head;
            while (curr.next != null) {
                if (curr.jumlah < curr.next.jumlah) {
                    // tukar data
                    String tmpNama = curr.namaPesanan;
                    int tmpJumlah = curr.jumlah; // simpan sementara data yang akan ditukar
                    curr.namaPesanan = curr.next.namaPesanan; // tukar nama pesanan dan jumlahnya
                    curr.jumlah = curr.next.jumlah;
                    curr.next.namaPesanan = tmpNama;
                    curr.next.jumlah = tmpJumlah;
                    swap = true;
                }
                curr = curr.next;
            }
        } while (swap);
    }
    // Tampilkan rekap
    void cetakRekap() {
        if (head == null) { 
            System.out.println("Belum ada rekap pesanan!");
            return;
        }
        sortDescending();
        System.out.println("==========================================");
        System.out.println("   REKAP PESANAN PER MENU (Terlaris)");
        System.out.println("==========================================");
        System.out.printf("%-25s %-10s%n", "Nama Pesanan", "Jumlah");
        NodeRekap curr = head;
        while (curr != null) {
            System.out.printf("%-25s %-10d%n", curr.namaPesanan, curr.jumlah);
            curr = curr.next;
        }
    }
}
