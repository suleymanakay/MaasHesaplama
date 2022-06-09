package org.example;
/*
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile,
 çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.
 Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Ahmet",2000,50,1996);
        employee.toOString();
    }
}