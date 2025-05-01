public class buku {
    String judul;
    String penulis;

    // Constructor
    public buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Method untuk menampilkan info buku
    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }

    // Program utama untuk uji coba
    public static void main(String[] args) {
        buku buku1 = new buku("Laskar Pelangi", "Andrea Hirata");
        buku buku2 = new buku("Bumi", "Tere Liye");

        buku1.info();
        System.out.println("----------------------");
        buku2.info();
    }
}
