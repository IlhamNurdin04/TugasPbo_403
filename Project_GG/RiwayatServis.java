public class RiwayatServis {
    private Kendaraan kendaraan; // Polymorphism
    private Mekanik mekanik;
    private Layanan layanan;
    private Pelanggan pelanggan;

    // Constructor 
    public RiwayatServis(Pelanggan pelanggan, Kendaraan kendaraan, Mekanik mekanik, Layanan layanan) {
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.mekanik = mekanik;
        this.layanan = layanan;
    }

    // Setter dan Getter
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Mekanik getMekanik() {
        return mekanik;
    }

    public void setMekanik(Mekanik mekanik) {
        this.mekanik = mekanik;
    }

    public Layanan getLayanan() {
        return layanan;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }

    // Method untuk menampilkan detail servis
    public void tampilkanDetailServis() {
        System.out.println("+---------------+");
        System.out.println("| Detail Servis |");
        kendaraan.tampilkanDetail(); // Polymorphism: dapat berupa Mobil atau Motor
        System.out.println("Pelanggan     : " + pelanggan.getNama());
        System.out.println("NoHp          : " + pelanggan.getKontak());
        System.out.println("Mekanik       : " + mekanik.getNama());
        layanan.tampilkanLayanan(); // Menampilkan layanan yang diberikan
    }
}
