package SetterWithDependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class EmployeeSIDTest {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationSetterContext.xml");
		BeanFactory f = new XmlBeanFactory(r);
		EmployeeSIDBean eb = (EmployeeSIDBean)f.getBean("employeeSidBean");
        eb.display();

	}

}
