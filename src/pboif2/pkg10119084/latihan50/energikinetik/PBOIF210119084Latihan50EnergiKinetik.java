/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan50.energikinetik;

/**
Nama : Muhammad Idris Merdefi
Kelas : PBOIF2
NIM : 10119084
Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan energi kinetik
 */
public class PBOIF210119084Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bola objBola = new Bola(145, 25);
        
        objBola.tampilData(objBola.getMassa(), objBola.getKecepatan());
    }
    
}
