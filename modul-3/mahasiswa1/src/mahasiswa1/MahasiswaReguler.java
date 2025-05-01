package mahasiswa1;

public class MahasiswaReguler extends mahasiswa1 {
    String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    public void infoReguler() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("-----------------------");
    }

    // Program utama untuk membuat objek dan menampilkan data
    public static void main(String[] args) {
        MahasiswaReguler mhs1 = new MahasiswaReguler("Siti Rosiati Octavia Anwaroh", "070", "SI-3A");
        MahasiswaReguler mhs2 = new MahasiswaReguler("Anang Ma'ruf", "071", "SI-3B");
        MahasiswaReguler mhs3 = new MahasiswaReguler("Caca Yaya", "072", "SI-3C");

        mhs1.infoReguler();
        mhs2.infoReguler();
        mhs3.infoReguler();
    }
}