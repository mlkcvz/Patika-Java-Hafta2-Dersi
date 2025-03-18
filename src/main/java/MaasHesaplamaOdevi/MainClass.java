package MaasHesaplamaOdevi;

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args) {
        Employee employee = new Employee();

        Scanner scanner = new Scanner(System.in);
        System.out.println("maaşını gir : ");
        double maas = scanner.nextDouble();
        employee.tax(maas);

        System.out.println(" saat giriniz : ");
        int saat = scanner.nextInt();
        employee.bonus(saat,maas);

        System.out.println("işe başlangıç yılınızı giriniz : ");
        int baslangicYili = scanner.nextInt();
        employee.raiseSalary(baslangicYili,maas);


    }
}
