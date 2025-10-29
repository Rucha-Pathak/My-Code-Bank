import java.util.Scanner;

public class Swap
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.printf("Two numbers before swappying: "+ a+" " + b);
	int temp  = a;
	a = b;
	b  = temp;
	System.out.printf("\nTwo numbers after swappying: "+a+" " +b);
  }
}
	
