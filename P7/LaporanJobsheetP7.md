## Jobsheet P7 Searching
## 6.2 Searching/Pencarian Menggunakan Algoritma Sequential Search
# Kode Program MahasiswaBerprestasi

![img](https://github.com/user-attachments/assets/c193940c-09fa-4752-9468-3b25a7003d98)

# Kode Program MahasiswaDemo

![img](https://github.com/user-attachments/assets/e087ab42-0da9-4364-9e9f-f8ef4f1297b5)

# Hasil Run

![img](https://github.com/user-attachments/assets/c732fb79-4a87-4fb9-a794-ac9d4e1f8e6c)

![img](https://github.com/user-attachments/assets/3ab6663a-90da-463c-a45a-b3d01f262539)

# PERTANYAAN
1. Jelaskan perbedaan method tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
2. Jelaskan fungsi break pada kode program di bawah ini!
  
![img](https://github.com/user-attachments/assets/d9bda724-1dbf-4309-b8df-818e357cbe47)

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas
   akan menampilkan data ke berapa? jelaskan.
5. Berkaitan dengan pertanyaan nomor 2 diatas, apa yang terjadi jika perintah break di hapus dari kode diatas?

 # JAWABAN
 1. tampilDataSearch untuk menampilkan isi data mahasiswa, sedangkan tampilPosisi untuk menampilkan
    letak data.
 2. Untuk menghentikan perulangan saat data ditemukan.
 3. Untuk menyimpan indeks data yang ditemukan (atau -1 jika tidak ada)
 4. Akan menampilkan data pertama yang ditemukan karena proses pencarian dilakukan dari indeks awal (0) &
    saat data cocok ditemukan, program langsung berhenti karena break.
 5. Program akan mencari sampai akhir dan bisa menampilkan posisi terakhir.

## 6.3.1 Binary Search
## Kode Program MahasiswaBerprestasi

![img](https://github.com/user-attachments/assets/df345398-65eb-4524-b456-a28f0c3073d4)

## Kode Program MahasiswaDemo

![img](https://github.com/user-attachments/assets/d10c7277-77d7-4208-9186-c1f94fdfe944)

## Hasil Run

![img](https://github.com/user-attachments/assets/4f972bd3-c996-48db-851e-fbce5481cc1d)

![img](https://github.com/user-attachments/assets/4a7dbeb4-581b-4ce4-b709-229085ac0330)

# PERTANYAAN
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
3. Apa fungsi left, right, dan mid?
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai
6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array.
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.

# JAWABAN

1. ![img](https://github.com/user-attachments/assets/b56062cd-7929-4d43-b4d1-f5c853a56c08)
2. ![img](https://github.com/user-attachments/assets/a4f1c260-7145-4202-a1a0-de14c54e5dc5)
3. left = batas kiri, right = batas kanan, mid = titik tengah.
4. Jika data tidak urut, binary search tidak bekerja dengan benar.
5. Jika urut descending, hasil tidak sesuai, harus balik logika perbandingan.
6. Data tidak ditemukan jika left > right.
   
7. # KODE PROGRAM
   
   ![img](https://github.com/user-attachments/assets/5d38c32d-3798-444b-9d6b-4cd1b8055be5)
   ![img](https://github.com/user-attachments/assets/21d37a86-c3f5-4817-be00-706d1fd34ac7)

   # HASIL
   ![img](https://github.com/user-attachments/assets/0111071d-94fe-46ed-8b04-dd7dc6e4b5a7)

