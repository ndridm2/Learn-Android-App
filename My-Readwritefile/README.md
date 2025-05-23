# 📌 MyReadWriteFile

## 🎯 Project Overview
MyReadWriteFile adalah aplikasi sederhana berbasis Kotlin yang memungkinkan pengguna membaca dan menulis data ke dalam file lokal pada perangkat Android. Proyek ini bertujuan untuk memahami konsep penyimpanan file di Android dengan menggunakan Internal Storage.

## 📂 Fitur Utama
✅ Membuat dan menyimpan file teks di penyimpanan internal 📄

✅ Membaca isi file yang telah disimpan 👀

✅ Menghapus file jika tidak diperlukan ❌

## 🛠 Struktur Proyek
1️⃣ Membuat project baru dengan nama MyReadWriteFile 📌

2️⃣ Membuat FileModel sebagai model data untuk menyimpan informasi pengguna 💾

3️⃣ Membuat FileHelper untuk menangani operasi baca, tulis, dan hapus file 🔧

4️⃣ Mengimplementasikan FileHelper ke dalam Activity, sehingga pengguna dapat berinteraksi dengan file 🎯

## 🔍 Detail Implementasi
📌 1. FileModel (Model Data)

FileModel berfungsi sebagai tempat penyimpanan sementara data yang akan dibaca atau ditulis ke dalam file.

📌 2. FileHelper (Helper Class)
Kelas ini berisi metode untuk:

✅ Menulis data ke dalam file internal

✅ Membaca data dari file yang tersimpan

✅ Menghapus file jika tidak dibutuhkan

📌 3. Mengimplementasikan FileHelper ke dalam Activity
FileHelper digunakan dalam Activity agar pengguna dapat menulis, membaca, dan menghapus file melalui antarmuka aplikasi.

## 🚀 Teknologi yang Digunakan
Kotlin (Bahasa Pemrograman)
Android SDK (Internal Storage API)
MVVM (Model-View-ViewModel) (Opsional)

## 📌 Cara Menjalankan Proyek
1️⃣ Clone repository ini:
sh
Copy
Edit
git clone https://github.com/username/MyReadWriteFile.git

2️⃣ Buka project di Android Studio

3️⃣ Jalankan aplikasi menggunakan emulator atau perangkat fisik

## 🎯 Kesimpulan
Proyek MyReadWriteFile ini mengajarkan bagaimana cara menyimpan data menggunakan Internal Storage di Android menggunakan Kotlin. Implementasi ini dapat diperluas untuk menyimpan data lebih kompleks, seperti format JSON atau database lokal.

