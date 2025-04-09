package apprentissage;

import java.util.Scanner;

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