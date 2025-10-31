void main()
{
	double basic,da,ta,hra;
	printf("Enter basic salary: ");
	scanf("%lf",&basic);
	if(basic<=5000)
	{
		da = 0.10*basic;
		ta = 0.20*basic;
		hra = 0.25*basic;
        printf("Total salary: %.2lf",da+ta+hra+basic);
	}
	else
	{
		da = 0.15*basic;
		ta = 0.25*basic;
		hra = 0.30*basic;
        printf("Total salary: %.2lf",da+ta+hra+basic);
		
	}
}