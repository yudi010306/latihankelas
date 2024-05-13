/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-6
 */
public class latihankelas {
    public static void main(String[] args) {
        System.out.println("latihan kelas");
        String judulbuku1 = "java 1";
        String authorbuku1 = "yudi";
        String judulbuku2 = "java 2";
        String authorbuku2 = "wafiudin";
        System.out.println(judulbuku1);
       System.out.println(authorbuku1);
        System.out.println(judulbuku2);
        System.out.println(authorbuku2);
        buku buku1 = new buku();
        buku buku2 = new buku();
        buku1.judul = "java 1";
        buku1.author = "yudi";
        buku2.judul = "java 2";
        buku2.author = "lacer";
        
        System.out.println(buku1.judul);
        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        System.out.println(buku2.author);
    }
}

class buku{
    String judul;
    String author;
    int tahunpenerbitan = 2024;
    harga harga = new harga();
    perusahaanbuku penerbit = new perusahaanbuku();
}

class harga{
    double jual = 200000.00;
    double beli = 150000.00;
}