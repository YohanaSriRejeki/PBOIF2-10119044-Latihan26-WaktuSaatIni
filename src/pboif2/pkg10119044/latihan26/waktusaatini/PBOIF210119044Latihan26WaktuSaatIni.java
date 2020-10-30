/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan26.waktusaatini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan waktu saat ini
 */
public class PBOIF210119044Latihan26WaktuSaatIni {
    public static void main(String[] args) {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter memformat = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy HH:mm:ss");
        
        String diformat = waktu.format(memformat);
        System.out.println("Hari ini adalah hari : "+diformat);
    }
}
