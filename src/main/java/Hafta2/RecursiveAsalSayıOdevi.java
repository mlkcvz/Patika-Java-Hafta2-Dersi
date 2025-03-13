package Hafta2;

import java.util.Scanner;

public class RecursiveAsalSayıOdevi{

    // Asal sayıyı kontrol eden özyinelemeli metot
    public static boolean isAsal(int sayi, int i) { //metodda dönüş değeri yani burada boolean yalnızca return ile bağlantılı

        // Base case: Eğer i, sayının kareköküne kadar geldiyse ve sayı bölünmemişse asal sayıdır
        if (i == 1) {
            return true;
        }
        // Eğer sayi, i'ye bölünebiliyorsa asal değildir
        if (sayi % i == 0) {
            return false;
        }
        // Özyineleme: i'yi bir azaltarak tekrar kontrol eder
        return isAsal(sayi, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        // 2'yi özel bir durum olarak kontrol ediyoruz
        if (sayi < 2) {
            System.out.println(sayi + " sayısı ASAL değildir !");
        } else {
            // Sayıyı asal olup olmadığını kontrol et
            boolean sonuc = isAsal(sayi, sayi / 2);
            if (sonuc) {
                System.out.println(sayi + " sayısı ASALDIR !");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir !");
            }
        }
    }
}