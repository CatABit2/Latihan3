// Membuat package latihan3
package latihan3;

public class Rumus {
    // Nama: Aldi
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

    public static void main(String[] args) {
        // Membuat objek Rumus dan menginisialisasi nilai atribut dengan nilai default (0)
        Rumus rumus = new Rumus();

        // Menghitung luas persegi dan menampilkan hasil
        rumus.hitungLuasPersegi();
        rumus.tampilkanData();

        // Menghitung luas persegi panjang dan menampilkan hasil
        rumus.hitungLuasPersegiPanjang();
        rumus.tampilkanData();
    }
}
