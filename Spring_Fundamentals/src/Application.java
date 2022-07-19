import java.util.List;

import com.Amadi.training.salesmanager.model.Employee;
import com.Amadi.training.salesmanager.service.EmployeeService;
import com.Amadi.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee:employees) {
			System.out.println(employee.getEmployeeName()+ " at "+ employee.getEmployeeLocation());
		}

	}

}
