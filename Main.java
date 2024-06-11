
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("12345678", "Budi Santoso");
        KHS khs = new KHS(mahasiswa);

        MataKuliah mk1 = new MataKuliah("CS101", "Pemrograman Lanjut", 90);
        MataKuliah mk2 = new MataKuliah("CS102", "Struktur Data", 75);
        MataKuliah mk3 = new MataKuliah("CS103", "Basis Data", 60);

        khs.tambahMataKuliah(mk1);
        khs.tambahMataKuliah(mk2);
        khs.tambahMataKuliah(mk3);

        khs.cetakKHS();
    }
}
