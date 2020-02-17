import java.util.*;

public class Employee{
	
	//Values to Initialize
	private static String firstName;
	private static String lastName;
	private static double monthlySalary;
	
	//Set and Get for each value.
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		Employee.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		Employee.lastName = lastName;
	}
	public static double getMonthlySalary() {
		return monthlySalary;
	}
	public static void setMonthlySalary(double monthlySalary) {
		Employee.monthlySalary = monthlySalary;
	}
	
	
	public static void main(String args[]) {
		//Employee Testing Method.
		EmployeeTest();
	}
	
	
	public static void EmployeeTest()
	{
			//Scanners for user input.
			Scanner getVar = new Scanner(System.in);
			Scanner input = new Scanner(System.in);
			
			//Arrays to hold final values.
			String[] employeeNameArr = new String[100];
			double[] employeeSalArr = new double[100];
			
			//Variable for user choice.
			int choice;
			
			//Loop the menu until exit.
			while(true)
			{
				//Creating the menu.
				System.out.println("1. Create employee\n2. Give Employee 10% Raise\n3. Display Employees\n4. Exit");
				
				System.out.print("Enter a choice: ");
				choice = input.nextInt();
				
				switch(choice)
				{
				/*CREATE EMPLOYEE: ASKS FOR USERS NAME AND MONTHLY SALARY
				 				CONVERTS THE MONTHLY SALARY TO YEARLY SALARY
				 				ENSURES THAT THE EMPLOYEE IS PAYED.*/
				case 1:
				{
					//Setting Employee's First Name
					System.out.print("Enter Employee's First Name: ");
					String fName = getVar.next();
					setFirstName(fName);
					
					//Setting Employee's Last Name
					System.out.print("Enter Employee's Last Name: ");
					String lName = getVar.next();
					setLastName(lName);
					
					//Setting Employee's Monthly Salary
					while(true) {
						System.out.print("Enter the Employee's MONTHLY Salary: ");
						double createSal = getVar.nextDouble()*12;
					
						//Making Sure the Employee is Paid Properly
						if(createSal<=0) {
							System.out.println("Invalid Salary");
						}
						else{
							setMonthlySalary(createSal);
							
							//Pushes the names and values into an array.
							for(int i = 0; i <= employeeNameArr.length; i++)
							{
								if(employeeNameArr[i] == null)
								{
									employeeNameArr[i] =  getFirstName() + " " + getLastName();
									employeeSalArr[i] = getMonthlySalary();
									break;
								}
							}
							break;
						}
					}
					break;
				}
				/*GIVE EMPLOYES 10% RAISE: ADDS 10% TO THE MONTHLY SALARY
				 						ALLOWS USER TO CHOOSE EMPLOYEE FROM LIST
				 						MAKES SURE THERE IS AT LEAST ONE EMPLOYEE*/	
				case 2:
				{
					
					//Confirming that there is at least one employee
					if(employeeNameArr[0] == null)
					{
						System.out.println("There are currently no employees.\n");
						break;
					}
					
					//Listing each employee and their yearly salary (i+1 to avoid displaying 0)
					for(int i = 0; employeeNameArr[i] != null; i++)
					{
						System.out.println((i+1)+". "+employeeNameArr[i]);
						System.out.println("$"+employeeSalArr[i]+"\n");
					}
					
					//User inputs which employee gets the raise.
					System.out.print("Which employee should receive the raise? : ");
					int salChoice = getVar.nextInt();
					
					//Calculating the raise to the monthly salary
					employeeSalArr[salChoice-1] = (employeeSalArr[salChoice-1]/12) * .10 + employeeSalArr[salChoice-1]/12;
					//Converting monthly salary to yearly salary
					employeeSalArr[salChoice-1] = employeeSalArr[salChoice-1]*12;
					
					//Outputting new information.
					System.out.println("New yearly salary for " + employeeNameArr[salChoice-1] + ": " + employeeSalArr[salChoice-1] + "\n");
					
					break;
					
				}
				/*DISPLAY EMPLOYEES: MAKES SURE THERE IS AT LEAST ONE EMPLOYEE
				 * 					LISTS ALL AVAILABLE EMPLOYEES IN ORDER OF CREATION*/
				case 3:
				{
					
					if(employeeNameArr[0] == null)
					{
						System.out.println("There are currently no employees.\n");
						break;
					}
					
					//Displaying the employees 
					for(int i = 0; employeeNameArr[i] != null; i++)
					{
						System.out.println(employeeNameArr[i]);
						System.out.println("$"+employeeSalArr[i]+"\n");
					}
					break;
					
				}
				/*EXIT: EXITS THE PROGRAM
				 * 		FREES THE SCANNERS FROM MEMORY*/
				case 4:
				{
					System.out.println("Logging out...");
					input.close();
					getVar.close();
					System.exit(0);
				}
			}
		}
	}
}