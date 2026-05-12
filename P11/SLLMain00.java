package P11;

public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
         Mahasiswa00 mhs1 = new Mahasiswa00("2501", "Alvaro", "1A", 4.0);
         Mahasiswa00 mhs2 = new Mahasiswa00("2502", "Kanaya", "1E", 4.0);
            Mahasiswa00 mhs3 = new Mahasiswa00("2503", "Zidan", "1E", 4.0);
            Mahasiswa00 mhs4 = new Mahasiswa00("2504", "Naya", "1E", 4.0);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Alvaro", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
