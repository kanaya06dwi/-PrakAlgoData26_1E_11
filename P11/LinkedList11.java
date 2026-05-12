package P11;

public class LinkedList11 {
    Node11 front, rear;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void enqueue(Mahasiswa11 data) {
        Node11 newNode = new Node11(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(data.nama + " berhasil masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            front.data.tampilData();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        }
    }

    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terakhir:");
            rear.data.tampilData();
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("\nDaftar Antrian:");
            Node11 temp = front;

            while (temp != null) {
                System.out.println(temp.data.nama + " - " + temp.data.keperluan);
                temp = temp.next;
            }
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}
