import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Input inputs = new Input();
        Basic basic = new Basic();
        Secondary secondary = new Secondary();
        
        System.out.print("Entrez le premier nombre: ");
        double num1 = inputs.numbers();
        
        System.out.println("Choisissez un opérateur: +, -, *, /");
        String operation = inputs.letters();
        
        System.out.print("Entrez le 2e nombre: ");
        double num2 = inputs.numbers();
        double result = 0;
        if ( operation.equals( "+" ) ) {
            result = basic.add(num1, num2);
            System.out.println( num1 + operation + num2 + "=" + result );
        }
        else if( operation.equals( "-" ) ) {
            result = basic.sub(num1, num2);
            System.out.println( num1 + operation + num2 + "=" + result );
        }
        else if( operation.equals( "*" ) ) {
            result = secondary.mul(num1, num2);
            System.out.println( num1 + operation + num2 + "=" + result );
        }
        else if( operation.equals( "/" ) ) {
            result = secondary.div(num1, num2);
            System.out.println( num1 + operation + num2 + "=" + result );
        }
        else {
            System.out.println( "Opérateur non valide" );
        }
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

    public double sub(double a, double b) {
        return a - b;
    }
}



class Secondary {
    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if ( b == 0 ) {
            return 0;
        }
        return a / b;
    }
}