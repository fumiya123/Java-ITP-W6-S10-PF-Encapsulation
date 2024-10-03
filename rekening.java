class Rekening {
    // definisi private data fields, supaya tidak bisa diakses langsung dari luar kelas
    private String nama;
    private String namaIbu;

    // Constructor untuk menginisialisasi data
    public Rekening(String nama, String namaIbu) {
        this.nama = nama;
        this.namaIbu = namaIbu;
    }

    // Getter method untuk nama
    public String getNama() {
        return nama;
    }

    // Getter method untuk nama ibu
    public String getNamaIbu() {
        return namaIbu;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Rekening
        Rekening rek = new Rekening("Kartono", "Siti");

        // Mengakses nama nasabah dan nama ibu dengan getter
        System.out.println("Nama Nasabah: " + rek.getNama()); // Output: Nama Nasabah: Kartono
        System.out.println("Nama Ibu Kandung: " + rek.getNamaIbu()); // Output: Nama Ibu Kandung: Siti
    }
}
