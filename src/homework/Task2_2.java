package homework;
import java.util.Scanner;
public class Task2_2 {
    public static void main(String[] args) {

        /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */
Scanner input = new Scanner(System.in);
System.out.println("Введите массив чисел:");
int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
System.out.println("Введите число которое нужно получить:");
        int number = input.nextInt();
        int startSearch = 0;
        boolean notFound = false;
        for (int i = startSearch; i < array.length; i++) {
            for (int j = startSearch + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    notFound = true;
                    System.out.println("[" + array[i] + "," + array[j] + "]");
                }
            }
            startSearch++;
        }
        if (notFound == false) {
            System.out.println("Извините, сумма пар чисел Вашего массиве не дает число " + number);
        }
        }
}

