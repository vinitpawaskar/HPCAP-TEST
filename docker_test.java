import java.util.Scanner;
public class docker_test{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
//      int a = 10;
//      int b = 15;

      System.out.println("Addition is: "+(a+b)+".\n");
      System.out.println("Subtraction is: "+(a-b)+".\n");
      System.out.println("Multiplication is: "+(a*b)+".\n");
      System.out.println("Division is: "+(a/b)+".\n");

  }
}
