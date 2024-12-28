package EmployeeSalaryManagementService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class EmployeeSalaryManagementServiceLauncherApp {

	public static void main(String[] args) {
		try(var context = 
			new	AnnotationConfigApplicationContext(EmployeeSalaryManagementServiceLauncherApp.class)){
			int[] salaries = context.getBean(EmployeeDataService.class).retrieveData();
			int maxSalary = context.getBean(SalaryCalculationService.class).findMax(salaries);
			System.out.println(maxSalary);
			
		}
		

	}

}
