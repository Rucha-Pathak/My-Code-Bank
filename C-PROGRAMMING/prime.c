void main()
{
	int n,flag=0;
	printf("enter the number: ");
	scanf("%d",&n);
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag++;
			break;
		}
	}	
	flag==0?printf("%d is  prime",n):printf("%d is not prime",n);
	
}