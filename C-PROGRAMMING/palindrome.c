void main()
{
	int num;
	printf("enter 3 digit number: ");
	scanf("%d",&num);
	if(num%10==num/100)
		printf("%d is palindrome",num);
	else
		printf("%d is not palindrome",num);
}