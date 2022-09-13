package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {

        /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару чисел именно в скобках, которые дают сумму - 10
         */

    Scanner input = new Scanner(System.in);
    System.out.println("Введите массив чисел:");
    Integer[] array = new Integer[5];                               //create array
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();                            //input array's elements from keyboard
        }

        System.out.println("Введите число которое нужно получить:");
        int number = input.nextInt();                               //input desired number
        int startSearch = 0;
        boolean notFound = true;

        List<Integer> twoNumbers = new ArrayList<>();
            for (int i = startSearch; i < array.length; i++) {
                if (Arrays.asList(array).contains(number - array[i])) {
                    twoNumbers.add(array[i]);
                    twoNumbers.add(number - array[i]);
                    notFound = false;
                }
            }

            System.out.println(twoNumbers.stream().limit(2).toList());

            if (notFound) {
                System.out.println("Извините, сумма пар чисел Вашего массиве не дает число " + number);
            }
    }
}

