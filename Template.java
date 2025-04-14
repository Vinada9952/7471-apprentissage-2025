import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Basic basic = new Basic();
    Secondary secondary =new Secondary();
    Input input = new Input();
    while(true){
      
      System.out.println("Addition, Soustraction, Multiplication ou Division (entrez la première lettre)");
      String choix_de_reponse = input.letters().toLowerCase();
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
      else if(choix_de_reponse.equals("m")){
        System.out.println("Quel est votre premier nombre?");
        double premier_terme = input.numbers();
        System.out.println("Quel est le deuxième nombre?");
        double deuxieme_terme = input.numbers();
        double resultat = secondary.multiplication(premier_terme, deuxieme_terme);
        System.out.println("Le résultat est:"+resultat);
      }
      else if(choix_de_reponse.equals("d")){
        System.out.println("Quel est votre nombre à diviser?");
        double premier_terme = input.numbers();
        System.out.println("Par quoi voulez-vous le diviser?");
        double deuxieme_terme = input.numbers();
        double resultat = secondary.division(premier_terme, premier_terme);
        System.out.println("Le résultat est:"+resultat);
      }

      System.out.println("Voulez-vous effectuer un autre calcul?");
      String confirmation = input.letters().toLowerCase();
      if(confirmation.equals("non")){
        break;
      }
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


class Secondary {
  public double multiplication(double a, double b){
    double c=a*b;
    return c;
  }
  public double division(double a, double b){
    if(b == 0) {
      return 0;
    }
    double c=a/b;
    return c;
  }

}