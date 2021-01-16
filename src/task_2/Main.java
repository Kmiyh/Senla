package task_2;

import java.util.Scanner;

public class Main {

    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых неотрицательных натуральных числа: ");
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            if (number1 > 0 && number2 > 0) {
                System.out.println("НОД равен " + gcd(number1,number2));
                System.out.println("НОК равен " + lcm(number1,number2));
            } else {
                System.out.println("Нельзя вводить отрицательные числа");
            }
        } else {
            System.out.println("Нельзя вводить дробные числа, а также ноль");
        }
    }
}
