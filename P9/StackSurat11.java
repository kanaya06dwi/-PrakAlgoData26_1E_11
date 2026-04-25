package P9;

public class StackSurat11 {
    Surat11[] stack;
    int size;
    int top;
    public StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Surat11 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack sudah penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }
    public Surat11 pop() {
        if (!isEmpty()) {
            Surat11 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diproses.");
            return null;
        }
    }
    public Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk dilihat.");
            return null;
        }
    }
    public void cariSUrat(String nama){
        boolean ditemukan = false;
        for (int i = 0; i <= top; i ++){
           if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
               System.out.println("Surat ditemukan!");
                System.out.println("ID Surat   : " + stack[i].idSurat);
                System.out.println("Nama       : " + stack[i].namaMahasiswa);
                System.out.println("Kelas      : " + stack[i].kelas);
                System.out.println("Jenis Izin : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi     : " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
