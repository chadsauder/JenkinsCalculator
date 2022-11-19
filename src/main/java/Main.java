import java.util.Scanner;

public class Main {
    private static String ADD_STRING = "add";
    private static String SUBTRACT_STRING = "subtract";
    private static String MULTIPLY_STRING = "multiply";
    private static String DIVIDE_STRING = "divide";
    private static String FIBONACCI_STRING = "fibonacci";
    private static String BINARY_STRING = "binary";
    private static String DONE_STRING = "exit";

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        System.out.println("welcome to the Jenkins calculator");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a command: ");
            String userTask = sc.next();

            int firstNum;
            int secondNum;
            int num;

            if (userTask.equals(ADD_STRING)) {
                firstNum = sc.nextInt();
                secondNum = sc.nextInt();
                int addResult = calculator.add(firstNum, secondNum);
                System.out.println(addResult);
            } else if (userTask.equals(SUBTRACT_STRING)) {
                firstNum = sc.nextInt();
                secondNum = sc.nextInt();
                int subtractResult = calculator.subtract(firstNum, secondNum);
                System.out.println(subtractResult);
            } else if (userTask.equals(MULTIPLY_STRING)) {
                firstNum = sc.nextInt();
                secondNum = sc.nextInt();
                int multiplyResult = calculator.multiply(firstNum, secondNum);
                System.out.println(multiplyResult);
            } else if (userTask.equals(DIVIDE_STRING)) {
                firstNum = sc.nextInt();
                secondNum = sc.nextInt();
                int divideResult = calculator.divide(firstNum, secondNum);
                System.out.println(divideResult);
            } else if (userTask.equals(FIBONACCI_STRING)) {
                num = sc.nextInt();
                int fibonacciResult = calculator.fibonacciNumberFinder(num);
                System.out.println(fibonacciResult);
            } else if (userTask.equals(BINARY_STRING)) {
                num = sc.nextInt();
                String binaryResult = calculator.intToBinaryNumber(num);
                System.out.println(binaryResult);
            } else if (userTask.equals(DONE_STRING)) {
                System.out.println("goodbye.");
                break;
            } else {
                System.out.println("input is not valid");
            }
        }
    }
}
