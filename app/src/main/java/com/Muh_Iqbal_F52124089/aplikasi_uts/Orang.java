package com.Muh_Iqbal_F52124089.aplikasi_uts;

public class Orang {
    private int gambar;
    private String nama;
    private String status;
    private String jurusan;
    private String angkatan;

    public Orang(int gambar, String nama, String status, String jurusan, String angkatan) {
        this.gambar = gambar;
        this.nama = nama;
        this.status = status;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public int getGambar() { return gambar; }
    public String getNama() { return nama; }
    public String getStatus() { return status; }
    public String getJurusan() { return jurusan; }
    public String getAngkatan() { return angkatan; }
}