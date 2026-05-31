package P13;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void add(Mahasiswa mahasiswa) {
        Node newNode = new Node(mahasiswa);
        if (isEmpty()) {
            root = newNode;
            return;
        }
        Node current = root, parent = null;
        while (true) {
            parent = current;
            if (mahasiswa.ipk < current.mahasiswa.ipk) {
                current = current.left;
                if (current == null) { parent.left = newNode; return; }
            } else {
                current = current.right;
                if (current == null) { parent.right = newNode; return; }
            }
        }
    }

   
    public void addRekursif(Mahasiswa mahasiswa) {
        root = insertRek(root, mahasiswa);
    }

    private Node insertRek(Node node, Mahasiswa mahasiswa) {
        if (node == null) return new Node(mahasiswa);
        if (mahasiswa.ipk < node.mahasiswa.ipk)
            node.left = insertRek(node.left, mahasiswa);
        else
            node.right = insertRek(node.right, mahasiswa);
        return node;
    }


    public void cariMinIPK() {
        if (isEmpty()) { System.out.println("Tree kosong"); return; }
        Node current = root;
        while (current.left != null) current = current.left;
        System.out.print("Mahasiswa IPK Terkecil: ");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) { System.out.println("Tree kosong"); return; }
        Node current = root;
        while (current.right != null) current = current.right;
        System.out.print("Mahasiswa IPK Terbesar: ");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        cariDiAtas(root, ipkBatas);
    }

    private void cariDiAtas(Node node, double batas) {
        if (node == null) return;
        cariDiAtas(node.left, batas);
        if (node.mahasiswa.ipk > batas) node.mahasiswa.tampilInformasi();
        cariDiAtas(node.right, batas);
    }

    
    public boolean find(double ipk) {
        Node current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) return true;
            current = (ipk > current.mahasiswa.ipk) ? current.right : current.left;
        }
        return false;
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public Node getSuccessor(Node del) {
        Node successor = del.right, successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) { System.out.println("Binary tree kosong"); return; }
        Node parent = root, current = root;
        boolean isLeftChild = false;
        while (current.mahasiswa.ipk != ipk) {
            parent = current;
            if (ipk < current.mahasiswa.ipk) { current = current.left; isLeftChild = true; }
            else { current = current.right; isLeftChild = false; }
            if (current == null) { System.out.println("Data tidak ditemukan"); return; }
        }
        if (current.left == null && current.right == null) {
            if (current == root) root = null;
            else if (isLeftChild) parent.left = null;
            else parent.right = null;
        } else if (current.left == null) {
            if (current == root) root = current.right;
            else if (isLeftChild) parent.left = current.right;
            else parent.right = current.right;
        } else if (current.right == null) {
            if (current == root) root = current.left;
            else if (isLeftChild) parent.left = current.left;
            else parent.right = current.left;
        } else {
            Node successor = getSuccessor(current);
            if (current == root) root = successor;
            else if (isLeftChild) parent.left = successor;
            else parent.right = successor;
            successor.left = current.left;
        }
    }
}

