package ConstructorWithCollectionList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuesTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationConstructorContext.xml");
		Questions q = (Questions)ac.getBean("question");
		q.displayInfo();

	}

}
