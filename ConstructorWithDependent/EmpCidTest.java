package ConstructorWithDependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import SetterDemo.EmployeeSetterBean;

public class EmpCidTest {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationConstructorContext.xml");
		BeanFactory f = new XmlBeanFactory(r);
		EmployeeCIDBean eb = (EmployeeCIDBean)f.getBean("employeeCidBean");
        eb.display();
	}

}
