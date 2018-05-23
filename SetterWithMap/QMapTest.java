package SetterWithMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class QMapTest {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationSetterContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Question q = (Question) factory.getBean("queMap");
		q.displayInfo();

	}

}
