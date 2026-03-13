# Jobsheet P5
# 5.2.1 Latihan
## KODE PROGRAM

![img](https://github.com/user-attachments/assets/9bb68160-6059-4b29-bb8a-8e9313fb42d6)

## OUTPUT KODE PROGRAM

![img](https://github.com/user-attachments/assets/6ae0ba3d-b3ca-4865-8d1f-fb6195b74c95)

# SOAL
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada
   pada penggunaan if dan else!
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1);!
4. Buat kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()  !

 # JAWABAN
 1. If untuk kondisi berhenti dari rekursi. Jika nilai n sudah 1 maka faktorial bernilai 1.
    Else untuk proses rekursif, memanggil method yang sama dengan nilai n-1.
 2. Ya, memungkinkan. Perulangan dapat diganti dengan while. Berikut contoh:
    
    ![img](https://github.com/user-attachments/assets/439c38f8-7b33-4df3-9b64-1d37f1a1d1fe)

3. - fakto *=i: digunakan pada Brute Force dengan perulangan, perkalian dilakukan berulang dalam loop
   - int fakto = n * faktorialDC(n-1); digunakan pada Divide and Conquer dengan rekursi, nilai n dikalikan dengan
     hasil pemanggilan fungsi faktorial sebelumnya.
4. - FaktorialBF menggunakan loop, menghitung secara iterasi dari 1 sampai n.
   - FaktorialDC menggunakan rekursi, menghitung dengan pemanggilan fungsi berulang


# 5.3.1 Latihan
## KODE PROGRAM
## Class Pangkat

![img](https://github.com/user-attachments/assets/460bcbc6-8956-4086-83a5-acb6763db491)

## Class Pangkat Main

![img](https://github.com/user-attachments/assets/16ffab79-e912-4005-b474-93bcc59bc8cd)

# OUTPUT KODE PROGRAM

![img](https://github.com/user-attachments/assets/05aafaa8-8253-4444-b4a7-b47a6738e264)

# SOAL
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC() !
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3. Pada method pangkatBF() terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa,padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
4. Tarik tentang cara kerja method pangkatBF () dan pangkatDC () !

 # JAWABAN
 1. - PangkatBF() = menghitung nilai pangkat menggunakan perulangan (loop). Nilai akan dikalikan berulang kali sampai jumlah pangkat terpenuhi.
    - PangkatDC() = menghitung pangkat menggunakan rekursi, yaitu memanggil method yang sama secara berulang dengan pangkat yang lebih kecil.
 2. Ya, tahap combine sudah ada.
    
 ![img](https://github.com/user-attachments/assets/7cab4eec-31dc-44d9-9936-87ce78e5b61f)

 3. Menurut saya method tersebut tetap relevan memiliki parameter, karena parameter memudahkan kita untuk mengirim nilai yang berbeda setiap kali method dipangil. Namun method tersebut juga bisa dibuat tanpa parameter, jika menggunakan atribut yang sudah ada di dalam class.
    Contoh method pangkatBF() tanpa parameter

    ![img](https://github.com/user-attachments/assets/974b0e6a-2fbf-4511-aaf8-317dd787bb75)

4. Kedua method memiliki tujuan yang sama yaitu menghitung pangkat, tetapi menggunakan pendekatan algoritma yang berbeda.

# 5.4.1 Latihan
## KODE PROGRAM
Kode class sum

![img](https://github.com/user-attachments/assets/74ad581f-ad39-4f95-869a-001e98a3413a)

Kode class MainSum

![img](https://github.com/user-attachments/assets/7dd274a6-0a81-4d4f-81cb-f7ff4227261a)

## HASIL OUTPUT

![img](https://github.com/user-attachments/assets/3bab0c37-1dc6-484f-a94a-3b8f97f6a11c)

# SOAL
1. Kenapa dibutuhkan variable mid pada method TotalDC() ?
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC() ?
   double lsum = totalDC(arr, l, mid);
   double rsum = totalDC(arr, mid+1, r);
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti dibawah ini?
   return lsum+rsum;
4. Apakah base case dari totalDC()?
5. Tarik kesimpulan tentang cara kerja totalDC()

# JAWABAN
1. Digunakan untuk membagi array menjadi dua bagian. Dengan adanya mid, data keuntungan dapat dipisahkan menjadi bagian kiri dan bagian kanan.
2. Untuk menghitung total keuntungan pada dua bagian array yaitu:
  - lsum = jumlah keuntungan bagian kiri
  - rsum = jumlah keuntungan bagian kanan
3. Karena untuk menggabungkan hasil perhitungan dari bagian kiri dan kanan menjadi total keuntungan keseluruhan.
4. Artinya array hanya memiliki satu elemen, sehingga langsung dikembalikan sebagai hasil. Base case ini untuk menghentikan proses rekursif.
5. Method totalDC() bekerja dengan cara membagi array menjadi dua bagian, menghitung jumlah masing-masing bagian secara rekursif, lalu menjumlahkan hasilnya untuk mendapatkan total keseluruhan.

# 4.5 Latihan
# Kode Program Mahasiswa

![img](https://github.com/user-attachments/assets/56c048a2-d452-412a-9628-9395a2d37e7e)

# Kode Program Nilai

![img](https://github.com/user-attachments/assets/39e126d5-59c3-4cce-b7ea-afc364cb6c6d)

# Kode Program Main Nilai

![img](https://github.com/user-attachments/assets/2d8ac565-6df0-415e-b18b-e7d48b0f031e)

# output

![img](https://github.com/user-attachments/assets/4908e92a-c6fa-4474-94c5-abc1ec36ca05)
