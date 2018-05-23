package ConstructorDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpConstructorTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationConstructorContext.xml");
		EmployeeConBean eb = (EmployeeConBean)ac.getBean("employeeConBean");
		eb.display();

	}

}
