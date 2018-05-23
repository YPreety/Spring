package ApplicationContextDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanDemo.Student;

public class EmployeeDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("employeebean");
		emp.displayInfo();

	}

}
