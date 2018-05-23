package ConfigurationJavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
		MyColor color = (MyColor) context.getBean("myColorBean");
		color.printColor();

	}

}
