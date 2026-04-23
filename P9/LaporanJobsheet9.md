## Percobaan 1: Mahasiswa Mengumpulkan Tugas
A. Class Mahasiswa

![img](https://github.com/user-attachments/assets/5f8f4ffb-b1dc-4779-8365-003569ba5171)

B. Class StackTugasMahasiswa

![img](https://github.com/user-attachments/assets/1398a3ea-34a4-45ea-809b-3e47103a01c6)

![img](https://github.com/user-attachments/assets/82cb524f-d1ab-4a8b-a3ca-5f3b82216344)

C. Class Utama

![img](https://github.com/user-attachments/assets/98e7d2f8-8aa1-47a5-afac-34b65f399893)

![img](https://github.com/user-attachments/assets/9b9f6b2e-83a8-4708-b0a3-9e5e7fc3f436)

OUTPUT

![img](https://github.com/user-attachments/assets/b731a635-a8ff-4983-a189-6fede4fe1a46)

![img](https://github.com/user-attachments/assets/81debeec-31aa-4dc9-873c-67b6276be1c3)

## PERTANYAAN
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana yang perlu diperbaiki?
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan
kode programnya!
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut
dihapus, apa dampaknya?
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat
ini, serta tambahkan operasi menunya!
6. Commit dan push kode program ke Github

## JAWABAN
1. Bagian yang perlu diperbaiki adalah class Mahasiswa11, StackTugasMahasiswa11 dan MahasiswaDemo11
   - Nama construktor harus sama dengan nama class
   - Penulisan method main
   - Struktur do-while
   - method push, pop, peek dan print
     Perbaikan ini dilakukan agar hasil output sesuai
2. Sebanyak 5 data Mahasiswa
  
   ![img](https://github.com/user-attachments/assets/ef754dc5-2ca3-46dd-bec1-498a9cd05a6c)

3. Untuk memastikan stack belum penuh sebelum data baru ditambahkan.
4. Tambahkan method pada StackTugasMahasiswa11
   
   ![img](https://github.com/user-attachments/assets/34ff1c31-f928-4bda-bb83-212ecde323db)
  
   Lalu tambahkan menu pilihan
  
   ![img](https://github.com/user-attachments/assets/f3eb6e1d-fb09-45de-be83-43a72136ef58)
5. Tambahkan Method
   
   ![img](https://github.com/user-attachments/assets/591d00b6-2693-4448-bd1d-3be63d89058d)

   Tambahkan Menu
   
   ![img](https://github.com/user-attachments/assets/3bd34098-d7fb-479f-afa5-7e37daff257e)

## 2.2 percobaan 2: Konversi Nilai Tugas ke Biner
Kode Program
<img width="472" height="256" alt="image" src="https://github.com/user-attachments/assets/378a2992-a209-4bc5-b464-8c0e2770f810" />
Kode Class File StackKonversi
<img width="467" height="615" alt="image" src="https://github.com/user-attachments/assets/52c5d7d4-0e0c-4dab-ac74-df5a30740640" />

Kode tambahkan di case 2
<img width="568" height="184" alt="image" src="https://github.com/user-attachments/assets/b9dfd479-276b-4a9f-9b23-cad970381ea8" />
Hasil Output
<img width="273" height="454" alt="image" src="https://github.com/user-attachments/assets/db59a42f-1bbf-4a98-9d0b-73b42f3ecdaa" />

## 2.2.3 Pertanyaan
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!

## Jawaban
1. Alur nya itu nilai yang dimasukkan misal yang ada di contoh itu 87. lalu kita bagi dengan 2.
   - 87 bagi 2 itu 43 sisa 1
   - 43 bagi 2 itu 21 sisa 1
   - 21 bagi 2 itu 10 sisa 1
   - 10 bagi 2 itu 5 sisa 0
   - 5 bagi 2 itu 2 sisa 1
   - 2 bagi 2 itu 1 sisa 0
   - 1 bagi 2 itu 0 sisa 1
     Sisa yang masuk stack:
     1110101.  Jadi biner dari 87 adalah 1010111.
2. Hasilnya tetap sama dengan while (kode >0) selama nilai yang dimasukkan adalah bilangan positif.
   Hal ini karena perulangan akan terus berjalan sampai nilai menjadi 0, sehingga proses konversi biner
   tetap menghasilkan output yang sama.


## 2.4 Latihan Praktikum
