package task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, i;
        boolean isComposite = false;
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " " + "- четное число");
            } else {
                System.out.println("Вы ввели нечетное число");
            }
        } else {
            System.out.println("Вы ввели нецелое число");
            System. exit(0);
        }
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("Число " + a + " составное");
        } else {
            System.out.println("Число " + a + " простое");
        }
    }
}
