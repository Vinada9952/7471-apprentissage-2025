import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Basic basic = new Basic();
    Input input = new Input();
    System.out.println("Addition ou Soustraction (entrez la première lettre)");
    String choix_de_reponse = input.letters();
    if( choix_de_reponse.equals("a") ){
      System.out.println("Quel est votre premier nombre?");
      double premier_terme = input.numbers();
      System.out.println("Quel est le deuxième nombre?");
      double deuxieme_terme = input.numbers();
      double resultat = basic.addition(premier_terme, deuxieme_terme);
      System.out.println("Le résultat est:"+resultat);
    }
    else if(choix_de_reponse.equals("s")){
      System.out.println("Quel est votre premier nombre?");
      double premier_terme = input.numbers();
      System.out.println("Quel est le deuxième nombre?");
      double deuxieme_terme = input.numbers();
      double resultat = basic.soustraction(premier_terme, deuxieme_terme);
      System.out.println("Le résultat est:"+resultat);
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
  public double addition(double a, double b) {
    double c=a+b;
    return c;
  }
  public double soustraction(double a, double b){
    double c = a-b;
    return c;
  }
}