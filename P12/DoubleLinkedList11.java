package P12;

public class DoubleLinkedList11 {
    Node11 head;
    Node11 tail;
    int size;

    public DoubleLinkedList11() {
        head = null;
        tail = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public void printSize() {
        System.out.println("Ukuran Linked List: " + size);
    }
public boolean isEmpty() {
    return head == null;
}
public void addFirst(Mahasiswa11 data) {
    Node11 newNode = new Node11(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    size ++;
}
public void addLast(Mahasiswa11 data) {
    Node11 newNode = new Node11(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
}
public void insertAfter(String keyNim, Mahasiswa11 data) {
    Node11 current=head;
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }
    if (current == null) {
        System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    } 
    Node11 newNode = new Node11(data);
    if (current == tail) {
        newNode.prev = current;
        current.next = newNode;
        tail = newNode;
    }else {
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }
    System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print () {
        if (isEmpty()) {
            System.out.println("Double Linked List kosong.");
            return;
        } 
        Node11 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        } 
        System.out.println("Data berhasil dihapus");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Double Linked List kosong.");
            return;
        } 
        System.out.println("Data berhasil dihapus");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    System.out.println("=== Tampil Terbalik ===");
    Node11 current = tail; 
    while (current != null) {
        current.data.tampil();
        current = current.prev;
    }
}
public void add (int index, Mahasiswa11 data) {
    if (index < 0) {
        System.out.println("Index tidak valid.");
        return;
    }
    if (index == 0) {
        addFirst(data);
        return;
    }
    Node11 current = head;
    int i = 0;
    while (current != null && i < index - 1) {
        current = current.next;
        i++;
    }
    if (current == null) {
        System.out.println("Index melebihi ukuran linked list.");
        return;
    }
    if (current == tail) {
        addLast(data);
        return;
    }
    Node11 newNode = new Node11(data);
    newNode.next = current.next;
    newNode.prev = current;
    current.next.prev = newNode;
    current.next = newNode;
    System.out.println("Data berhasil ditambahkan pada index " + index);
}
public void removeAfter(String keyNim) {
    Node11 current = head;
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }
    if (current == null) {
        System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }
    if (current.next == null) {
        System.out.println("Tidak ada node setelah NIM " + keyNim);
        return;
    }
    Node11 toDelete = current.next;
    System.out.println("Data berhasil dihapus:");
    toDelete.data.tampil();

    if (toDelete == tail) {
        tail = current;
        current.next = null;
    } else {
        current.next = toDelete.next;
        toDelete.next.prev = current;
    }
}
public void remove(int index) {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }
    if (index < 0) {
        System.out.println("Index tidak valid.");
        return;
    }
    if (index == 0) {
        removeFirst();
        return;
    }
    Node11 current = head;
    int i = 0;
    while (current != null && i < index) {
        current = current.next;
        i++;
    }
    if (current == null) {
        System.out.println("Index melebihi ukuran linked list.");
        return;
    }
    if (current == tail) {
        removeLast();
        return;
    }
    System.out.println("Data berhasil dihapus:");
    current.data.tampil();
    current.prev.next = current.next;
    current.next.prev = current.prev;
}
public void getFirst() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    System.out.println("Data pertama:");
    head.data.tampil();
}

public void getLast() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    System.out.println("Data terakhir:");
    tail.data.tampil();
}

public void getIndex(int index) {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    Node11 current = head;
    int i = 0;
    while (current != null && i < index) {
        current = current.next;
        i++;
    }
    if (current == null) {
        System.out.println("Index " + index + " tidak ditemukan.");
        return;
    }
    System.out.println("Data pada index " + index + ":");
    current.data.tampil();
}
}
