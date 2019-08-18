package apim.github.tutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCode {

	public static void main(String args[]) {
		test1();
	}

	private static void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		Instrumentalist inst = (Instrumentalist) ctx.getBean("instrumentalist");
		inst.sing();
		ctx.close();
	}

}