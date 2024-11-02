public class Motor extends Kendaraan {
    // Constructor menginduk ke superclass (Kendaraan)
    public Motor(String merk, String nomorPlat, String warna, int tahunProduksi) {
        super(merk, nomorPlat, warna, tahunProduksi); // Inheritance
    }

    // Overriding method tampilkanDetail()
    @Override
    public void tampilkanDetail() {
        System.out.println("| Servis Motor  |"); 
        System.out.println("+---------------+");  
        super.tampilkanDetail(); // Memanggil method dari superclass (Kendaraan)
    }
}
// kelas anak menginduk ke kendaraan