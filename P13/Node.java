package P13;

public class Node {
    Mahasiswa mahasiswa;
    Node left, right;
 
    public Node() {}
 
    public Node(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}
