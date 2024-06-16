import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Employee{
	private int employeeId;
	private String employeeName;
	private int employeeSalary;

	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public Employee() {

	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]\n";
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}

public class demo1 {
	public static void main(String[] args) {
		int choice;
		List<Employee> employeeDetails = new ArrayList<Employee>();
		System.out.println(" ");
		System.out.println("         _____________ WELCOME TO EMPLOYEE MANAGEMENT SYSTEM  _____________  ");
		System.out.println(" ");
		do {
			System.out.println("*******************************************************************************");
			System.out.println("\nMENU: ");
			System.out.println(" 1. INSERT");
			System.out.println(" 2. DISPLAY");
			System.out.println(" 3. SEARCH");
			System.out.println(" 4. UPDATE");
			System.out.println(" 5. DELETE");
			System.out.println(" 6. STOP");
			System.out.println("\n_____________ Enter Your Choice _____________ ");
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter Employee ID");
			int employeeId = sc.nextInt();
			System.out.println("Enter Employee Name");
			String employeeName = sc1.nextLine();
			System.out.println("Enter Employee Salary");
			int employeeSalary = sc.nextInt();
			Employee tempEmployee = new Employee(employeeId,employeeName,employeeSalary);
			employeeDetails.add(tempEmployee);
			System.out.println(" ");
			break;
			
			case 2:Iterator<Employee> itr1 = employeeDetails.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			break;
			case 3:boolean found = false;
			System.out.println("_____________  Enter Employee ID to be Searched _____________ ");
			int employeeId1 = sc.nextInt();
			Iterator<Employee> itr2 = employeeDetails.iterator();
			while(itr2.hasNext()) {
				Employee e = itr2.next();
				if(employeeId1 == e.getEmployeeId()){
					found = true;
					System.out.println(e);
					System.out.println(" ");
					break;
				}
			}
			if(found == false) {
				System.out.println("Employee Details Not Found");
				System.out.println(" ");
			}
			break;

			case 4:boolean found2 = false;
			System.out.println("_____________ Enter Employee ID to be Updated _____________ ");
			int employeeId3 = sc.nextInt();
			ListIterator<Employee> itr4 = employeeDetails.listIterator();
			while(itr4.hasNext()) {
				Employee e = itr4.next();
				if(employeeId3 == e.getEmployeeId()){
					found2 = true;
					System.out.println("Enter the updated employee name");
					String employeeName2 = sc1.nextLine();
					System.out.println("Enter the updated employee salary");
					int employeeSalary2 = sc.nextInt();
					Employee e1 = new Employee(employeeId3,employeeName2,employeeSalary2); 
					itr4.set(e1);
					System.out.println(" ");
					break;
				}
			}
			if(found2 == false) {
				System.out.println("Employee Details Not Found");
				System.out.println(" ");
			}
			break;

			case 5:
				boolean found1 = false;
				System.out.println("_____________ Enter Employee ID to be Deleted _____________ ");
				int employeeId2 = sc.nextInt();
				Iterator<Employee> itr3 = employeeDetails.iterator();
				while(itr3.hasNext()) {
					Employee e = itr3.next();
					if(employeeId2 == e.getEmployeeId()){
						found1 = true;
						employeeDetails.remove(e);
						System.out.println(" ");
						break;
					}
				}
				if(found1 == false) {
					System.out.println("Employee Details Not Found");
					System.out.println(" ");
				}

				break;
			case 6:System.out.println("****************************** Thank You ******************************");
			//default:
			}
		}while(choice!= 6);
	}
}


















