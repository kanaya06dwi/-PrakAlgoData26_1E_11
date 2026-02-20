# JOBSHEET 2
## 2.1 Percobaan 1 : Deklarasi Class, Atribut, dan Method
Kode Program

<img width="455" height="582" alt="image" src="https://github.com/user-attachments/assets/4e8b2944-169a-4df8-8c21-f78534c25685" />

Hasil Run

<img width="590" height="41" alt="image" src="https://github.com/user-attachments/assets/dcbf3a0a-ee28-4f31-ab3b-1e7d7811aac7" />

Hasil run tersebut eror karena tidak ada main.

### Pertanyaan
1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa?
   Sebutkan apa saja atributnya !
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya !
4. Perhatikan method updateIPK() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan
   valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0).
   Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
   kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang
   dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6. Commit dan push kode program ke Github

### Jawaban
1. Atribut & method
2. nama, nim, kelas, ipk
3. Ada 4 method yaitu tampilkanInformasi, ubahKelas, updateIpk, nilaiKinerja
4. Kode Program

   <img width="641" height="153" alt="image" src="https://github.com/user-attachments/assets/422731c4-7555-4c90-a025-715ec8b5a1ce" />

5. Method nilaiKinerja() bekerja dengan membaca nilai IPK mahasiswa kemudian melakukan pengecekan menggunakan struktur if-else untuk menentukan kategori kinerja.
   Kriteria yang digunakan adalah IPK ≥ 3.5 dikategorikan sebagai "Kinerja sangat baik", IPK ≥ 3.0 sebagai "Kinerja baik", IPK ≥ 2.5 sebagai "Kinerja cukup", dan di bawah 2.5 sebagai "Kinerja kurang".
   Method ini mengembalikan (return) nilai bertipe String berupa kategori kinerja mahasiswa.

## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
Kode Program

<img width="431" height="262" alt="image" src="https://github.com/user-attachments/assets/93302b16-ad1e-4c0d-acd1-852f79bc9b14" />

Hasil Run

<img width="279" height="143" alt="image" src="https://github.com/user-attachments/assets/0c51ddb4-b825-403f-8672-03c9bec3ac8b" />

### Pertanyaan
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

### Jawaban

1. ![img](https://github.com/user-attachments/assets/2a089097-23bf-45ac-8064-f6ac429ba4b5)

   Nama object yang dihasilkan adalah mhs1.
2. Dengan cara menggunakan tanda titik (.) setelah nama object.
3. Hasil output berbeda karena nilai atribut pada object yang diubah sebelum pemanggilan method yang kedua.
   Method tampilkanInformasi() menampilkan data sesuai dengan nilai atribut terbaru yang tersimpan pada object tersebut.

## 2.3 Percobaan 3: Membuat Konstruktor
Kode Program

![img](https://github.com/user-attachments/assets/537e3d81-1ffc-4203-a7a1-578235de0b4b)
Hasil Run

<img width="159" height="67" alt="image" src="https://github.com/user-attachments/assets/5eb1977b-f2fd-429c-b2ba-9bfaa5303644" />

### Pertanyaan
1. Pada class Mahasiswa di percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?

   <img width="872" height="85" alt="image" src="https://github.com/user-attachments/assets/28a929a0-c16a-44fd-93f0-7a0f525673a5" />

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya?
   Jelaskan mengapa hasilnya demikian!
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berueutan?
   Jelaskan alasannya!
5.  Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
6.  Commit dan push kode program ke Github 

### Jawaban

1.  Baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter yaitu:


     <img width="618" height="27" alt="image" src="https://github.com/user-attachments/assets/79a521b7-a1ee-456d-8a87-09c09e24e401" />

2. Baris program tersebut melakukan instansiasi object sekaligus memanggil konstruktor berparameter untuk mengisi nilai atribut secara langsung saat object dibuat.
  
3. <img width="596" height="109" alt="Screenshot 2026-02-20 152649" src="https://github.com/user-attachments/assets/0bed0c29-8a57-42c9-84d4-9b0eb92b4a66" />

   Jika konstruktor di hapus dan di jalankan maka hasilnya akan eror, karena Java tidak menemukan konstruktor yang sesuai dengan pemanggilan object tersebut.

4. Method tidak harus diakses secara berurutan. Method dapat dipanggil dalam urutan apa pun setelah object berhasil dibuat, tergantung kebutuhan program.
5. 

