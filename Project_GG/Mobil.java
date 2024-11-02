public class Mobil extends Kendaraan {
    // Constructor menginduk ke superclass (Kendaraan)
    public Mobil(String merk, String nomorPlat, String warna, int tahunProduksi) {
        super(merk, nomorPlat, warna, tahunProduksi); // Inheritance
    }

    // Overriding method tampilkanDetail()
    @Override
    public void tampilkanDetail() {
        System.out.println("| Servis Mobil  |"); 
        System.out.println("+---------------+");  
        super.tampilkanDetail(); // Memanggil method dari superclass (Kendaraan)
    }
}
// kelas anak menginduk ke kendaraan