package com.juaracoding.ujianjf;

public class Soal5 {
    public static void main(String[] args) {
        int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + ": " + hargaTiket[i]);
        }

        int totalHarga = 0;
        for (int harga : hargaTiket) {
            totalHarga += harga;
        }

        System.out.println("\nTotal harga tiket: " + totalHarga);
    }
}
