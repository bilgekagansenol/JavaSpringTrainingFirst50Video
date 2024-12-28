package EmployeeSalaryManagementService;

import org.springframework.stereotype.Component;

@Component
public class SalaryCalculationService {

	public int findMax (int[] arr) {
		int x = arr[0];
		int i  = 0;
		while (i < arr.length) {
			if (arr[i]>x) {
				x = arr[i];
				i++;
			}
			else i++;
		}
		return x;
	}
}
