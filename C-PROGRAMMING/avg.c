void main()
{
	float a1,a2,a3,a4,a5;
	printf("Enter 5 numbers:");
	scanf("%f%f%f%f%f",&a1,&a2,&a3,&a4,&a5);
	float avg = (a1+a2+a3+a4+a5)/5;
	printf("Average of five numbers: %.2f",avg);
}