package apim.github.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCode {

	public static void main(String args[]) {
		test1();
		
	}

	private static void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-1.xml");
		//Customer c = (Customer) ctx.getBean("customer");
		//System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		ctx.close();
	}


}