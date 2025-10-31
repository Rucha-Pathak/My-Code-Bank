void main()
{
	int a,b;
	
	char c;
	printf("Enter the operator +/-/*/ / /%: ");
	scanf("%c",&c);
	printf("enter the two numbers: ");
	scanf("%d%d",&a,&b);
	
	if(c=='+')
		printf("%d ",a+b);
	else if(c=='-')
		printf("%d ",a-b);
	else if(c=='*')
		printf("%d ",a*b);
	else if(c=='/')
		printf("%d ",a/b);
	else if(c=='%')
		printf("%d ",a%b);
	else
		printf("Wrong operator!");
}