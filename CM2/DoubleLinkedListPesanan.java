package CM2;

public class DoubleLinkedListPesanan {
    NodePesanan head, tail;
    void tambahPesanan(int kode, String nama, int harga) {
        Pesanan pesananBaru = new Pesanan(kode, nama, harga);
        NodePesanan newNode = new NodePesanan(pesananBaru);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
void bubbleSort() {
    if (head == null)  return;
        boolean swapped;
        do {
            swapped = false;
            NodePesanan current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareTo(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    void cetakPesanan() {
        if (head == null) {
            System.out.println("Daftar pesanan kosong.");
            return;
        }
        bubbleSort();
        int totalHarga = 0;
        System.out.println("Kode\tNama Pesanan\tHarga");
        NodePesanan current = head;
        while (current != null) {
            System.out.println(current.data.noPesanan + "\t" + current.data.namaPesanan + "\t" + current.data.harga);
            totalHarga += current.data.harga;
            current = current.next;
        }
        System.out.println("Total Harga: " + totalHarga);
    }
}

