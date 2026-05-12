package P11;

public class SingleLinkedList {
NodeMahasiswa head;
NodeMahasiswa tail;
boolean isEmpty() {
return head == null;
    }
    public void print(){
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(Mahasiswa00 input) {
        NodeMahasiswa ndInput = new NodeMahasiswa (input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            ndInput.next = head;
            head = ndInput;
        }
    }
        public void addLast (Mahasiswa00 input) {
        NodeMahasiswa ndInput = new NodeMahasiswa (input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa00 input) {
        NodeMahasiswa ndInput = new NodeMahasiswa(input, null);
        NodeMahasiswa temp = head;
        do { 
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (temp == tail) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp !=null);
    }
    public void insertAt(int index, Mahasiswa00 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        }else if (index == 0) {
            NodeMahasiswa temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa(input, temp.next);
            if  (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
