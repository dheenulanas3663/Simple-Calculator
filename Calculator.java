import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (op == '+') System.out.println(a + b);
        else if (op == '-') System.out.println(a - b);
        else if (op == '*') System.out.println(a * b);
        else if (op == '/') System.out.println(b == 0 ? "Cannot divide by zero" : a / b);
        else System.out.println("Invalid operator");
    }
}