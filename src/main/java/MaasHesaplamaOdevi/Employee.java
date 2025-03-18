package MaasHesaplamaOdevi;

import java.util.Date;

public class Employee {
    // Nitelikler
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Boş kurucu metot
    public Employee() {
        System.out.println("Boş constructor çalıştı");
    }

    // 4 parametreli kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // tax() metodu - maaşa uygulanan vergi hesaplaması
    public double tax(double salary) {
        double taxAmount = 0;
        if (salary < 1000) {
            System.out.println("Maaş 1000 TL'den az, vergi uygulanmaz.");
        } else {
            taxAmount = salary * 0.03; // Maaşın %3'ü kadar vergi
            System.out.println("Vergi: " + taxAmount);
        }
        return taxAmount; // Vergi tutarını döndürüyoruz
    }

    public void bonus(int workHours , double salary){
        if (workHours>40)
        {
            workHours=workHours-40;
            salary=((workHours*30)+salary);
            System.out.println("bonuslu maaşın " + salary);
        }
        else {
            System.out.println("40 saat çalıştığın için maaşın : " + salary);
        }

    }
    public void raiseSalary(int hireYear , double salary)
    {
        int suankiYıl=2021;
        if(suankiYıl-hireYear<10)
        {
            salary=((salary*0.5)+salary);
            System.out.println(" 10 yıldan az çalıştığın için maaşın : " + salary);

        }
        else if(suankiYıl-hireYear>9 && suankiYıl-hireYear<20)
        {
            salary=((salary*0.5)+salary);
            System.out.println(" 9-20 yıl arasında kıdemin olduğu için maaşın  : " + salary);

        }
        else if(suankiYıl-hireYear>19)
        {
            salary=((salary*0.5)+salary);
            System.out.println(" 19 yıldan fazla çalıştığın için maaşın  : " + salary);


        }


    }
}

