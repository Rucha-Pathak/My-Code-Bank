abstract class Employee
{ 
 int id;
 String name;
 double salary;
 
  Employee()
  {
     this.id =0;
     this.name = "not available";
     this.salary = 0.0;
  }

  Employee(int i,String s,double d)
  {
     this.id =i;
     this.name = s;
     this.salary = d;
  }

  void setId(int i)
 {
	this.id = i;
 }
  void setName(String s)
 {
 	this.name = s;
 }
  void setSalary(double d)
 {
   	this.salary = d;
 }
   int getId()
  {
       return this.id;
  }
  String getName()
  {
	return this.name;
  }
  double getSalary()
  {
  	return this.salary;  
  }
  void display()
 {
 	System.out.println("Id : "+this.id);
 	System.out.println("Name : " +this.name);
 	System.out.println("Salary : "+this.salary);
 }
 abstract double calSal();
}//class Employee ends here

class SalesManager extends Employee
{
    double incentive;
    int target;
 
     SalesManager()
    {
         super();
	this.incentive = 0.0;
	this.target = 0;
    }
    SalesManager(int i, String s,double d,double inc, int t)
   {  
       super(i,s,d);
	this.incentive  = inc;
	this.target = t;
    }

   void setIncentive(double inc)
  {
	this.incentive = inc;
  }
  void setTarget(int t)
  {
  	this.target = t;
  }
  double getIncentive()
 {
	return this.incentive;
  }
  int getTarget()
 {
	return this.target;
 }
  void display()
  {
    super.display();
     System.out.println("Incentive: "+this.incentive);
     System.out.println("Target : "+this.target);
  }
  double calSal()
  {
 	return this.salary+this.incentive;
  }
}//class salesmanager ends here

class Admin extends Employee
{
   double allowance;
   
    Admin()
    {
  	super();
	this.allowance = 0.0;
    }
   Admin(int i,String s, double d,double a)
  {
 	super(i,s,d);
	this.allowance = a;
  }
  
   void setAllowance(double a)
  {
 	this.allowance = a;
  }
  double getAllowance()
  {
        return this.allowance;
  }
  void display()
  {
      super.display();
 	System.out.println("Allowance : "+this.allowance);
  }
  double calSal()
  {
	return this.salary+this.allowance;
  }
}//class Admin ends here

class Hr extends Employee
{
   double commission;
   Hr()
   {
  	super();
	this.commission = 0.0;
   }
   Hr(int i,String s,double d,double c)
  {
	super(i,s,d);
	this.commission = c;
  }
   void setCommission (double c)
  {
	this.commission = c;
   }
   double getCommission()
  {
	return this.commission;
   }
  void display()
  {
	super.display();
	System.out.println("Commission : "+this.commission);
  }
  double calSal()
 {
	return this.salary+this.commission;
  }
}//class Hr ends here 

class TestEmployee
{
  public static void main(String[] args)
  {
      Employee e;
	e = new SalesManager(101,"sachin",40000,4000,60);
	e.display();
	System.out.println("Calculated salary :" +e.calSal());
	System.out.println();

  	e = new Admin(102,"rucha",70000,7000);
	e.display();
	System.out.println("Calculated salary :" +e.calSal());
	System.out.println();

	e = new Hr(103,"riya",50000,5000);
	e.display();
	System.out.println("Calculated salary :" +e.calSal());
	System.out.println();
   }
}