package EmployeeSalaryManagementService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ApiEmployeeDataService implements EmployeeDataService {
	
	private int[] salary = {2700, 3000, 4500, 2900,3300};
	
	
	public int[] retrieveData() {
		return salary;
	}
}
