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
3. Pada method pangkatBF() terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa,
   padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut anda method tersebut
   tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa,
   seperti apa method pangkatBF() yang tanpa parameter?
4. Tarik tentang cara kerja method pangkatBF () dan pangkatDC () !

 # JAWABAN
 1. 
