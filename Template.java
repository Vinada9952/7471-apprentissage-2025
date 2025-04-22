import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Input inputs = new Input();

   
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
class Basics {
  public double add(double a, double b){
    double c = a + b;
    return c;
  }
}