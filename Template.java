import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Input inputs = new Input();

    System.out.print( "Name : " );
    String name = inputs.letters();
    System.out.print( "what is your âge ? " );
    double age = inputs.numbers();
    System.out.println( name + ", Your are " + age + " years old" );
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