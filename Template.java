import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Olivier edited this file and will make it something great");
    System.out.println("Olivier edited this file");
    System.out.println("Olivier edited this file again");
    System.out.println("Olivier edited this file again and again");
    System.out.println("Olivier edited this file again and again and again");
    System.out.println("Olivier edited this file again and again and again and again");
    System.out.println("Olivier edited this file again and again and again and again and again");
    System.out.println("Olivier edited this file again and again and again and again and again and again");

    
    System.out.println( "Olivier" );
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