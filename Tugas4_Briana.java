package com.Tugas4SDA;

import java.util.LinkedList;
import java.util.Queue;

public class Tugas4_Briana {
    
    public static void main(String[] args) {
        
        System.out.println("Nama  : Briana Firsta");
        System.out.println("NIM   : 2111522024");
        System.out.println("Kelas : B");
        System.out.println(" ");

        //mendeklarasikan queue
        Queue<String> antrian = new LinkedList<String>();

        //elemen awal
        antrian.add("125");
        antrian.add("126");
        antrian.add("127");

        //awal program
        System.out.println("Selamat Datang di Jasa Cetak Foto!");
        System.out.println("Antrian Saat Ini : "+antrian);
        System.out.println(" ");

        //enqueue = fungsi add (menambah elemen)
        System.out.println("1. Perintah Enqueue");
        System.out.println("-------------------");
        antrian.add("128");
        System.out.println("Selamat Datang di Jasa Cetak Foto!");
        System.out.println("Antrian Saat Ini : "+antrian);
        System.out.println(" ");

        //dequeue = fungsi pool
        System.out.println("2. Perintah Dequeue");
        System.out.println("-------------------");
        System.out.println("Selamat Datang di Jasa Cetak Foto!");
        System.out.println("Antrian Selanjutnya : "+antrian.poll());
        System.out.println(" ");

        //pengecekan elemen paling atas = fungsi peek
        System.out.println("3. Elemen Teratas Terbaru");
        System.out.println("-------------------------");
        System.out.println("Selamat Datang di Jasa Cetak Foto!");
        System.out.println("Bersiap-siap Antrian : "+antrian.peek());
        System.out.println(" ");

        //pengecekan apakah elemen kosong = isEmpty
        System.out.println("4. Pengecekan Elemen");
        System.out.println("--------------------");
        System.out.println("Selamat Datang di Jasa Cetak Foto!");
        System.out.println("Apakah Antrian Kosong? : "+antrian.isEmpty());
        System.out.println(" ");

        //menampilkan banyak antrian
        System.out.println("5. Pengecekan Antrian");
        System.out.println("---------------------");
        System.out.println("Selamat Datang di Jasa Cetak Foto!");
        System.out.println("Waiting List : "+antrian);
        System.out.println(" ");
    }
}
