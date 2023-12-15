//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
//        записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.


import java.util.Scanner;

public class TaskComparision {
    public static void main(String[] args) {

        float difM = 0f; // Объявление и инициалзация переменных для хранения разницы между 10 и числами m и n.
        float difN = 0f;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float m = sc1.nextFloat();
        System.out.println("Первое число: " + m);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        float n = sc2.nextFloat();
        System.out.println("Второе число: " + n);

        if (m == 10 && n == 10){ // m равно n.
            System.out.println("---------------------");
            System.out.println("Оба числа равны 10");
        }
        else if (m == 10){
            System.out.println("---------------------");
            System.out.println("Первое число равно 10");
        }
        else if (n == 10){
            System.out.println("---------------------");
            System.out.println("Второе число равно 10");
        }

        else{    // Ни m ни n не равны 10 и они находятся по одну сторону от 10.
            if (m == n){
                System.out.println("---------------------");
                System.out.println("Оба числа равны " + m);
            }
            else if (m < 10 && n < m){
                System.out.println("---------------------");
                System.out.println("Первое число равно " + m + " и оно ближе к 10");
            }
            else if (n < 10 && m < n){
                System.out.println("---------------------");
                System.out.println("Второе число равно " + n + " и оно ближе к 10");
            }
            else if (m > 10 && n > m){
                System.out.println("---------------------");
                System.out.println("Первое число равно " + m + " и оно ближе к 10");
            }
            else if (n > 10 && m > n){
                System.out.println("---------------------");
                System.out.println("Второе число равно " + n + " и оно ближе к 10");
            }

            else { // m не равно n и они находятся по разные стороны от 10.
                if (m > 10){ // m > 10, n < 10.
                    difM = m - 10;
                    difN = 10 - n;
                    if (difM < difN){
                        System.out.println("---------------------");
                        System.out.println("Первое число равно " + m + " и оно ближе к 10");
                    }
                    else if (difM > difN){
                        System.out.println("---------------------");
                        System.out.println("Второе число равно " + n + " и оно ближе к 10");
                    }
                    else {
                        System.out.println("---------------------");
                        System.out.println("Оба числа одинаково близки к 10");
                    }
                }
                else { // m < 10, n > 10.
                    difM = 10 - m;
                    difN = n - 10;
                    if (difM < difN){
                        System.out.println("---------------------");
                        System.out.println("Первое число равно " + m + " и оно ближе к 10");
                    }
                    else if (difM > difN){
                        System.out.println("---------------------");
                        System.out.println("Второе число равно " + n + " и оно ближе к 10");
                    }
                    else {
                        System.out.println("---------------------");
                        System.out.println("Оба числа одинаково близки к 10");
                    }
                }
            }
        }
    }
}
