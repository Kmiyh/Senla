package task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String input = scanner.nextLine();
        StringBuilder upper = new StringBuilder();
        int wordCount = 0;
        if (input.length() == 0) {
            System.out.println("Предложение не задано");
            System. exit(0);
        }
        else {
            wordCount++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' ') {
                    wordCount++;
                }
            }
        }
        System.out.println("Количество слов: " + wordCount);
        String[] words = input.split("\\s+");
        Arrays.sort(words);
        System.out.print("Отсортированное предложение: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        upper.append(input.substring(0, 1).toUpperCase());
        for (int i = 1; i < input.length(); i++) {
            if (" ".equals(input.substring(i-1, i)))
                upper.append(input.substring(i, i + 1).toUpperCase());
            else
                upper.append(input.charAt(i));
        }
        System.out.println("Заглавные буквы: " + upper);
    }
}
