void main()
{
	int num;
	printf("enter the number: ");
	scanf("%d",&num);
	if(num%3==0&&num%5!=0)
		printf("%d is divisible by 3 but not by 5",num);
	else if(num%5==0&&num%3!=0)
		printf("%d is divisible by 5 but not by 3",num);
	else if(num%5==0&&num%3==0)
		printf("%d is divisible by both",num);
	else
		printf("%d isdivisible by both",num);
}