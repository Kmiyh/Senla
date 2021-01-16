package task_5;

import java.util.Scanner;

public class Main {

    public static int reverse(int num) {
        int input = num;
        int num1 = 0;

        while (input>0) {
            num1 = num1 * 10;
            num1 = num1 + input%10;
            input = input / 10;
        }
        return num1;
    }

    public static void main(String[] args) {
        int start = 0, end = 0, reversed, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон через пробел: ");
        if (scanner.hasNextInt()) {
            start = scanner.nextInt();
            end = scanner.nextInt();
            if (end - start >= 100) {
                System.out.println("Диапазон не должен превышать 100 чисел");
                System. exit(0);
            }
        } else {
            System.out.println("Вы ввели нецелое число");
            System. exit(0);
        }
        for (i = start; i <= end; i++) {
            reversed = reverse(i);
            if (i == reversed) {
                System.out.println(i + " - это число-палиндром");
            }
        }
    }
}
