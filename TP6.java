package com.abiyasidalmajid2300011.tugaspertemuan6;

import java.util.Scanner;

public class TP6 {

    public static void main(String[] args) {
        Scanner ObjInput = new Scanner(System.in);
        int a, t, s;
        
        // Segitiga 1
        Segitiga objSegitiga1 = new Segitiga();
        
        System.out.println("Menghtiung segitiga 1");
        System.out.println("Segitiga dengan alas: " + objSegitiga1.alas + ", tinggi: " + objSegitiga1.tinggi + ", sisi: " + objSegitiga1.sisi);
        System.out.println("Luasnya: " + objSegitiga1.getLuas());
        System.out.println("Kelilingnya: " + objSegitiga1.getKeliling());

        System.out.println("------------------------------");
        // Segitiga 2
        System.out.print("Masukkan alas segitiga 2: ");
        a = ObjInput.nextInt();
        System.out.print("Masukkan tinggi segitiga 2: ");
        t = ObjInput.nextInt();
        System.out.print("Masukkan sisi segitiga 2: ");
        s = ObjInput.nextInt();
        
        Segitiga objSegitiga2 = new Segitiga(a, t, s);
        
        System.out.println("Menghtiung segitiga 2");
        System.out.println("Segitiga dengan alas: " + objSegitiga2.alas + ", tinggi: " + objSegitiga2.tinggi + ", sisi: " + objSegitiga2.sisi);
        System.out.println("Luasnya: " + objSegitiga2.getLuas());
        System.out.println("Kelilingnya: " + objSegitiga2.getKeliling());
        
        System.out.println("------------------------------");
        // Segitiga 3
        
        Segitiga objSegitiga3 = new Segitiga();
        System.out.print("Masukkan alas segitiga 3: ");
        a = ObjInput.nextInt();
        System.out.print("Masukkan tinggi segitiga 3: ");
        t = ObjInput.nextInt();
        System.out.print("Masukkan sisi segitiga 3: ");
        s = ObjInput.nextInt();
        
        objSegitiga3.setAlas(a);
        objSegitiga3.setTinggi(t);
        objSegitiga3.setSisi(s);
        
        System.out.println("Menghtiung segitiga 3");
        System.out.println("Segitiga dengan alas: " + objSegitiga3.alas + ", tinggi: " + objSegitiga3.tinggi + ", sisi: " + objSegitiga3.sisi);
        System.out.println("Luasnya: " + objSegitiga3.getLuas());
        System.out.println("Kelilingnya: " + objSegitiga3.getKeliling());
    }
}
