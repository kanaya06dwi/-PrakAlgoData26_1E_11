## Laporan Jobsheet 15
## Praktikum 1

<img width="1180" height="543" alt="image" src="https://github.com/user-attachments/assets/80ce620c-fd40-4803-ae7b-5f63e6bd353a" />

## Hasil

<img width="373" height="76" alt="image" src="https://github.com/user-attachments/assets/ef462a0d-9650-4008-9933-75b61aac270e" />

## Pertanyaan
1. Mengapa semua jenis data bisa ditampung ke dalam sebuah ArrayList?
2. Modifikasi baris 25-36 agar hanya menampung satu jenis/tipe data tertentu!
3. Ubah baris 38 menjadi Linkedlist<String> names = new LinkedList<>();
4. Tambahkan names.push("Mei-mei") dan gunakan getFirst() / getLast()
## Jawaban
1. karena pada baris 25, ArrayList dideklrasikan tanpa generic type (raw type). ketika tidak ada generic type
   yang ditentukan, ArrayList dianggap bertipe object.
2. kode :
   List<Integer> l = new ArrayList<>();
l.add(1);
l.add(2);
l.add(3);
System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",
        l.get(0), l.size(), l.get(l.size() - 1));

l.add(4);
l.remove(0);
System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",
        l.get(0), l.size(), l.get(l.size() - 1));
3. LinkedList<String> names = new LinkedList<>();
4 & 5. names.push("Mei-mei");
System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
        names.getFirst(), names.size(), names.getLast());
System.out.println("Names: " + names.toString());

## Praktikum 2

<img width="438" height="500" alt="image" src="https://github.com/user-attachments/assets/fad4bc7f-530c-4d46-a53e-63e43195c4ae" />

## Hasil

<img width="383" height="45" alt="image" src="https://github.com/user-attachments/assets/6cac5da9-c1ad-4c7c-a32d-e505c36632c6" />

## Pertanyaan
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
2. Hilangkan baris 43 dan 44, apa yang terjadi?
3. Jelaskan fungsi dari baris 46-49!
4. Ganti stack<string> menjadi list<string>, apa yang terjadi?
5. Ganti elemen terakhir dari objek fruits menjadi "Strawberry"!
6. Tambahkan "Mango", "guava", "avocado" kemudia sorting!
## Jawaban
1. - push() ditambah di atas/top stack (index terakhir)
   - add() ditambah di akhir list
2. jika baris dihilangkan, maka stack fruits akan kosong karena sebelumnya sudah dikosongkan oleh loop while(!fruits.empty()).
3. - membuat objek iterator untuk stack fruits
   - mengecek apakah masih ada elemen berikutnnya (true/false)
   - mengambil elemen berikutnnya dan memajukan pointer iterator
4. program tidak bisa dikomplikasi (error).
5. fruits.set(fruits.size() - 1, "Strawberry");
fruits.pop();
fruits.push("Strawberry");
6. fruits.add("Mango");
fruits.add("guava");
fruits.add("avocado");
Collections.sort(fruits);
System.out.println("Sorted: " + fruits);
Collections.sort(fruits, Collections.reverseOrder());
System.out.println("Sorted Descending: " + fruits);


## Praktikum 3

<img width="394" height="297" alt="image" src="https://github.com/user-attachments/assets/eac43f9e-eec0-47e6-a641-72d1aff59305" />

<img width="691" height="595" alt="image" src="https://github.com/user-attachments/assets/195ffeca-e089-4075-b674-507a4d206c55" />


## Hasil

<img width="351" height="91" alt="image" src="https://github.com/user-attachments/assets/f5448dcd-ea64-4bb2-9525-bbc04a3af11e" />

## Pertanyaan
1. Fungsi tambah() menggunakan unlimited argument, konsep apa dan apa kelebihannya
2. ganti linearsearch dengan binarysearch() dari collections!
3. tambahkan fungsi sorting ascending dan descending!   
## Jawaban
1. - bisa dipanggil dengan jumlah argumen berapa saja
   - lebih fleksibel dibanding membuat banyak method overload
   - di balik layar, varargs dikonversi menjadi array secara otomatis
2.  public int binarySearchByNim(String nim) {
    // Urutkan dulu berdasarkan nim
    mahasiswas.sort(Comparator.comparing(m -> m.nim));

    // Buat objek Mahasiswa dummy untuk dicari
    Mahasiswa key = new Mahasiswa(nim, null, null);

    // Binary search dengan Comparator
    int result = Collections.binarySearch(
        mahasiswas,
        key,
        Comparator.comparing(m -> m.nim)
    );
    return result; // >= 0 jika ditemukan, negatif jika tidak
}
3. // Sorting Ascending berdasarkan nama
public void sortAscending() {
    mahasiswas.sort(Comparator.comparing(m -> m.nama));
}

public void sortDescending() {
    mahasiswas.sort((a, b) -> b.nama.compareTo(a.nama));
}
public void sortByNimAsc() {
    mahasiswas.sort(Comparator.comparing(m -> m.nim));
}

public void sortByNimDesc() {
    mahasiswas.sort((a, b) -> b.nim.compareTo(a.nim));
}
## Tugas Praktikum

<img width="445" height="444" alt="image" src="https://github.com/user-attachments/assets/dff30f7f-f09c-454d-8141-9d70865bea71" />

<img width="388" height="440" alt="image" src="https://github.com/user-attachments/assets/de844586-13ee-4678-afa4-55c89a70bbe0" />

<img width="514" height="441" alt="image" src="https://github.com/user-attachments/assets/f4a1b699-c22c-4f38-8bea-52dd578c696c" />

<img width="471" height="564" alt="image" src="https://github.com/user-attachments/assets/c482500b-9a77-46c3-badc-8ac57f8b081b" />

<img width="554" height="549" alt="image" src="https://github.com/user-attachments/assets/d75d7d5f-8877-410b-b8c1-c90bae875c29" />

<img width="388" height="589" alt="image" src="https://github.com/user-attachments/assets/e06c810e-1cc7-47b6-adfb-592f3cdb3049" />

<img width="501" height="538" alt="image" src="https://github.com/user-attachments/assets/f4e19031-70fe-4a66-8379-55d1b0e6fbf6" />

## Hasil

<img width="276" height="595" alt="image" src="https://github.com/user-attachments/assets/ab9dfdf6-8f88-484f-b763-55e1d92f45ce" />

