## 2.1 Pembuatan Single Linked List
## Kode Program Mahasiswa00

![img](https://github.com/user-attachments/assets/5b100fb0-7759-4996-99dd-5bb11fc9643d)

## Kode Program NodeMahasiswa

![img](https://github.com/user-attachments/assets/1eb9ecb5-1b57-48b5-bcaa-dea634419c26)

## Kode Program SingleLinkedList

![img](https://github.com/user-attachments/assets/cb23a93a-eae9-41a0-b2ab-c25f270ebea3)

![img](https://github.com/user-attachments/assets/831ac6a2-5ee4-4a27-956a-280a8b6ca188)

## Kode Program SLLMain00

![img](https://github.com/user-attachments/assets/5fd3c783-e88b-427e-8e8b-ad963cb26d6b)

## Hasil

![img](https://github.com/user-attachments/assets/f07becb6-164a-4e48-b8c9-c74e4991d440)

## 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

## Jawaban
1. Karena sll,print() dipanggil pertama kali sebelum data apapun ditambahkan ke linkedlist. Pada saat itu, head
   == null sehingga isEmpty() return true, dan program mencetak "Linked list kosong".
2. Untuk melakukan penulusuran node-node dalam linked list tanpa mengubah posisi head.
3. Berikut modifikasi

   ![img](https://github.com/user-attachments/assets/27247cfe-9154-4947-a979-76aaad8dd2e3)
  
Hasil nya

![img](https://github.com/user-attachments/assets/ed468c1a-cdff-4687-a862-5de1b1c42681)

## 2.2 Modifikasi Elemen pada Single Linked List
## Kode Program

![img](https://github.com/user-attachments/assets/dd088bc9-b3ff-4f99-9d77-7fb033ec8744)

![img](https://github.com/user-attachments/assets/59f1dca6-b6b4-42e2-9af5-e7d613f2f578)

![img](https://github.com/user-attachments/assets/a79761b4-09f9-4e8f-a9d1-33f1bbbaa601)

![img](https://github.com/user-attachments/assets/6b736961-4f5a-43c0-b03d-ec4a2519911e)

## Hasil

![img](https://github.com/user-attachments/assets/bbd0c5e4-0f99-4fcc-929f-edf8d5505764)

## Pertanyaan
Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
2. Jelaskan kegunaan kode dibawah pada method remove

   ![img](https://github.com/user-attachments/assets/ff9202ec-9e9e-4a86-badb-56784fb33220)
  
## Jawaban
1. Untuk menghentikan loop while segera setelah node yang di cari ditemukan dan dihapus. Tanpa break,
   loop akan terus berjalan ke node berikutnya meski penghapusan sudah dilakukan, yang bisa menyebabkan
   error atau penghapusan data yang salah.
2. - temp.next.next untuk melewati node yang dihapus agar tidak terhubung lagi.
   - if (temp.next == null) { tail = temp;} untuk jika yang dihapus node terakhir, maka tail
     dipindah ke node sebelumnya.
## Tugas
## Kode Program

![img](https://github.com/user-attachments/assets/13710b6e-da20-45e3-8d9d-0553320b8bcf)

![img](https://github.com/user-attachments/assets/5dacab73-9c35-4c0d-aedc-9875245a9433)

![img](https://github.com/user-attachments/assets/3206a23b-431b-4c2d-bd67-67665b975354)

![img](https://github.com/user-attachments/assets/79a9c64a-d647-4623-9ab3-ab1572cdab15)

![img](https://github.com/user-attachments/assets/18b3e12b-7dd7-4780-bee9-df265124ebb2)

![img](https://github.com/user-attachments/assets/287d694a-c3f4-4e13-aeb4-562a7bad193f)

![img](https://github.com/user-attachments/assets/2c05f733-4db3-4ce0-a0e3-2239223912a8)


## Hasil

![img](https://github.com/user-attachments/assets/2edbfb27-cf73-4911-b2a7-73eb95018d93)

![img](https://github.com/user-attachments/assets/e5760958-619d-4446-b48b-3a313281fc73)

![img](https://github.com/user-attachments/assets/1b38c1c7-c58b-47a3-ad7e-46046027d18c)

![img](https://github.com/user-attachments/assets/4db5e5d6-bf67-40d9-a114-1432594f6699)

