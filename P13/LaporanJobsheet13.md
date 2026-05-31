## Jobsheet Tree
## Percobaan 1
## Kode Program

![img](https://github.com/user-attachments/assets/db674b92-7858-4999-9c9b-5ad31056794a)

![img](https://github.com/user-attachments/assets/b9073b5b-a1dd-4c31-b212-b6a039e3fa01)

![img](https://github.com/user-attachments/assets/443b3629-c7b6-4a08-9d97-8ceb87e97100)

![img](https://github.com/user-attachments/assets/4f21d3ea-5d28-420e-a52a-923681b8819f)

![img](https://github.com/user-attachments/assets/ad30053c-8aa1-478b-95ae-f96ecf2728c3)

![img](https://github.com/user-attachments/assets/dc593f23-c706-4e9f-8408-194bef1414db)

![img](https://github.com/user-attachments/assets/d8d0d847-ee91-4815-b2e9-b0d5b24d7afd)

## Hasil Kode Program

![img[(https://github.com/user-attachments/assets/267c3d24-424f-45b3-b6eb-ec852fb0bbed)

## Pertanyaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
2. Untuk apakah di class node, kegunaaan dari atribut left dan right?
3. a. Untuk apakah keguanaan dari atribut root di dalam class BinaryTree?
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
5. Perhatikan methode add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detail untuk
   apa baris program tersebut?

   ![img](https://github.com/user-attachments/assets/fbff59f3-83f8-4ba8-b2de-47ad228afe29)
  
6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method
   getSuccessor() membantu dalam proses ini?

## Jawaban
1. Karena BST memiliki aturan terstruktur, node dengan nilai lebih kecil selalu berada di subtree kiri, dan
   yang lebih besar di subtree kanan. Sehingga saat mencari, program cukup membandingkan nilai dan langsung memilih
   arah (kiri atau kanan), tanpa perlu mengecek semua node.
2. left -> menyimpan referensi ke node anak kiri
   right -> menyimpan referensi ke node anak kanan
3. a. pintu masuk utama ke seluruh tree. Semua operasi (addm find, delete, traverse) dimulai dari root.
   b. Nilai nya adalah null, karena tree masih kosong (diset di konstruktor: root = null.
4. Karena isEmpty() bernilai true (root == null), maka node baru langsung dijadikan root.
5. - parent = current → menyimpan posisi node saat ini sebagai "orang tua", karena kita perlu referensi parent untuk menempelkan node baru nantinya.
   - if (mahasiswa.ipk < current.mahasiswa.ipk) → membandingkan IPK baru dengan IPK node saat ini.
   - Jika lebih kecil: gerak ke kiri (current = current.left). Jika posisi kiri kosong (null), tempelkan node baru di sana (parent.left = newNode) lalu selesai.
   - Jika lebih besar atau sama: gerak ke kanan (current = current.right). Jika posisi kanan kosong, tempelkan node baru di sana (parent.right = newNode) lalu selesai.
6. Cari successor (node terkecil di subtree kanan) via getSuccessor(). Successor dicabut dari posisinya, lalu
   menggantikan node yang dihapus. getSuccessor() berperan menemukan pengganti yang tepat agar urutan BST tetap valid.
   
