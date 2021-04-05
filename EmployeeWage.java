Welcome to Employee Wage Computation Program
public class EmployeeWage 
{
public static void main(String[] args) 
	{
		//Constants
		int IS_FULL_TIME = 1;
		int EMP_PER_RATE_HOUR = 20;

		//Variables
		int empHrs=0;
		int empWage=0;

		//Computation and full time
		double empCheck = Math.floor(Math.random() *10)%2;
		if(empCheck == IS_FULL_TIME)
			empHrs=8;
		else
			empHrs=0;

		empWage = empHrs * EMP_PER_RATE_HOUR;
		System.out.println("Employee wage = "+empWage);
	}


}
