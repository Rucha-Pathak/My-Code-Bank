void main()
{
	int a,b;
	printf("Enter two numbers: ");
	scanf("%d%d",&a,&b);
	printf("\nNumbers before swappying: %d , %d",a,b);
	int temp = a;
	a = b ;
	b=  temp;
	printf("\nNumbers after swappying %d,  %d",a,b);
	
}