public class Mekanik {
    // Encapsulation
    private String nama;
    private String spesialisasi;

    // Constructor 
    public Mekanik(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    // Setter dan Getter 
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    // Method untuk menampilkan detail mekanik
    public void tampilkanDetailMekanik() {
        System.out.println("Nama Mekanik: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
    }
}
