JOBSHEET 5 
SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)
# Praktikum 1 - Mengimplementasikan Sorting menggunakan object
## 5.2.1 Sorting

![img](https://github.com/user-attachments/assets/ee4c9f5f-2817-4b51-9899-92d2214de763)

## Sorting Main

![img](https://github.com/user-attachments/assets/87f60935-87ed-4874-9eec-d040e9cb2fad)

## Hasil Percobaan

![img](https://github.com/user-attachments/assets/06ae5392-a08d-400a-88cd-ebccfcf24d36)

# B. Sorting - Selection Sort

![img](https://github.com/user-attachments/assets/e342f884-6497-4712-8b55-1ff6770d7aa0)

#  Sorting Main

![img](https://github.com/user-attachments/assets/e9119e9c-cd45-41e0-a3f4-4cd7dcc8ccc4)

# Hasil Percobaan

![img](https://github.com/user-attachments/assets/ad0a33a7-e3cd-4d03-adbe-b7aeb7f726b7)

# C. Sorting - Insertion Sort

![img](https://github.com/user-attachments/assets/a569b928-c6bb-494a-8be8-734488926db0)

# Sorting Main

![img](https://github.com/user-attachments/assets/fbb89621-e918-4208-a657-4f80f609aea9)

# Hasil Percobaan

![img](https://github.com/user-attachments/assets/2da50f1a-0135-4112-b1ad-7f77d895b251)

## Pertanyaan 
1. Jelaskan fungsi kode program berikut
   
![img](https://github.com/user-attachments/assets/0bddd69f-1577-4f72-98a5-cec4ad974ba0)

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
3. Pada insertion sort, jelaskan maksud dari kondisi pada perulangan
   
![img](https://github.com/user-attachments/assets/117f781f-a81d-4f86-8114-f3f4288f3d6a)

4. Pada insertion sort, apakah tujuan dari perintah

![img](https://github.com/user-attachments/assets/ec42c61b-178f-43cb-8e88-4fec5c3b38a9)

## Jawaban
1. Untuk memindahkan posisi dua elemen array jika elemen sebelumnya lebih besar dari elemen sesudahnya, sehingga data bisa diurutkan dari kecil ke besar.
2. Untuk mencari indeks nilai terkecil pada array, lalu nanti akan ditukar dengan posisi saat ini.
3. Untuk menggeser elemen yang lebih dari temp ke kanan, agar posisi yang tepat untuk temp bisa ditemukan.
4. Untuk menempatkan nilai temp ke posisi yang benar setelah proses pergeseran elemen selesai.

# 5.3 Praktikum 2 - (Sorting Menggunakan Array of Object)
## KODE PROGRAM

![ing](https://github.com/user-attachments/assets/4dde6eda-351f-4ffe-a7ed-931a60ebd112)

![img](https://github.com/user-attachments/assets/490bf8ca-5d85-420b-be1d-9785f3d15e79)

![img](https://github.com/user-attachments/assets/971dad94-d587-40d4-8a13-0149eea44c4a)

## HASIL PROGRAM

![img](https://github.com/user-attachments/assets/9d4e89b4-be2f-44c5-ad97-f90233e506cf)

![img](https://github.com/user-attachments/assets/0209d235-c3d9-4e9f-85fd-9599b754bb01)

## 5.3.4 Pertanyaan
1. Perhatikan perulangan di dalam bubbleSort() dibawah ini:
  
![img](https://github.com/user-attachments/assets/d41d660a-1501-47c9-85d3-214e96908482)

a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1?
b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i?
c. Jika banyak data di dalam listMhs adalah 50, maka berapa kali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyboar) yang terdiri dari nim, nama, kelas dan ipk!

## Jawaban
1. a. karena bubble sort butuh n-1 literasi
   b. karena tiap iterasi, data terbesar sudah di akhir, jadi tidak perlu dicetak lagi
   c. Jika data 50, maka iterasi i = 49 kali. Tahap bubble sort = 49
2. Kode Program
  
![img](https://github.com/user-attachments/assets/8c65864e-cb32-4e68-933d-c83789c73ba8)

   Hasil Program
  
![img](https://github.com/user-attachments/assets/4b5961c2-2ec5-436c-b394-03476202debb)
