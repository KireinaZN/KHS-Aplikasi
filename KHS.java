import java.util.ArrayList;
import java.util.List;

public class KHS {
    private Mahasiswa mahasiswa;
    private List<MataKuliah> mataKuliahs;

    public KHS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliahs = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        mataKuliahs.add(mk);
    }

    public void cetakKHS() {
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : mataKuliahs) {
            System.out.println(mk.getKode() + " - " + mk.getNamaMk() + " - " + mk.getNilaiHuruf());
        }
    }
}
