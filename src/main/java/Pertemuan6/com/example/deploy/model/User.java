package Pertemuan6.com.example.deploy.model;

public class User {
    private String nama;
    private String nim;
    private String jenisKelamin;

    public User() {}

    public User(String nama, String nim, String jenisKelamin) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getJenisKelamin() { return jenisKelamin; }

    public void setNama(String nama) { this.nama = nama; }
    public void setNim(String nim) { this.nim = nim; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }
}