public class Pelanggan {
    // Encapsulation
    private String nama;
    private String kontak;
    private Kendaraan kendaraan; // Polymorphism: dapat menerima Mobil atau Motor

    // Constructor 
    public Pelanggan(String nama, String kontak, Kendaraan kendaraan) {
        this.nama = nama;
        this.kontak = kontak;
        this.kendaraan = kendaraan;
    }

    // Setter dan Getter - Encapsulation
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method untuk menampilkan detail pelanggan
    public void tampilkanDetailPelanggan() {
        System.out.println("Nama: " + nama);
        System.out.println("Kontak: " + kontak);
        System.out.println("Kendaraan:");
        kendaraan.tampilkanDetail(); // Polymorphism
    }
}
