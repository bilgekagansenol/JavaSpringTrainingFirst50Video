package EmployeeSalaryManagementService;

import org.springframework.stereotype.Component;

@Component
public class CsvEmployeeDataService implements EmployeeDataService {
	
	private int[] salary = {2500, 3200, 4000, 3100, 2800};
	
	
	public int[] retrieveData() {
		return salary;
	}
}
