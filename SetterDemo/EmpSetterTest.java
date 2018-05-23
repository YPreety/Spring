package SetterDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpSetterTest {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("applicationSetterContext.xml");
		BeanFactory f = new XmlBeanFactory(r);
		EmployeeSetterBean eb = (EmployeeSetterBean)f.getBean("employeeSetterBean");
		eb.display();

	}

}
