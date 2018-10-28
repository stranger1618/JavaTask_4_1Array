import java.util.Random;

/**
 * Генерация массива из 20 случайных чисел от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 */

public class Numbers {
    public static void main(String[] args) {
        //Объявление переменных
        int myArray[];
        myArray = new int[20];
        Random myRandom = new Random();

        //Задание начальных значений искомых элементов и их индексов
        int maxMinusEl = -11;
        int minPlusEl = 11;
        int maxMinusIndex = -1;
        int minPlusIndex = -1;

        System.out.println("Сгенерированный массив чисел: ");

        //Генерация массива и поиск требуемых элементов
        for (int i = 0; i<20; i++) {
            myArray[i] = myRandom.nextInt(21) - 10;
            System.out.print(myArray[i] + " ");
            if ((myArray[i] < 0) && (myArray[i]> maxMinusEl)) {
                maxMinusEl = myArray[i];
                maxMinusIndex = i;
            }
            if ((myArray[i] > 0) && (myArray[i] < minPlusEl)) {
                minPlusEl = myArray[i];
                minPlusIndex = i;
            }
        }
        System.out.println("\n\nМаксимальное отрицательное число = " + maxMinusEl);
        System.out.println("\nМинимальное положительное число = " + minPlusEl);

        //Перестановка элементов
        int x = myArray[minPlusIndex];
        myArray[minPlusIndex] = myArray[maxMinusIndex];
        myArray[maxMinusIndex] = x;

        System.out.println("\nМассив после перестановки указанных чисел местами:");

        //Вывод элементов массива после перестановки чисел местами
        for (int i = 0; i<20; i++) {
            System.out.print(myArray[i] + " ");
        }

    }
}
