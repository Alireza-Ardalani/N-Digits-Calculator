/**
 * Hi!
 * This is Alireza Ardalani!
 * https://github.com/Alireza-Ardalani
 * <p>
 * N-digit Arithmetic operators:
 * <p>
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Modulo
 **/
public class Main {

    public static void main(String[] inputArgs) {
        String first = "100";
        String second = "-100";
        String operation = "*";

        String regexNumber = "^[+-]?\\d+$";
        String regexOperation = "^[+-]?\\d+$";

        boolean checkNumber1 = first.matches(regexNumber);
        boolean checkNumber2 = second.matches(regexNumber);
        boolean checkOperation = operation.matches(regexOperation);

        if (!checkNumber1) {
            System.out.println(" -First Number- Syntax is Invalid! please just use  digits and fill free to add sign.");
            System.exit(0);
        }
        if (!checkNumber2) {
            System.out.println(" -Second Number- Syntax is Invalid! please just use  digits and fill free to add sign.");
            System.exit(0);
        }
        if (checkOperation) {
            System.out.println(" Operation should be: +,-,*,/,%");
            System.exit(0);
        }
        bigNumber firstNumber = new bigNumber(first);
        bigNumber secondNumber = new bigNumber(second);
        bigNumber result = null;
        switch (operation) {
            case "+":
                result = operations.addition(firstNumber, secondNumber);
                break;
            case "-":
                result = operations.subtraction(firstNumber, secondNumber);
                break;
            case "*":
                result = operations.multiplication(firstNumber, secondNumber);
                break;
            case "/":
                result = operations.division(firstNumber, secondNumber, true);
                break;
            case "%":
                result = operations.division(firstNumber, secondNumber, false);
                break;
        }
        System.out.println(" (" + first + ") " + operation + " (" + second + ") ");
        System.out.println(" Result =-=-=->> " + result);
    }

}