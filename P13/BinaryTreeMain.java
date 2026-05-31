package P13;

public class BinaryTreeMain {
   
    public static void main(String[] args) {

        BinaryTree bst = new BinaryTree();

        bst.addRekursif(new Mahasiswa("244160121", "Ali",   "A", 3.57));
        bst.addRekursif(new Mahasiswa("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa("244160185", "Candra","C", 3.21));
        bst.addRekursif(new Mahasiswa("244160220", "Dewi",  "B", 3.54));
        bst.addRekursif(new Mahasiswa("244160131", "Devi",  "A", 3.72));
        bst.addRekursif(new Mahasiswa("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa("244160170", "Fizi",  "B", 3.46));

        System.out.println("=== InOrder Traversal ===");
        bst.traverseInOrder(bst.root);

        System.out.println("\n=== Tugas 2: Min & Max IPK ===");
        bst.cariMinIPK();
        bst.cariMaxIPK();

        System.out.println("\n=== Tugas 3: IPK di atas 3.50 ===");
        bst.tampilMahasiswaIPKdiAtas(3.50);

        System.out.println("\n=== Setelah hapus IPK 3.57 ===");
        bst.delete(3.57);
        bst.traverseInOrder(bst.root);
    }
}

