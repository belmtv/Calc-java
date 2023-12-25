import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String[] result = input.split(" ");
        int numberOne = Integer.parseInt(result[0]);
        int numberTwo = Integer.parseInt(result[2]);
        String symbol = result[1];

        String[] sybmolArr = {"+", "-", "/", "*"};

        int newResult = 0;

        if (numberOne <= 10 && numberTwo <= 10 && Arrays.asList(sybmolArr).contains(symbol)) {
            switch (symbol) {
                case "+":
                    newResult = numberTwo + numberOne;
                    break;
                case "-":
                    newResult = numberOne - numberTwo;
                    break;
                case "/":
                    newResult = numberOne / numberTwo;
                    break;
                case "*":
                    newResult = numberOne * numberTwo;
                    break;
                default:
                    System.out.println("Недопустимый знак операции.");
            }
            return "" + newResult;
        } else {
            return "Так нельзя.";
        }
    }
}