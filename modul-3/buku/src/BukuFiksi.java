
// Class turunan BukuFiksi
public class BukuFiksi extends buku {
    String genre;

    // Constructor
    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    // Method untuk menampilkan info buku fiksi
    public void infoFiksi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Genre: " + genre);
    }

    // Program utama untuk uji coba
    public static void main(String[] args) {
        BukuFiksi buku1 = new BukuFiksi("Laskar Pelangi", "Andrea Hirata", "Drama");
        BukuFiksi buku2 = new BukuFiksi("Bumi", "Tere Liye", "Fantasi");

        buku1.infoFiksi();
        System.out.println("----------------------");
        buku2.infoFiksi();
    }
}