void main()
{
	int min;
	printf("Enter total minutes: ");
	scanf("%d",&min);
	int rmin = min%60;
	int hr = min/60;
	printf("%d min in new format is %d hr : %d min",min,hr,rmin);
}