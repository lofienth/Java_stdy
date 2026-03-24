//Постановка задачи
//        2. Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y.
//        Меньшее из них разделить на 10. Вывести результат на экран.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Создание объекта scan для реализации ввода от пользователя
        Scanner scan = new Scanner(System.in);

        //Ввод первого числа
        System.out.print("Введите первое число: ");
        float x = scan.nextFloat();

        //Ввод второго числа
        System.out.print("Введите второе число: ");
        float y = scan.nextFloat();

        //Проверка какое из чисел меньше. Меньшее число делится на 10
        if (x < y){
            x /= 10;
            System.out.println("Результат: " + x);
        }else{
            y /= 10;
            System.out.println("Результат: " + y);
        }
    }
}