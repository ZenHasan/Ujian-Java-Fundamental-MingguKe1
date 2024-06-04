package com.juaracoding.ujianjf;

public class Soal4 {
    public static void main(String[] args) {
        String[] films = new String[5];

        films[0] = "Kingdom Of The Planet Of The Apes";
        films[1] = "Spider-Man: Homecoming";
        films[2] = "Siksa Neraka";
        films[3] = "Vina";
        films[4] = "Doctor Strange";

        System.out.println("Daftar film bioskop\n");

        for (int i = 0; i < films.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            System.out.println(films[i]);
        }
        System.out.println("\nFilm yang ingin ditonton:\n");
        for (int i = 0; i < films.length; i++) {
            System.out.println((i + 1) + ". " + films[i]);
        }
    }
}

