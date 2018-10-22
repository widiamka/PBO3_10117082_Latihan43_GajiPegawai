/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan43_gajipegawai;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* gaji pegawai dengan uang tunjangan dan lain lain dengan input oleh user
 */
public class gajiPegawai {
    private String nama;
    private String alamat;
    private int uangTunjangan;
    private int uangTransport;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
        
    }
    public void tampilData(String nama, String alamat, int uangTunjangan,
            int uangTranport, int gajiPokok, int totalGaji ){
        System.out.println("Nama Karyawn : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Uang Tunjangan : Rp " + uangTunjangan);
        System.out.println("uangTransport : Rp " + uangTransport);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Total Gaji : Rp " + totalGaji);
    }
}
