/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan43_gajipegawai;

import java.util.Scanner;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* gaji pegawai dengan uang tunjangan dan lain lain dengan input oleh user
*
 */
public class PBO3_10117082_Latihan43_GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       gajiPegawai gp = new gajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-----------------------------------");
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
        
        System.out.print("Nama Karyawan : ");
        gp.setNama(scn1.next());
        System.out.print("Alamat : ");
        gp.setAlamat(scn2.next());
        System.out.print("Uang Transport : Rp. ");
        gp.setUangTransport(scn3.nextInt());
        System.out.print("Uang Tunjangan : Rp. ");
        gp.setUangTunjangan(scn4.nextInt());
        System.out.print("Gaji Pokok : Rp. ");
        gp.setGajiPokok(scn5.nextInt());
        
        System.out.println("TOTAL GAJI : Rp " + gp.totalGaji(250000, 300000, 
                4500000));
    }
    
}
