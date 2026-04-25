package P9;

public class StackTugasMahasiswa11 {
    Mahasiswa11[] stack;
    int top;
    int size;
    public StackTugasMahasiswa11(int size) {
        this.size = size;
        stack = new Mahasiswa11[size];
        top = -1;
    }
    
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa11 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack sudah penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa11 pop() {
        if (!isEmpty()) {
            Mahasiswa11 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dilihat.");
            return null;
        }
    }
    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + "NIM: " + stack[i].nim + "\t" + "Kelas: " + stack[i].kelas);
        }
        System.out.println("");
    }
    public Mahasiswa11 lihatBawah(){
        if (! isEmpty()){
            return stack[0];
        }
        return null;
    }
    public int jumlahTugas() {
        return top + 1;
    }
    public String konversiDesimalKeBiner(int nilai){
        StackKonversi11 stack = new StackKonversi11();
        while (nilai > 0 ) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
