package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {

	}

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		Scanner consoleInputReader = new Scanner(System.in);
		List<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		employeePayrollService.readEmployeeData(consoleInputReader);
		employeePayrollService.writeEmployeeData(consoleInputReader);
		consoleInputReader.close();
	}

	private void writeEmployeeData(Scanner consoleInputReader) {
		System.out.println("Writing Employee Payroll Data to Console\n" + employeePayrollList);
	}

	private void readEmployeeData(Scanner consoleInputReader) {
		System.out.println("Enter employee ID : ");
		int id = Integer.parseInt(consoleInputReader.nextLine());
		System.out.println("Enter employee Name : ");
		String name = consoleInputReader.nextLine();
		System.out.println("Enter employee Salary : ");
		double salary = Double.parseDouble(consoleInputReader.nextLine());
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
		employeePayrollList.add(new EmployeePayrollData(102, "Kohli", 5000000));

	}
}
