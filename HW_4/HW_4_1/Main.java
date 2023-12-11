//№1
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например: 
//ввод - mama, papa 
//вывод - mapa


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter two words with an even number of letters: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if ((str1.length() % 2 != 0) || (str2.length()) % 2 != 0){
            System.out.println("You entered the wrong word(s). Try again...");

        }
        else{
            int half1 = str1.length() / 2;
            int half2 = str2.length() / 2;

            String first1 = str1.substring(0, half1);
            String last2 = str2.substring(half2, str2.length());

            System.out.println("Result is: " + first1 + last2);


        }
    }
}

