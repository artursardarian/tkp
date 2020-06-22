/*
    Створити новий Java-проєкт.
    Згенеруйте масив з 20 елементів в межах від 0 до 10.
    Обчисліть скільки разів зустрічається введене користувачем число.
 */

package lab2;
import java.util.Scanner;

public class lab2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int input = scanner.nextInt();
        int count = 0;
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 11));
            System.out.print(array[i]+", ");
            if (array[i] == input){
                count++;
            }
        }

        if (count == 20){
            System.out.println();
            System.out.println("ДЖЕКПОТ! Число "+input+" зустрічається в масиві "+count+" раз");
            System.out.print("Саме час придбати лоторейний білет!");
        }
        else
            System.out.println();
            System.out.println("Число "+input+" зустрічається в масиві "+count+" раз(а)");
    }
}