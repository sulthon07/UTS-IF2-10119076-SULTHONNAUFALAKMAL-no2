/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119076.sulthonnaufalakmal.no2;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Tabungan
 */
public class UTSIF210119076SULTHONNAUFALAKMALNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoAwal,jumlahUang;
        System.out.println("=======Program Penarikkan Uang=======");
        System.out.print("Masukkan Sakdo Awal : ");
        saldoAwal = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlahUang = scanner.nextInt();
        System.out.println("Saldo Anda S5ekarang : " + tabungan.ambilUang(jumlahUang));
    }
    
}
