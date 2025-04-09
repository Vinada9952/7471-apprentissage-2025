import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Input inputs = new Input();
        Basic basic = new Basic();
        Secondary secondary = new Secondary();
        
        System.out.println("Welcome to the Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = inputs.numbers();
        
        System.out.println("Choose an operation: +, -, *, /");
        String operation = inputs.letters();
        
        System.out.print("Enter the second number: ");
        double num2 = inputs.numbers();
        

        double result = 0;
        switch (operation) {
            case "+":
            result = basic.add(num1, num2);
                break;
                case "-":
                result = basic.subtract(num1, num2);
                break;
                case "*":
                result = secondary.multiply(num1, num2);
                break;
                case "/":
                result = secondary.divide(num1, num2);
                break;
                default:
                System.out.println("Invalid operation!");
                return;
            }
            
            System.out.println("The result is: " + result);
        }
    }





class Input {
    public String letters() {
        Scanner text_input = new Scanner(System.in);
        return text_input.nextLine();
    }

    public double numbers() {
        Scanner text_input = new Scanner(System.in);
        return text_input.nextDouble();
    }
}


class Basic {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }
}



class Secondary {
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}