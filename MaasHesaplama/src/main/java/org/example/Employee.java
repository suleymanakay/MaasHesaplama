package org.example;
/*
Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */
public class Employee {
    String name;
    int maas;
    int workHours;
    int hireYear;

    Employee(String name,int maas,int workHours,int hireYear){
        this.name=name;
        this.maas=maas;
        this.hireYear=hireYear;
        this.workHours=workHours;

    }
     int tax(int maas){
        if(this.maas >1000){
            return  this.maas*3/100;
        }
        else{
            return  this.maas;
        }

    }
    int bonus(int workHours){
        if(this.workHours>40){
            int a=0;
            a=(this.workHours-40);
            return  (a*30);
        }
        else {
            return  this.maas;
        }
    }
    int raisSalary( int hireYear){
        int b=0;
        b=2021-this.hireYear;
        if(b<10){
            return  (this.maas*5/100);
        }
        else if(b>9 && b<20){
            return  (this.maas*1/10);
        } else if (b>19) {
            return  (this.maas*15/100);
        }
        return 1;
    }
    public void toOString(){
        System.out.println("Çalışan ismi: "+this.name);
        System.out.println("Çalışanın maaşı: "+maas);
        System.out.println("Çalışanın haftalık çalışma saati: "+this.workHours);
        System.out.println("Çalışanın işe başlama tarihi: "+this.hireYear);
        System.out.println("Vergi: "+tax(this.workHours));
        System.out.println("Bonus: "+bonus(this.workHours));
        System.out.println("Maaş artışı: "+raisSalary(this.hireYear));
        System.out.println("Vergi ve Bonuslarla birlikte Maaş: "+(maas+bonus(this.workHours)-tax(this.maas)));
        System.out.println("Toplam maaş:"+(maas+bonus(this.workHours)+raisSalary(this.hireYear)));
    }

}
