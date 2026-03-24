//Постановка задачи:
//        Определить одномерный массив и заполнить его случайными значениями
//        2) Поменять местами максимальный и минимальный элементы массива. Вывести измененный массив на экран;


import java.util.Random;

public  class Main {
    public static void main(String[] args) {

        //Создание одномерного массива
        int[] arr = new int[10];

        //Создание объекта генератора случайных чисел
        Random random = new Random();

        //Заполнение массива случайными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);//числа от 0 до 99
        }

        //Вывод исходного массива
        System.out.println("Исходный массив:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //Поиск минимального и максимального элемента
        //Пусть изначально первые элементы массива будут минимальными и максимальными
        int minIndex = 0;
        int maxIndex = 0;

        //Поиск реальных минимальных и максимальных значений
        for (int i = 1; i < arr.length; i++) {
            //Минимальное значение
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            //Максимальное значение
            if (arr[1] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        //Обмен местами минимального и максимального значения
        //Переменная temp нужна чтобы не потерять одно из значений при смене мест минимального и максимального элементов
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        //Вывод изменённого массива
        System.out.println("\nИзменённый массив:");
        for (int i = 0; arr.length > i; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}