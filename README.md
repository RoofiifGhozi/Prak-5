# Tugas Praktikum Compose

Aplikasi Android sederhana menggunakan Kotlin dan Jetpack Compose. Halaman utama menampilkan judul, gambar, dan hasil perhitungan.

## Fitur

- Mengambil gambar acak dari `https://picsum.photos/800/600` menggunakan Coil Compose.
- Menampilkan ikon `outline_10mp_24` sebagai placeholder saat gambar dimuat dan sebagai fallback jika gambar gagal diambil.
- Menghitung `100 / 5` dan menampilkan hasilnya, yaitu `20`.

## Teknologi

- Kotlin, Jetpack Compose, dan Material 3
- Coil Compose 2.7.0
- Minimum SDK 26, compile SDK 36, target SDK 36

## Struktur penting

- `app/src/main/java/com/example/prak_5_app/ActivityUtama.kt`: activity utama dan tampilan aplikasi.
- `app/src/main/res/drawable/outline_10mp_24.xml`: ikon yang dipakai untuk placeholder gambar.
- `app/src/main/AndroidManifest.xml`: deklarasi activity utama dan izin akses internet.
- `gradle/libs.versions.toml`: daftar versi library dan plugin.

## Menjalankan aplikasi

1. Buka folder proyek ini di Android Studio.
2. Tunggu Gradle Sync selesai.
3. Pilih emulator atau perangkat Android.
4. Pilih konfigurasi `app), lalu klik tombol Run (segitiga).

Aplikasi memerlukan koneksi internet untuk memuat gambar. Jika gambar tidak bisa diambil, ikon lokal akan ditampilkan.
