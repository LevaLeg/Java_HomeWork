// 1. Создайте строку через new - I study Basic Java!
//Напишите метод, который принимает в качестве параметра строку,
//передайте в этот метод строку, которую создали в п.1
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Вырезать строку Java c помощью метода String.substring().
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.

// 2.
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль


public class Main {
    public static void main(String[] arg) {


        String str = "I study Basic Java!";

        printString(str);


        sum(5, 2);


        int min = minus(5, 2);
        System.out.println("Result of subtraction is: " + min);
        int m = multiply(5, 2);
        System.out.println("Result of multiply is: " + m);
        int d = division(5, 2);
        System.out.println("Result of division is: " + d);
    }

    public static void printString(String str) {
        System.out.println(str);
        System.out.println(str.charAt(17));
        System.out.println(str.substring(14, 18));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }


    public static void sum(int a, int b) {
        System.out.println(a+b);
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
    static int division(int a, int b) {
        return a / b;
    }
}