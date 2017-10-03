import java.util.Scanner;
public class Paire{
  public static void main(String[] args]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un nombre : ");
    int nombre = sc.nextInt();
    int result;
    for(int i=1; i<=nombre; i++){
      result *= i;
    }
    System.out.println("Factorielle de "+nombre+" est : "+result); 
  }
}
