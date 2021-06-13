package UC4.Exercise_01;

import java.util.Stack;

public class Example_01 {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        String expression = readPostFixExpression(input, output);
        evaluatePostFixExpression(expression, output);
    }

    private static void evaluatePostFixExpression(String expression, Output output) {
        Character value;
        Integer number1, number2, result;
        Stack<Integer> target = new Stack<Integer>();
        for (int x = 0; x < expression.length(); x++) {
            value = expression.charAt(x);
            if (Character.isDigit(value)) {
                target.push(Integer.parseInt(value.toString()));
                continue;
            }

            number2 = target.pop();
            if (target.empty()) {
                // 42351-+*+*
                output.println("No hay suficientes operandos");
                return;
            }
            number1 = target.pop();
            result = evaluateOperation(value.toString(), number1, number2);
            target.push(result);
        }
        if (target.size() > 1) {
            // 5379++
            output.println("Demasiados operandos");
            return;
        }
        // 4572+-*
        // 34+2*7/
        // 57+62-*
        // 42+351-*+
        output.println("El resultado es :" + target.pop());
    }

    private static Integer evaluateOperation(String operation, Integer number1, Integer number2) {
        if (operation.equals("+")) {
            return number1 + number2;
        }
        if (operation.equals("-")) {
            return number1 - number2;
        }
        if (operation.equals("*") || operation.equals("x")) {
            return number1 * number2;
        }
        if (operation.equals("/")) {
            return number1 / number2;
        }
        return 0;
    }

    private static String readPostFixExpression(Input input, Output output) {
        output.println("Introduce la expresión POSTFIX");
        output.println("Se admiten números enteros y las operaciones +, -, *, /");
        output.print("> ");
        String value = input.readString();
        while (!value.matches("[\\d\\s\\+\\-\\*\\/x]+")) {
            output.println("La expresión no es válida, intentalo de nuevo.");
            output.print("> ");
            value = input.readString();
        }
        return value.replaceAll("\\s", "");
    }
}