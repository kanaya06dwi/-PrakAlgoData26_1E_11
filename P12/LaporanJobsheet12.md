## Jobsheet 12
## Percobaan 1
## Kode Program

![img](https://github.com/user-attachments/assets/6f9d5800-dc44-4c02-8cd2-7eecba7f92a2)

![img](https://github.com/user-attachments/assets/d679908d-cdcf-4814-b409-630318ff3483)

![img](https://github.com/user-attachments/assets/38483fc9-6086-485e-b0f0-79e1bfa48bbc)

![img](https://github.com/user-attachments/assets/efdddc7d-024b-4025-8c37-09172a7bc7ce)

![img](https://github.com/user-attachments/assets/b34a1ffe-e52b-4379-96c3-f8a2a0785ed6)

![img](https://github.com/user-attachments/assets/38abd1d9-3485-493f-9384-6828050f7602)

![img](https://github.com/user-attachments/assets/fa9a9fe1-559b-4059-90a7-2fe51251b94b)


## Hasil

![img](https://github.com/user-attachments/assets/dac00c61-d8e6-44cf-a815-a069d4a21f15)

![img](https://github.com/user-attachments/assets/b51f7a42-c166-4c6b-9812-b5b0b55501d8)

## Pertanyaan
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan
Double Linked List!
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi
masing-masing atribut tersebut pada proses traversal dan manipulasi node!
3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut
terhadap kondisi awal linked list!
4. Perhatikan potongan kode berikut:
   <img width="251" height="69" alt="image" src="https://github.com/user-attachments/assets/4101bfe7-9b9b-4856-a1bc-eb33fadc87de" />
5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika
tidak terdapat data pada linked list!
6. Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail
menuju head!

## Jawaban
1. - Single Linked List : hanya memiliki satu pointer yaitu next yang menunjuk ke node berikutnya, Traversal hanya bisa dilakukan satu arah (head -> tail), Untuk mengakses node sebelumnya harus memulai ulang dari head.
   - Double Linked List : Memiliki dua pointer yaitu next (ke node berikutnya) dan prev (ke node sebelumnya), Traserval bisa dilakukan dua arah (head -> tail maupun tail -> head), Lebih mudah melakukan operasi penghapusan dan penyisipan karena bisa mengakses node sebelum dan sesudahnya langsung.
2. - Next -> menyimpan referensi/alamat ke node berikutnya. Digunakan saat traversal maju (dari head ke tail).
   - Prev -> menyimpan referensi/alamat ke node sebelumnya. Digunakan saat traversal mundur (dari tail ke head).
3. Untuk menginisialisasi kondisi awal linked list dalam keadaan kosong.
4. Ketika linked list kosong dan ditambahkan node pertama, node tersebut sekaligus menjadi node pertama sekaligus terakhir.
5. 

   ![img](https://github.com/user-attachments/assets/2c7f78a3-dc1c-4a0b-9948-4eb5c6eb9254)

6.

  ![img](https://github.com/user-attachments/assets/54ba8898-1a6f-4fcd-aedb-8bc387b286d9)

   
## Percobaan 2
## Kode Program

![img](https://github.com/user-attachments/assets/5200b581-ff4a-44d9-a497-15e40d62996a)


## Pertanyaan
q. Perhatikan potongan kode berikut pada method removeFirst():
head = head.next;
head.prev = null;
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data 
yang berhasil dihapus!

## Jawaban
1. - head = head.next -> memindahkan pointer head dari node pertama (yang akan dihapus) ke node kedua. Node kedua sekarang menjadi node pertama baru. Node lama (pertama) tidak lagi direferensikan oleh siapaun sehingga akan dibersihkan oleh Garbage Collector.
   - head.prev = null -> setelah head berpindah ke node kedua, node tersebut masih memiliki pointer prev yang menunjuk ke node lama (yang sudah dihapus). Statement ini memutus koneksi tersebut dengan menetapkan prev=null, sehingga node baru pertama benar-benar tidak lagi terhubung ke node yang sudah dihapus. Ini penting agar linked list tetap konsisten.
2. 

![img](https://github.com/user-attachments/assets/f67e4a3e-1225-4b4b-bce6-8a5476f779f3)

## Tugas Praktikum
## Kode Program

![img](https://github.com/user-attachments/assets/4bb922d5-f670-4b25-ab00-8988aed45a94)

![img](https://github.com/user-attachments/assets/e840ba4f-90ce-44b1-a1b2-376a2f022c82)

![img](https://github.com/user-attachments/assets/6bd8bbe0-472c-4687-ad2d-6d8a377dfce0)

![img](https://github.com/user-attachments/assets/abf3ab13-7f0a-4f91-b86c-5703ccbf877d)

![img](https://github.com/user-attachments/assets/7a3ed505-0c85-40ab-a868-d1bcd29c73f2)

![img](https://github.com/user-attachments/assets/90e3ab52-bda4-4c4d-815a-b9bd478802d1)

## Hasil Run

![img](https://github.com/user-attachments/assets/ddbb9278-265c-413b-8537-4c7a6dd97557)


