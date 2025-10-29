import java.util.Scanner;
class Area
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius: ");
	double radius = sc.nextDouble();
	double area = 3.14*radius*radius;
	System.out.println("area of circle is :"+area);
 }
}
	