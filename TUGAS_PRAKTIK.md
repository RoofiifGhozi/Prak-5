# Tugas Praktikum Compose

- SDK: `minSdk 26`, `compileSdk 36`, `targetSdk 36`.
- `ActivityUtama` menjadi halaman awal; gambar internet memakai Coil `2.7.0` dengan clip art sebagai fallback.
- Nilai `angka = 5` menghasilkan `100 / 5 = 20`.

## Menjalankan

Buka folder proyek ini di Android Studio, tunggu Gradle Sync selesai, pilih emulator, lalu klik **Run**.

## Catatan error

`angka = 0` menyebabkan pembagian dengan nol; ubah nilainya menjadi `5`. Error AAR metadata yang meminta SDK 37 diatasi dengan menurunkan versi library agar cocok dengan `compileSdk 36`.
