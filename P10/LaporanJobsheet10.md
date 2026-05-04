## 2.1 Percobaan 1: Operasi Dasar Queue
## Class Queue

![img](https://github.com/user-attachments/assets/a2855112-8436-4cda-8e2a-b5f52eca56b7)

![img](https://github.com/user-attachments/assets/5b694ddf-99ca-4168-845c-9da6ff1b52b7)

![img](https://github.com/user-attachments/assets/360d924b-3267-44e0-b935-420323613696)

## Class QueueMain

![img](https://github.com/user-attachments/assets/52f2990f-c98f-440a-8b71-ed230d1b837b)

![img](https://github.com/user-attachments/assets/c039e654-f78e-4a0e-90e9-875169a16026)

## Hasil

![img](https://github.com/user-attachments/assets/dd3e5b85-e7b6-4605-9f5f-32ac754cf2af)

## 2.1.3 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
  
![img](https://github.com/user-attachments/assets/a00d40a4-dd3b-4017-84d7-6f41f61539f1)

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
   
![img](https://github.com/user-attachments/assets/1374c98e-17ab-475f-80ee-8fcd09fce0ae)

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
  
![img](https://github.com/user-attachments/assets/377e71c6-21d4-4b5d-af73-bb44be055700)

6. Tunjukkan potongan kode program yang merupakan queue overflow!
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!

## Jawaban
1. front dan rear bernilai -1 karena queue masih kosong belum ada data. Nilai -1 itu penanda tidak ada data. sedangkan size=0 karena jumlah elemen yang tersimpan memang benar-benar nol.
2. Jika rear sudah berada di indeks paling akhir array (max -1), maka rear dikembalikan ke indeks 0. Agar slot array yang sudah kosong bisa dipakai lagi, sehingga array tidak terbuang sia-sia.
3. Jika front sudah berada di indeks terakhir array, maka setelah data diambil, front dikembalikan ke indeks 0.
4. Karena elemen terdepan tidak selalu berada di indeks o. Setiap kali dequeue dilakukan, front bergeser ke kanan. Jadi harus mulai mencetak dari posisi front yang sebenarnya, bukan dari indeks 0.
5. Setelah mencetak elemen di indeks i, indeks dinaikkan 1. Jika sudah mencapai akhir array, % max akan mengembalikannya ke 0. Contoh: jika i=5 dan max=6, maka (5+1) % 6 = 0, sehingga perulangan kembali ke awal array.
   
6.
   ![img](https://github.com/user-attachments/assets/81061fc2-ef44-474c-b86c-c5dcf2fd70e0)

7.
![img](https://github.com/user-attachments/assets/791afbd7-c039-4b87-be24-32a308296c22)

![img](https://github.com/user-attachments/assets/5ac9a8d2-f4b9-4159-aaa3-4e27b608b3ba)


## 2.2 Percobaan 2: Antrian Layanan Akademik
## Class Mahasiswa

![img](https://github.com/user-attachments/assets/9dc51268-c5fa-4bba-8fc2-ac712b01313a)

## Class AntrianLayanan

![img](https://github.com/user-attachments/assets/e8c2ad14-6741-449b-8b75-382bb4c1767a)

![img](https://github.com/user-attachments/assets/bb897316-c2da-41d4-be6a-39fc70641ba9)

![img](https://github.com/user-attachments/assets/99da9969-bcd1-4c3f-b70a-9dbafea1e56e)


## Class LayananAkademikSIAKAD

![img](https://github.com/user-attachments/assets/a59a84b9-e8d3-41c5-937b-b07806bcfeae)

![img](https://github.com/user-attachments/assets/0fad5648-dc7f-48e1-a42c-fcebf14e0575)

## Hasil

![img](https://github.com/user-attachments/assets/f6b0934f-7a02-4f15-a3e1-9ab383da63e6)

![img](https://github.com/user-attachments/assets/06f61ed3-a898-409f-8330-2bc6848f2065)

## Pertanyaan
Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class
AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan
pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga
method LihatAkhir dapat dipanggil!

## Jawaban

![img](https://github.com/user-attachments/assets/afc90824-3559-45d3-98cf-d1a0a684198c)

![img](https://github.com/user-attachments/assets/8027c079-f8ab-4490-acf7-df660c35766c)

![img](https://github.com/user-attachments/assets/9a0eb0df-e5a4-4f0c-8615-b0bd9f6387f3)


## Hasil

![img](https://github.com/user-attachments/assets/900c4ccb-2c0a-4900-8d2d-0c3326505f47)

![img](https://github.com/user-attachments/assets/373c8d85-d713-4bf8-9807-b48645eebcf7)

## Tugas Praktikum

## Kode Program Mahasiswa

![img](https://github.com/user-attachments/assets/ecd6649a-c2a5-4333-a4ed-5b41b56a0107)

## Kode Program AntrianKRS

![img](https://github.com/user-attachments/assets/8648e528-af6d-49b6-bd6e-251e7077436b)

![img](https://github.com/user-attachments/assets/d8d6655d-747e-4ae0-a2f7-dafd957eeada)

## Kode Program TugasKRS

![img](https://github.com/user-attachments/assets/7287f551-3bdc-4f2e-a4e4-9c6c4d00b8ee)

![img](https://github.com/user-attachments/assets/2510d7d5-775b-48fe-8082-cdd7b214d67d)

![img](https://github.com/user-attachments/assets/bca9f865-efbc-41d9-9a94-0bc195deee4b)

## Hasil

![img](https://github.com/user-attachments/assets/84e4411a-8005-42a3-97b0-db02a105752b)

![img](https://github.com/user-attachments/assets/88a4e0c4-c907-4852-973c-c04ba5edbcfd)

![img](https://github.com/user-attachments/assets/9ef69185-6d3a-402f-86f4-c671505d74f6)

![img](https://github.com/user-attachments/assets/ef0f95c3-23cb-4128-9c73-5e3e6e227f09)

1[img](https://github.com/user-attachments/assets/fef25895-252a-4210-89c1-bcd9aa57a50c)




