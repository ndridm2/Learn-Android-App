# MyBroadcastReceiver

Dicoding - Android Fundamental

MyBroadcastReceiver adalah aplikasi Android yang mengimplementasikan Broadcast Receiver untuk menangani event yang dikirim oleh sistem dan aplikasi lain. Dalam proyek ini, terdapat dua jenis implementasi utama:

Menerima Broadcast dari Sistem

Aplikasi dapat mendeteksi SMS masuk menggunakan SmsReceiver.
Untuk menerima SMS, aplikasi memerlukan permission khusus.
Komunikasi Antar Aplikasi dengan Broadcast Receiver

Aplikasi melakukan pengunduhan berkas menggunakan background service secara asynchronous.
Setelah proses pengunduhan selesai, service akan mengirimkan broadcast yang akan diterima oleh sebuah Activity.
## 🔨 Fitur Utama
✅ Menerima broadcast ketika ada SMS masuk.

✅ Menjalankan background service untuk mengunduh berkas.

✅ Menggunakan broadcast receiver untuk komunikasi antar aplikasi.

✅ Menampilkan data pengguna menggunakan FileModel.

✅ Mengatur tampilan UI dengan layout XML.

## 🚀 Teknologi yang Digunakan
Kotlin

Broadcast Receiver

Background Service

Android Manifest Permission

Asynchronous Processing

# Application

<img width="344" alt="apps" src="https://github.com/user-attachments/assets/190baa95-dede-489b-8cfc-8f2d9058e9bb">

