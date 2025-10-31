void main()
{
	int start,end,sum=0;
	printf("Enter starting and ending: ");
	scanf("%d%d",&start,&end);
	for(int i=start;i<=end;i++)
		sum =sum+i;
	printf("Sum = %d",sum);
}