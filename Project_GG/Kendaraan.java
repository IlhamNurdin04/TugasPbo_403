public class Kendaraan {
    // Encapsulation
    private String merk;
    private String nomorPlat;
    private String warna;
    private int tahunProduksi;

    // Constructor 
    public Kendaraan(String merk, String nomorPlat, String warna, int tahunProduksi) {
        this.merk = merk;
        this.nomorPlat = nomorPlat;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Setter dan Getter - Encapsulation
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Method untuk menampilkan detail kendaraan
    public void tampilkanDetail() {
        System.out.println("Merk          : " + merk);
        System.out.println("Nomor Plat    : " + nomorPlat);
        System.out.println("Warna         : " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}

//KELAS INDUK