import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int reverseNumber = reverseDigits(number);
        System.out.println("Обратное число: " + reverseNumber);
    }

    public static int reverseDigits(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int digit = number % 10;
            stack.push(digit);
            number = number / 10;
        }

        int reverseNumber = 0;
        int multiplier = 1;
        while (!stack.isEmpty()) {
            reverseNumber += stack.pop() * multiplier;
            multiplier *= 10;
        }
        return reverseNumber;
    }
}