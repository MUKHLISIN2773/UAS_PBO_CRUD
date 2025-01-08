public class Obat {
    private String kodeObat;
    private String namaObat;
    private String idKategori;
    private String kodeSatuan;

    public Obat(String kodeObat, String namaObat, String idKategori, String kodeSatuan) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.idKategori = idKategori;
        this.kodeSatuan = kodeSatuan;
    }

    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getKodeSatuan() {
        return kodeSatuan;
    }

    public void setKodeSatuan(String kodeSatuan) {
        this.kodeSatuan = kodeSatuan;
    }
}
