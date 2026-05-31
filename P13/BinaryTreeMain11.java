package P13;

public class BinaryTreeMain11 {
    public static void main(String[] args) {
BinaryTree11 bst = new BinaryTree11();
bst.add(new P13.Mahasiswa11("210001", "Naya", "A", 3.57));
bst.add(new P13.Mahasiswa11("210002", "Bob", "B", 3.2));
bst.add(new P13.Mahasiswa11("210003", "Charlie", "A", 3.22));
bst.add(new P13.Mahasiswa11("210004", "David", "C", 3.54));

System.out.println("\nDaftar semua mahasiswa (in order traversal):");
bst.traverseInOrder(bst.root);

System.out.println("\nPencarian data mahasiswa: ");
System.out.print("Cari mahasiswa dengan IPK: 3.54 :");
String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
System.out.println(hasilCari);

System.out.print("Cari mahasiswa dengan IPK: 3.22 :");
hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
System.out.println(hasilCari);

bst.add(new Mahasiswa11("220001", "Zidan", "A", 3.72));
bst.add(new Mahasiswa11("220002", "Eve", "B", 3.37));
bst.add(new Mahasiswa11("220003", "Frank", "C", 3.46));
System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: ");
System.out.println("InOrder Traversal: ");
bst.traverseInOrder(bst.root);
System.out.println("\nPreOrder Traversal: ");
bst.traversePreOrder(bst.root);
System.out.println("\nPostOrder Traversal: ");
bst.traversePostOrder(bst.root);

System.out.println("Penghapusan data mahasiswa: ");
bst.delete(3.57);
System.out.println("\nDaftar semua mahasiswa (in order traversal): ");
bst.traverseInOrder(bst.root);

    }
}
