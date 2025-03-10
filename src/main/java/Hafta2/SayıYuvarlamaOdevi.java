package Hafta2;

import java.util.Scanner;

public class SayıYuvarlamaOdevi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ondalıklı sayı gir : ");
        double ondalikliSayi = scanner.nextDouble();

        // Aşağı yuvarlama
        int asagiYuvarlama = (int) Math.floor(ondalikliSayi);

        // Yukarı yuvarlama
        int yukariYuvarlama = (int) Math.ceil(ondalikliSayi);

        // En yakın tam sayıya yuvarlama
        int enYakın = (int) Math.round(ondalikliSayi);

        System.out.println("aşağı yuvarlama " + asagiYuvarlama);
        System.out.println("yukarı yuvarlama " + yukariYuvarlama);
        System.out.println("en yakın tam sayıya yuvarlama " + enYakın);
    }
}
