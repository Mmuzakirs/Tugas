package e.ktp;

public class FORM_PENDAFTARAN {
        private String NIK;
        private String Nama;
        private String TTL;
        private String JenisKelamin;
        private String Alamat;
        private String Agama;
        private String StatusPerkawinan;
        private String Pekerjaan;
        private String Kewarganegaraan;
        private String golonganDarah;
        private String kelurahan;
        private String kecamatan;
        private String rt;
    
    public FORM_PENDAFTARAN(String NIK, String Nama, String ttl, String JenisKelamin, String Alamat, String Agama, String StatusPerkawinan,
                            String Pekerjaan, String Kewarganegaraan, String golonganDarah, String kelurahan, String kecamatan, String rt){
        this.NIK = NIK;
        this.Nama = Nama;
        this.TTL = TTL;
        this.JenisKelamin = JenisKelamin;
        this.Alamat = Alamat;
        this.Agama = Agama;
        this.StatusPerkawinan = StatusPerkawinan;
        this.Pekerjaan = Pekerjaan;
        this.Kewarganegaraan = Kewarganegaraan;
        this.golonganDarah = golonganDarah;  
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.rt = rt;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    public String getStatusPerkawinan() {
        return StatusPerkawinan;
    }

    public void setStatusPerkawinan(String StatusPerkawinan) {
        this.StatusPerkawinan = StatusPerkawinan;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public String getKewarganegaraan() {
        return Kewarganegaraan;
    }

    public void setKewarganegaraan(String Kewarganegaraan) {
        this.Kewarganegaraan = Kewarganegaraan;
    }
    public String getgolonganDarah() {
        return golonganDarah;
    }

    public void setgolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }
}