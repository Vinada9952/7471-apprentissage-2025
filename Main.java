package apprentissage;

class Main {
    public static void main(String[] args) {
        Input inputs = new Input();
        Basic basic = new Basic();
        Secondary secondary = new Secondary();

        System.out.println("Welcome to the Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = inputs.numbers();

        System.out.print("Enter the second number: ");
        double num2 = inputs.numbers();

        System.out.println("Choose an operation: +, -, *, /");
        String operation = inputs.letters();

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