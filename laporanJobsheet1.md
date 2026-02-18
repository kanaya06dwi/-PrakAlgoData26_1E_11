#                                    JOBSHEET1
## 2.1 Pemilihan

1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai tugas, 20% dari
 nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan mempunyai batas nilai 0-100.
 Ketika pengguna memasukkan di luar rentang tersebut maka akan keluar output "nilai tidak valid". Ketika
 nilai akhir sudah didapatkan selanjutnya lakukan konversi nilai dengan ketentuan sebagai berikut:

 <img width="651" height="319" alt="image" src="https://github.com/user-attachments/assets/0d2f0acb-71eb-44ce-83a2-1e908154d5cf" />
 
Jika Nilai Huruf yang didapatkan adalah A,B+,B,C+,C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.
- Input dari program berupa komponen nilai tugas, kuis, UTS, UAS
- Output dari program "nilai tidak valid" jila nilai yang dimasukkan diluar ketentuan
- Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/TIDAK LULUS
# KODE PROGRAM :

<img width="1196" height="648" alt="image" src="https://github.com/user-attachments/assets/ed6dd952-947c-4dca-a32e-1f7890601fb8" />

# HASIL RUN

<img width="322" height="190" alt="image" src="https://github.com/user-attachments/assets/fe35807a-5b93-4d37-8f5f-445467f6120a" />

## 2.2 Perulangan
Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n, dengan n = 2 -digit terakhir NIM anda. Berikut adalah ketentuan untuk mencetak deretnya
a. Bilangan kelipatan 3 dicetak dengan simbol #
b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
c. Bilangan ganjil dicetak dengan simbol *
d. Bilangan 10 dan 15 tidak dicetak
* bila n<10 maka tambahkan 10 (n+=10)
  Contoh 1 : Input NIM : 2541720102 maka n=12
  Output: * 2 # 4 * # * 8 # * #
  Contoh 2 : Input NIM: 2541720120 maka n=20
  Output: * 2 # 4 * # *  8 # *  # * 14 16 * # * 20

  # KODE PROGRAM

  <img width="993" height="631" alt="image" src="https://github.com/user-attachments/assets/90e29065-5775-4843-9c45-e0ffb3e7b008" />

  # HASIL RUN

  <img width="466" height="69" alt="image" src="https://github.com/user-attachments/assets/d3e0bbe9-70c4-4c45-89e5-cf0085565636" />

  ## 2.3 Array
  1. Buatlah program untuk menghitung IP Semester dari mata kuliah yang Anda tempuh semester lalu. Formula untuk menghitung IP semester sebagai berikut:
     
<img width="435" height="68" alt="image" src="https://github.com/user-attachments/assets/23ecec56-44ec-43de-b5a6-406a77a362e6" />

Nilai setara didapatkan dari tabel konversi berikut ini:

<img width="434" height="213" alt="image" src="https://github.com/user-attachments/assets/3757d263-2373-4f06-959a-2e1bb879d25d" />

Input dari program berupa nama mata kuliah, bobot SKS, serta nilai huruf dari mata  kuliah tersebut.

# KODE PROGRAM

<img width="1003" height="626" alt="image" src="https://github.com/user-attachments/assets/19c30bc5-5237-4870-ba28-b6c2108bae51" />

# HASIL RUN

<img width="597" height="393" alt="image" src="https://github.com/user-attachments/assets/8e3556c3-e1fb-4d07-b386-fa35d3b1341c" />

## 2.4 Fungsi
1. RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga-bunga yang dijual selalu dicatat dengan rincian seperti berikut ini:
Baris = Cabang Toko, Kolom = Stock bunga pada hari x

<img width="431" height="91" alt="image" src="https://github.com/user-attachments/assets/834a5c29-f7f4-4ec5-8755-eb46e16f05f2" />

Rincian Harga Aglonema = 75.000, Keladi = 50.000, Alocasia = 60.000, Mawar = 10.000.
1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual.
2. Tampilkan status dari setiap cabang dengan ketentuan sebagai berikut ini :
   a. Jika pendapatan cabang > Rp 1.500.000, maka cabang tersebut mendapat status "Sangat Baik"
   b. Jika pendapatan <Rp 1.500.000, status "Perlu Evaluasi".

# KODE PROGRAM

<img width="947" height="631" alt="image" src="https://github.com/user-attachments/assets/cdd0a251-1ac9-4c49-a34e-b187a8ae832a" />

# HASIL RUN

<img width="627" height="609" alt="image" src="https://github.com/user-attachments/assets/0d53ce87-d47e-409b-9864-a87ffc826164" />

## Tugas
1. Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. Ilustrasi tampilan array tersebut adalah sebagai berikut:

   <img width="392" height="201" alt="image" src="https://github.com/user-attachments/assets/58251d4f-b267-4d3c-a023-9cc9aef119f2" />

Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan nama kota dari kode plat nomor tersebut.

# KODE PROGRAM

<img width="1166" height="628" alt="image" src="https://github.com/user-attachments/assets/2e97ef75-8e81-4ae8-a272-f00ff62c11ac" />

# HASIL RUN

<img width="373" height="86" alt="image" src="https://github.com/user-attachments/assets/d591e143-4098-4865-aada-73f3a3b92b87" />

2. Sebuah program  digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa. Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan
   - Baris menyatakan jadwal ke-i
   - Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, Jam Kuliah. Contoh :
     jadwal[0][0] = "Pemograman Dasar"
     jadwal[0][1] = "Lab Komputasi 1"
     jadwal[0][2] = "Senin"
     jadwal[0][3] = "08.00 - 10.00"
   - Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna.
   Buatkan fungsi untuk
a. Menginput data jadwal kuliah ke dalam array 2 dimensi
b. Menampilkan seluruh jadwal kuliah dalam bentuk tabel
c. Menampilkan jadwal kuliah berdasarkan hari tertentu
d. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu.

# KODE PROGRAM

<img width="957" height="664" alt="image" src="https://github.com/user-attachments/assets/1af249c7-fd80-4288-b226-6002a35a6256" />

# HASIL RUN

<img width="527" height="587" alt="image" src="https://github.com/user-attachments/assets/b0fa8af1-06e2-4143-a3f7-97959bcd9039" />














  


   
