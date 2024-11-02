public class Layanan {
    // Encapsulation
    private String namaLayanan;
    private double harga;

    // Constructor 
    public Layanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public Layanan(String namaLayanan, double harga) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
    }

    // Setter dan Getter - Encapsulation
    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan detail layanan
    public void tampilkanLayanan() {
        System.out.println("Layanan       : " + namaLayanan);
        System.out.println("Harga         : " + harga);
    }
}
