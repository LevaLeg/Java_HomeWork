//№2
//        Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как
//        два отдельных метода - один с типом void, второй - int.


public class Main {
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 8;
        int sum = num1 + num2;
        int mult = num1 * num2;
        int sub = num1 - num2;
        int div = num1 / num2;


        System.out.println("num1 + num2 = " + sum);
        System.out.println("num1 * num2 = " + mult);
        System.out.println("num1 - num2 = " + sub);
        System.out.println("num1 / num2 = " + div);



    }

//    public static int main(String[] args) {
//
//        static sumNums(int num1, int num2) {
//            return (int) num1 + num2;
//    }
}