package exercism.easy;

/*
https://exercism.org/tracks/java/exercises/calculator-conundrum/edit

In this exercise you will be building error handling for a simple integer calculator. To make matters simple, methods
for calculating addition, multiplication and division are provided.

The goal is to have a working calculator that returns a String with the following pattern: 16 + 51 = 67, when provided
with arguments 16, 51 and +.
 */
class CalculatorConundrum{
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        else if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        else if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
            throw new UnsupportedOperationException("Operation '" + operation + "' does not exist");
        }
        else {
            if (operation.equals("+")) {
                return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            }
            else if (operation.equals("*")) {
                return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            }
            else {
                try {
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                }
                catch (ArithmeticException e) {
                    throw new UnsupportedOperationException("Division by zero is not allowed", e);
                }
            }
        }
    }
}

