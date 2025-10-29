import java.util.Scanner;

class Temperature
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature in Celsius: ");
	double celsius = sc.nextDouble();
	double fahrenhit = (celsius*(9/5))+32;
	System.out.printf("Temperature in fahrenhit : "+fahrenhit);
 }
}