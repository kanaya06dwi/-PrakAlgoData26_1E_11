package CM2;

public class DoubleLinkedListAntrian {
    NodeAntrian head, tail;
    int counterAntrian = 0;
    void tambahAntrian(String namaPembeli, String noHp) {
        counterAntrian++;
        Pembeli pembeliBaru = new Pembeli(counterAntrian, namaPembeli, noHp);
        NodeAntrian newNode = new NodeAntrian(pembeliBaru);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor :" + pembeliBaru.noAntrian);
    }
    void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
       System.out.println("No Antrian\tNama Pembeli\tNo HP");
        NodeAntrian current = head;
        while (current != null) {
            System.out.println(current.data.noAntrian + "\t\t" + current.data.namaPembeli + "\t\t" + current.data.noHp);
            current = current.next;
        }
    }
    Pembeli hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong, tidak ada yang bisa dihapus.");
            return null;
        }
        Pembeli pembeliDihapus = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        System.out.println("Antrian dengan nomor " + pembeliDihapus.noAntrian + " telah dihapus.");
        return pembeliDihapus;
    }
}
