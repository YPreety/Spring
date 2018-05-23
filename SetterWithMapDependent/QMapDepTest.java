package SetterWithMapDependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class QMapDepTest {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationSetterContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Question q = (Question) factory.getBean("qMapDep");
		q.displayInfo();

	}

}
