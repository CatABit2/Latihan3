// Membuat package latihan3
package latihan3;

// Kelas Rumus
public class Rumus {
    // Nama: M. Aldi Ripandi
    // NPM: 2210010610
    // Kelas: 4C-TI

    // Atribut bertipe bilangan
    private double sisi;
    private double panjang;
    private double lebar;
    private double hasil;

    // Konstruktor untuk memastikan nilai awal atribut sisi, panjang, lebar, dan hasil adalah nol
    public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }

    // Getter dan Setter untuk sisi, panjang, lebar, dan hasil
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Method accessor untuk mengembalikan nilai hasil
    public double getHasil() {
        return hasil;
    }

    // Method untuk menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
    }

    // Method untuk menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
    }

    // Method untuk menampilkan nilai atribut dan hasil
    public void tampilkanData() {
        System.out.println("Sisi: " + sisi);
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Hasil: " + hasil);
    }
}

// Kelas RumusBeraksi
  class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Rumus dengan nama objek sesuai nama panggilan
        Rumus aldi = new Rumus();

        // Set nilai untuk menghitung luas persegi (sisi = 4)
        aldi.setSisi(4);
        aldi.hitungLuasPersegi();
        System.out.println("Luas Persegi:");
        aldi.tampilkanData();  // Menampilkan hasil luas persegi

        // Set nilai untuk menghitung luas persegi panjang (panjang = 5, lebar = 3)
        aldi.setPanjang(5);
        aldi.setLebar(3);
        aldi.hitungLuasPersegiPanjang();
        System.out.println("\nLuas Persegi Panjang:");
        aldi.tampilkanData();  // Menampilkan hasil luas persegi panjang
    }
}
