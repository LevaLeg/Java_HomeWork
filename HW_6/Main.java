import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых
// зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);

        if (canBuy == true){
            System.out.println("Я могу купить еду, это здорово.");
            System.out.println("Значение canBuy: " + canBuy);
        }

        else {
            System.out.println("Я не могу купить еду, это не очень здорово.");
            System.out.println("Значение canBuy: " + canBuy);
        }

    }

    public static boolean canBuy(boolean edekaOpen, boolean reweOpen) {
        if (edekaOpen || reweOpen) {
            return true;
        } else {
            return false;
        }
    }
}


//        2. Реализуйте программу,
//        которая попросит пользователя ввести год и
//        напечатать этот год isLeap (високосный) или нет.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите год в формате 2021");
//        int year = sc.nextInt();
//
//        if (year % 4 == 0) {
//            System.out.println("Год високосный");
//
//        } else {
//            System.out.println("Год не високосный");
//        }
//    }
//}

        // 3. Реализуйте программу, которая попросит
        // пользователя ввести три целых числа (используйте сканер)
        // и напечатает максимум из трех чисел.
//        int max = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите первое целое число");
//        int a = sc.nextInt();
//        System.out.println("Введите второе целое число");
//        int b = sc.nextInt();
//        System.out.println("Введите третье целое число");
//        int c = sc.nextInt();
//
//
//        if (a > b && b > c){max = a;} //a
//        if (a > b && c > b && a > c){max = a;} //a
//        if (a > b && c > a){max = c;} //c
//
//        if (b > a && a > c){max = b;} //b
//        if (b > a && c > a && b > c){max = b;} //b
//        if (b > a && c > b){max = c;} //c
//
//        if (c > a && a > b){max = c;} //c
//        if (c > a && b > a && c > b){max = c;} //c
//        if (c > a && b > c){max = b;} //b
//
//
//
//        if (a == b && c > a){max = c;}
//        if (a == b && a > c){max = a;}
//
//        if (a == b && a > c){max = a;}
//
//        if (b == c && a > b){max = a;}
//        if (b == c && b > a){max = b;}
//
//        if (a == c && a > b){max = a;}
//
//        if (a == c && b > a){max = b;}
//
//        if (a == b && a == c){
//            System.out.println("Все числа равны");
//        } else {
//            System.out.println("Наибольшее число: " + max);
//        }
//    }
//}

        // *Дополнительно
        //Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
        // его цифр (заранее не известно сколько цифр будет в числе).
        //
        //
        //Например:
        //Ввод = 12345
        //Вывод = 1+2+3+4+5 = 15

