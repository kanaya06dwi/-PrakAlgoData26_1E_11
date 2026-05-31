package P13;

public class BinaryTreeArrayMain11 {
    public static void main(String[] args) {
        BinaryTreeArray11 bta = new BinaryTreeArray11();
        Mahasiswa11 mhs1 = new Mahasiswa11("24001", "Naya", "A", 3.57);
        Mahasiswa11 mhs2 = new Mahasiswa11("24002", "Bob", "B", 3.2);
        Mahasiswa11 mhs3 = new Mahasiswa11("24003", "Charlie", "A", 3.8);
        Mahasiswa11 mhs4 = new Mahasiswa11("24004", "David", "C", 3.0);

        Mahasiswa11 mhs5 = new Mahasiswa11("24005", "Eve", "C", 3.0);
        Mahasiswa11 mhs6 = new Mahasiswa11("24006", "Frank", "B", 3.46);
        Mahasiswa11 mhs7 = new Mahasiswa11("24007", "Grace", "A", 3.72);
       

        Mahasiswa11[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6,mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("InOrder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
       
    }
}
