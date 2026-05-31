package P13;

public class BinaryTreeArray {
    Mahasiswa[] dataMahasiswa;
    int idxLast;
    int capacity = 15;

    public BinaryTreeArray() {
        dataMahasiswa = new Mahasiswa[capacity];
        idxLast = -1;
    }

    public void add(Mahasiswa data) {
        if (idxLast + 1 >= capacity) {
            System.out.println("Tree penuh!"); return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    public void populateData(Mahasiswa[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
