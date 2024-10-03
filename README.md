# Java-ITP-W6-S10-PF-Encapsulation

Kelas Introduction to Programming / Week 6 / Session 10

### Penjelasan:
- Dikelas `Rekening` kita definisikan variabel `nama` dan `namaIbu` dengan di tambah **access modifier** `private`, supaya variabel tersebut tidak bisa langsung dari luar kelas.
- Definisikan Constructor untuk menginisialisasi data `nama` dan `namaIbu`.
- Untuk mengakses variabel `nama` dan `namaIbu` kita perlu method getter.
  - Kita dapat mendefinisikannya dengan cara berikut `public String getNama()` dan jangan lupa kembalikan isi varabel `nama` dengan keyword return seperti ini `return nama;`.
  - Untuk `namaIbu` sama kita dapat mendefinisikannya dengan cara berikut `public String getNamaIbu()` dan jangan lupa kembalikan isi varabel `namaIbu` dengan keyword return seperti ini `return namaIbu;`.
- Lanjut dalam kelas Main kita object Rekening `Rekening rek = new Rekening("Kartono", "Siti");` untuk mengakes variabel `nama` dan `namaIbu` kita dapat mengguakan method getter yang sudah didefinisikan di atas seperti berikut:
  - `rek.getNama()` kode tersebut akan mengembalikan `nama` yaitu `Kartono`.
  - `rek.getNamaIbu()` kode tersebut akan mengembalikan `namaIbu` yaitu `Siti`.
- Terakhir kita print untuk menampilkan hasil ke layar.

Sekian.

Habib Azizul Haq  
(2702488253)
