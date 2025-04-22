import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Input input = new Input();
    Basics basics = new Basics();
    System.out.println("Entrez votre premier nombre : ");
    double a = input.numbers();
    System.out.println("Quelle operation voulez-vous faire? 1. Addition(+) 2. Soustraction(-)");
    double choix = input.numbers();
    System.out.println("Entrez votre deuxieme nombre : ");
    double b = input.numbers();
    double c = 0;
    if( choix == 1 ){
      c = basics.add(a, b);
      System.out.println("Le résultat est " + c);
    }
    else if( choix == 2 ) {
      c = basics.moins(a, b);
      System.out.println("Le résultat est " + c);
    }
    else {
      System.out.println("operateur non-valide");
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



class Basics {
  public double add(double a, double b){
    double c = a + b;
    return c;
  }
  public double moins(double a, double b ){
    double c = a - b;
    return c;
  }
}