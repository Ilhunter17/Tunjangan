/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpbo52;

import java.util.Scanner;

/**
 * Nama : Ilhan Ramadhanu
 * NIM : 22166022
 * Semester : 3
 * Prodi : Sistem Informasi
 * MK : PBO 1
 * 
 * @author d a n u
 */
public class LatihanPbo52 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        // Input NIP Dosen
        System.out.print("NIP DOSEN:");
        String nipDosen = input.nextLine();

        // Output informasi Dosen
        System.out.println("Saya Dosen");
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO");

        // Menampilkan NIP Dosen yang diinputkan
        System.out.println("NIP Dosen: " + nipDosen);
    }
}
