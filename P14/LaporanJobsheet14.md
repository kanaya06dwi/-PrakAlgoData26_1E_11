##  Jobsheet XIV

##  COllection

## Buat class Customer dalam customer.java

<img width="375" height="165" alt="image" src="https://github.com/user-attachments/assets/6b2fc708-2e35-48a1-ac5b-f5bebb832710" />

## Buat class book dalam book.java

<img width="386" height="218" alt="image" src="https://github.com/user-attachments/assets/f70c556a-1c52-4816-9561-2ecc93261437" />

## Praktikum - Implementasi ArrayList
## Kode program pada fungsi main()

<img width="461" height="266" alt="image" src="https://github.com/user-attachments/assets/636f1b01-4949-44fc-8faf-99423f18d8ad" />

- Compile dan run kode program, di mana object yang baru ditambahkan? Di awal, di tengah, atau di akhir
collection?

<img width="139" height="64" alt="image" src="https://github.com/user-attachments/assets/60dbda22-ef20-4ec7-bcc2-2365983e4c8e" />

 jawaban: Object yang baru ditambahka ada di akhir collection

- Untuk menambahkan object baru pada index tertentu, lakukan sebagai berikut:

<img width="427" height="254" alt="image" src="https://github.com/user-attachments/assets/352f9751-3519-4ffb-8643-e7f31e44eac9" />

Hasil: 

<img width="139" height="77" alt="image" src="https://github.com/user-attachments/assets/c2abdd7a-71da-43ae-bef9-47fe5ee7d734" />

jawaban: Index pada ArrayList dimulai dari 0, data yang baru ditambahkan ada di index ke 2.

- Untuk mengetahui posisi dari suatu objek, gunakan method indexOdf()

  <img width="455" height="279" alt="image" src="https://github.com/user-attachments/assets/0e152f01-bfa9-4329-b84b-807ca1950cda" />

- Untuk mengembalikan object pada index tertentu, gunakan method get()

  <img width="456" height="311" alt="image" src="https://github.com/user-attachments/assets/46d2e6d2-4da5-432d-a9f5-d45b312aa524" />

- Coba hapus angka 2 saat instansiasi object customers. Apakah ArrayList dapat diinstansiasi tanpa
  harus menentukan size di awal?
jawaban: Ya bisa. Jika ukuran tidak ditentukan di awal (misal: new ArrayList<> (), java akan otomatis
memberikan kapasitas default secara internal.
- Dapat menambahkan sekumpulan customer baru ke dalam ArrayList secara sekaligus. Misalnya terdapat ArrayList newCustomers.
  Tambahkan seluruh object customer sekaligus ke dalam customers.

<img width="484" height="443" alt="image" src="https://github.com/user-attachments/assets/068803d5-5287-4a16-a479-dde47aa2fbec" />

Hasilnya :

<img width="598" height="165" alt="image" src="https://github.com/user-attachments/assets/668ea793-8b53-4292-b69d-8f0143ca3361" />

## 13.4 Praktikum - Implementasi Stack
## Kode Program
<img width="500" height="389" alt="image" src="https://github.com/user-attachments/assets/4ea3e162-f641-4734-937e-5e84c1573fc1" />

## Hasil

<img width="482" height="79" alt="image" src="https://github.com/user-attachments/assets/e1af0ceb-5b38-4b94-8c90-843e2de4ea7c" />

- Mengapa perlu ada pengecekan (temp != null)?
  Untuk menghindari error NullPointerException. Pengecekan ini memastikan program tidak mencoba mengakses atau mencetak data dari objek yang kosong (null), terutama jika ternyata dalam keaadaan kosong saat method peel() atau pop() dipanggil.
- Bagaimana cara melakukan pencarian elemen pada stcak menggunakan method search()?
  Menggunakan kode books.search(objectBuku). Method ini akan mengembalikan posisi elemen tersebut di dalam stack (dihitung dari atas tumpukan dengan basis index 1).

## 13.5 Praktikum - Implementasi TreeSet
## Kode Program TreeSetDemo

<img width="356" height="328" alt="image" src="https://github.com/user-attachments/assets/319a77bd-fab4-4d18-8b04-99705550e86a" />

## Hasil

<img width="81" height="125" alt="image" src="https://github.com/user-attachments/assets/887be247-3aee-492e-842c-6c026529feb3" />

- Mengapa urutan yang ditampilkan berbeda dengan urutan penambahan data ke dalam TreeSet fruits?
  Karena TreeSet secara otomatis mengurutkan elemennya berdasarkan urutan alamu. Untuk data bertipe String, akan mengurutkannya secara alfabetis (A-Z), bukan berdasarkan urutan saat data dimasukkan.

## Tambahkan

<img width="405" height="407" alt="image" src="https://github.com/user-attachments/assets/11fc45fa-9281-40f8-ae3f-808e2e044f6c" />

## Hasil kode 

<img width="258" height="150" alt="image" src="https://github.com/user-attachments/assets/7698cd87-e54b-4d69-b95d-3af633866c03" />

- Apa yang dilakukan oleh method first(), last(), remove(), pollFirst(), dan pollLast()?
  first() : mengambil elemen pertama (palin kecil/awal) tanpa menghapusnya
  last() : mengambil elemen terakhir (paling besar/akhir) tanpa menghapusnya
  remove(object) : mencari objek tertentu yang spesifik dari dalam set
  pollFirst() : mengambil sekaligus menghapus elemen pertama di dalam set
  pollLast() : mengambil sekaligus menghapus elemen terakhir di dalam set.

  
  
