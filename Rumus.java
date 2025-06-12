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

    // Konstruktor untuk menginisialisasi nilai atribut
    public Rumus(double sisi, double panjang, double lebar) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
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

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    // Method untuk menampilkan nilai atribut
    public void tampilkanData() {
        System.out.println("Sisi: " + sisi);
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Hasil: " + hasil);
    }

    public static void main(String[] args) {
        // Membuat objek Rumus dan menginisialisasi nilai atribut
        Rumus rumus = new Rumus(5, 10, 4); // Gantilah nilai sesuai kebutuhan

        // Menampilkan data
        rumus.tampilkanData();
    }
}
