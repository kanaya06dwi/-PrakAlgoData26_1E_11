package P13;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {

        BinaryTreeArray bta = new BinaryTreeArray();

        bta.add(new Mahasiswa("244160121", "Ali",   "A", 3.57));
        bta.add(new Mahasiswa("244160185", "Candra","C", 3.41));
        bta.add(new Mahasiswa("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa("244160220", "Dewi",  "B", 3.35));
        bta.add(new Mahasiswa("244160131", "Devi",  "A", 3.48));
        bta.add(new Mahasiswa("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa("244160170", "Fizi",  "B", 3.86));

        System.out.println("=== InOrder Traversal ===");
        bta.traverseInOrder(0);

        System.out.println("\n=== PreOrder Traversal ===");
        bta.traversePreOrder(0);
    }
}

