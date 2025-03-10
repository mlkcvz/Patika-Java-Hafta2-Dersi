package Hafta2;

import java.util.Scanner;

public class SifreOdevi
{
    public static void main(String[] args)
    {
        //Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki
        // kurallara göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen şifreyi giriniz : ");
        String sifre = scanner.nextLine();
        //Geçerli şifre:  1-En az 8 karakter içermeli
        //  2-Space karakteri içermemeli
        //  3-İlk harf büyük harf olmalı,
        //  4-Son karakteri ? olmalı
        if(sifre.length()>=8 && !sifre.contains(" ") && Character.isUpperCase(sifre.charAt(0)) && sifre.charAt(sifre.length() - 1) == '?')
        {
            System.out.println("geçerli şifre " + sifre);

        }


        else{
            System.out.println("geçersiz şifre");
        }

    }
}
