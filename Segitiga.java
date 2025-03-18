package com.abiyasidalmajid2300011.tugaspertemuan6;

public class Segitiga {

    double alas;
    double tinggi;
    double sisi;

    Segitiga() {
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }

    Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    double getLuas() {
        return (alas * tinggi) / 2;
    }
    
    double getKeliling() {
        return alas + tinggi + sisi;
    }

    void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}