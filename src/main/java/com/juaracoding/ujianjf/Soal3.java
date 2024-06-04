package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        int jumlahTiket = 6;
        boolean isWeekend = true;
        int hargaTiketWeekday = 35000;
        int hargaTiketWeekend = 45000;

        int hargaPerTiket = isWeekend ? hargaTiketWeekend : hargaTiketWeekday;

        int totalHarga = jumlahTiket * hargaPerTiket;

        if (jumlahTiket > 5) {
            totalHarga *= 0.9;
        }

        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + totalHarga);
    }
}
