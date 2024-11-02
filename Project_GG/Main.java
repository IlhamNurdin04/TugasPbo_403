public class Main {
    public static void main(String[] args) {
        // Menggunakan constructor overloading
        Mobil mobil = new Mobil("Toyota", "A123BC", "Merah", 2020);
        Motor motor = new Motor("Honda", "B987ZY", "Hitam", 2018);

    
        Pelanggan pelanggan1 = new Pelanggan("Ilham", "08123456789", mobil);
        Pelanggan pelanggan2 = new Pelanggan("Fuad", "08198765432", motor);

        
        Mekanik mekanik1 = new Mekanik("Andi", "Spesialis Mesin");

        // Contoh layanan - Constructor overloading
        Layanan gantiOli = new Layanan("Ganti Oli", 200000);
        Layanan perbaikanMesin = new Layanan("Perbaikan Mesin", 500000);

        RiwayatServis riwayatMobil = new RiwayatServis(pelanggan1, mobil, mekanik1, gantiOli);
        RiwayatServis riwayatMotor = new RiwayatServis(pelanggan2, motor, mekanik1, perbaikanMesin);

        //  Polymorphism
        riwayatMobil.tampilkanDetailServis();
        riwayatMotor.tampilkanDetailServis();
    }
}
