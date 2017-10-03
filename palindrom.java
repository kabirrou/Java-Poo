import java.util.Scanner;
 class palindrom{

    public palindrom(String s){
           char[] tab = s.toCharArray();
    }
    public void isPalindrome (char tab[],String s){
        int x=0;
        int y=s.length() - 1;
        while (y>x && tab[x]==tab[y]){
            x++;
            if (tab[x]==''){
             x++;
            }
           y--;
            if (tab[y]==''){
             y--;
            }
        }
        if (y<=x)
            System.out.println("votre chaine est palindrome");
        else
            System.out.println("votre chaine n'est pas palindrome");
    }

}
public  class Main {
    public static void main (String argv []){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println("la chaine de caractére que vous avez introduit est:"+s);
    char[] tab = s.toCharArray();
    palindrom m=new palindrom(s);
    m.isPalindrome (tab,s);
    }
}
