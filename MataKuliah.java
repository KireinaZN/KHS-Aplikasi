
public class MataKuliah {
    private String kode;
    private String namaMk;
    private double nilaiAngka;

    public MataKuliah(String kode, String namaMk, double nilaiAngka) {
        this.kode = kode;
        this.namaMk = namaMk;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public double getNilaiAngka() {
        return nilaiAngka;
    }

    public String getNilaiHuruf() {
        if (nilaiAngka >= 85)
            return "A";
        else if (nilaiAngka >= 70)
            return "B";
        else if (nilaiAngka >= 55)
            return "C";
        else if (nilaiAngka >= 40)
            return "D";
        else
            return "E";
    }
}
