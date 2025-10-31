void main()
{
	int s1,s2,s3;
	printf("Enter the three side of triangle: ");
	scanf("%d%d%d",&s1,&s2,&s3);
	
	if(s1==s2&&s2==s3)
		printf("Triangle is equilateral triangle");
	else if(s1==s2||s2==s3||s3==s1)
		printf("Triangle is isosceles");
	else
		printf("Triangle is scalene");
}