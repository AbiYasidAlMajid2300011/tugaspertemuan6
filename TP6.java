package com.abiyasidalmajid2300011.tugaspertemuan6;

public class TP6 {

    public static void main(String[] args) {
        // Segitiga 1
        Segitiga objSegitiga1 = new Segitiga();
        
        System.out.println("Menghtiung segitiga 1");
        System.out.println("Segitiga dengan alas: " + objSegitiga1.alas + ", tinggi: " + objSegitiga1.tinggi + ", sisi: " + objSegitiga1.sisi);
        System.out.println("Luasnya: " + objSegitiga1.getLuas());
        System.out.println("Kelilingnya: " + objSegitiga1.getKeliling());

        System.out.println("------------------------------");
        // Segitiga 2
        Segitiga objSegitiga2 = new Segitiga(30, 10, 90);
        
        System.out.println("Menghtiung segitiga 2");
        System.out.println("Segitiga dengan alas: " + objSegitiga2.alas + ", tinggi: " + objSegitiga2.tinggi + ", sisi: " + objSegitiga2.sisi);
        System.out.println("Luasnya: " + objSegitiga2.getLuas());
        System.out.println("Kelilingnya: " + objSegitiga2.getKeliling());
        
        System.out.println("------------------------------");
        // Segitiga 3
        
        Segitiga objSegitiga3 = new Segitiga();
        objSegitiga3.setAlas(20);
        objSegitiga3.setTinggi(30);
        objSegitiga3.setSisi(60);
        
        System.out.println("Menghtiung segitiga 3");
        System.out.println("Segitiga dengan alas: " + objSegitiga3.alas + ", tinggi: " + objSegitiga3.tinggi + ", sisi: " + objSegitiga3.sisi);
        System.out.println("Luasnya: " + objSegitiga3.getLuas());
        System.out.println("Kelilingnya: " + objSegitiga3.getKeliling());
    }
}