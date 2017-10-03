import java.util.Scanner;
public class Paire{
  public static void main(String[] args]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un nombre : ");
    int nombre = sc.nextInt();
    if(nombre%2==0){
      System.out.println("Ce nombre est paire");
    }
    else{
    System.out.println("Ce nombre est impaire");
    }
  }
}
