/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-6
 */
public class latihan {
public static void main(String[] args) {
// Bentuk Normal
int angka = 10;
if (angka % 2 == 0) {
System.out.println("Genap (Normal)");
} else {
System.out.println("Ganjil (Normal)");
}
// Bentuk Ternary
String hasilTernary = (angka % 2 == 0) ? "Genap (Ternary)" : "Ganjil(Ternary)";
System.out.println(hasilTernary);
// Bentuk Lambda Expression
int nilai = 75;
String keterangan;
switch (nilai) {
    case 80:
        keterangan = "Nilai sangat baik (Lambda)";
        break;
    case 70:
        keterangan = "Nilai baik";
        break;
    default:
        if (nilai < 60) keterangan = "Nilai buruk";
        else keterangan = "Nilai tidak ada";

}
System.out.println(keterangan);
// Bentuk Menggunakan Var
var umur = 20;
var kategori = (umur >= 18) ? "Dewasa (Var)" : "Anak-anak (Var)";
System.out.println(kategori);
}
}

