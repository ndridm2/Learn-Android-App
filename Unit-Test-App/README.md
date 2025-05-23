# 📌 UnitTestApp

## 📋 Overview
UnitTestApp adalah proyek berbasis Kotlin yang berfokus pada pengujian aplikasi Android menggunakan Unit Test & UI Test. Proyek ini menerapkan MVVM (Model-View-ViewModel) dengan Mockito & Espresso untuk memastikan keakuratan perhitungan dan stabilitas UI aplikasi.

## 🚀 Fitur Utama
✅ Menampilkan tampilan UI yang telah dikonfigurasi dalam XML Layout 🖼️

✅ Menghitung volume kubus (Cuboid) berdasarkan panjang, lebar, dan tinggi 📏

✅ Menggunakan ViewModel untuk memisahkan logika bisnis dari UI ⚡

✅ Melakukan pengujian menggunakan Mockito & Espresso 🔍

## 🏗 Struktur Proyek
1️⃣ Membuat project baru dengan nama UnitTestApp

2️⃣ Mengatur tampilan UI di berkas XML Layout

3️⃣ Menambahkan kelas Cuboid untuk menyimpan data volume kubus

4️⃣ Menambahkan ViewModel untuk menangani logika perhitungan dan menyimpan data sementara

5️⃣ Mengimplementasikan ViewModel ke dalam Activity agar data tetap terjaga meskipun konfigurasi berubah

6️⃣ Menjalankan aplikasi dan memastikan fungsi berjalan dengan baik

7️⃣ Menambahkan library Mockito dan Espresso untuk pengujian otomatis

8️⃣ Membuat kelas MainViewModelTest untuk menguji fungsi aplikasi

9️⃣ Mengimplementasikan skenario pengujian dalam Unit Test & UI Test

## 🛠 Teknologi yang Digunakan
Kotlin (Bahasa Pemrograman)
MVVM (Model-View-ViewModel)
Android Jetpack ViewModel
JUnit (Unit Testing)
Mockito (Mocking dependencies)
Espresso (UI Testing)

## 🔬 Pengujian dalam Proyek
✅ Unit Test dengan JUnit & Mockito
Memastikan metode perhitungan dalam ViewModel berjalan dengan benar
Melakukan Mocking pada data input dan output

✅ UI Test dengan Espresso
Memastikan UI bekerja sesuai skenario yang telah ditentukan
Melakukan input & validasi hasil pada UI

## 💡 Cara Menjalankan Proyek
1️⃣ Clone repository ini:
sh
Copy
Edit
git clone https://github.com/username/UnitTestApp.git

2️⃣ Buka project di Android Studio

3️⃣ Jalankan aplikasi di Emulator atau Perangkat Fisik

4️⃣ Untuk menjalankan pengujian:
Unit Test:
sh
Copy
Edit
./gradlew testDebugUnitTest

UI Test:
sh
Copy
Edit
./gradlew connectedAndroidTest

## 🎯 Kesimpulan
Proyek UnitTestApp dirancang untuk memahami bagaimana Unit Testing dan UI Testing dapat digunakan untuk meningkatkan kualitas aplikasi Android. Dengan Mockito & Espresso, pengujian dapat dilakukan secara otomatis dan efisien.
