package ConfigurationXMLBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBasedDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XmlBasedContext.xml");

		Employee employee = ctx.getBean(Employee.class);
		System.out.println(employee);

		Operations operations = ctx.getBean(Operations.class);
		operations.helloWorld();

	}

}
