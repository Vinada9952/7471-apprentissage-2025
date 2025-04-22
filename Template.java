import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Input input = new Input();
    Basics basics = new Basics();
    System.out.println("Entrez votre premier nombre : ");
    double a = input.numbers();
    System.out.println("Entrez votre deuxieme nombre : ");
    double b = input.numbers();
    double c = basics.add(a, b);
    System.out.println("Le résultat est " + c);
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