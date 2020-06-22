/*
    Створити новий Java-проєкт.
    Задано натуральне число n. Скільки різноманітних цифр зустрічається в його десятковому записі.
*/

package lab2;
import java.util.Scanner;

public class lab2_2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть натуральне число: ");
        int input = scanner.nextInt();
        int countdifferent = 0;
        int[] count = new int[10];

        while (input != 0){
            count[(int)(input%10)]++;
            input /= 10;
        }
        for (int i = 0; i < 10; i++){
            if (count[i] > 0) countdifferent++;
        }

        System.out.print(countdifferent);
    }
}