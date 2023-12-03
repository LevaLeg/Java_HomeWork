//Домашнее задание 2.
//№ 1
//
//
//В методе main инициализировать все примитивные типы и не примитивные типы.
//
//Вывести их результат в консоль:
//char: G
//int: 89
//byte: 4
//short: 56
//float: 4.7333436
//double: 4.355453532
//long: 12121
//
//
//Character: G
//Integer: 89
//Byte: 4
//Short: 56
//Float: 4.7333436
//Double: 4.355453532
//Long: 12121


public class Main {
    public static void main(String[] args) {
        char word = 'G';
        int number = 89;
        byte b = 4;
        short sh = 56;
        float fl = 4.7333436F;
        double db = 4.355453532;
        long lg = 12121;

        System.out.println(word);
        System.out.println(number);
        System.out.println(b);
        System.out.println(sh);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(lg);




//№ 2*
//Дано трехзначное число. Вывести на экран все цифры этого числа.
//
//
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5


        int num = 345;
        int hundreds = num / 100;   //3
        int dec = num / 10;         //34
        int decades = dec % 10;     //4
        int units = num % 10;       //5

        System.out.println("Число 345 -> " + hundreds + ", " + decades + ", " + units);

    }
}



