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
        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println("data mahasiswa an Alvaro berada pada index : " + sll.indexOf("Alvaro"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
