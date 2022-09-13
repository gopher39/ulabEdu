package homework;
import java.util.Scanner;
public class Task2_2 {
    public static void main(String[] args) {

        /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару чисел именно в скобках, которые дают сумму - 10
         */

    Scanner input = new Scanner(System.in);
    System.out.println("Введите массив чисел:");
    int[] array = new int[5];                                           //create array
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();                             //input array's elements from keyboard
        }

        System.out.println("Введите число которое нужно получить:");
        int number = input.nextInt();                               //input desired number
        int startSearch = 0;
        boolean notFound = true;
        for (int i = startSearch; i < array.length; i++) {          //take the first element of the array
            for (int j = startSearch + 1; j < array.length; j++) {  //take the all next elements of the array
                if (array[i] + array[j] == number) {                //equals summ two elements with number
                    notFound = false;
                    System.out.println("[" + array[i] + "," + array[j] + "]");
                    //if summ equals number then printing result
                }
            }
            startSearch++;
        }

            if (notFound) {
                System.out.println("Извините, сумма пар чисел Вашего массиве не дает число " + number);
            }
    }
}

