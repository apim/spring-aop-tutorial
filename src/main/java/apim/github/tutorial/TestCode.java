package apim.github.tutorial;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCode {

	public static void main(String args[]) {
		test1();
		test2();
	}

	private static void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		Instrumentalist inst = (Instrumentalist) ctx.getBean("instrumentalist");
		inst.sing();
		ctx.close();
	}

	private static void test2() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-annot.xml");
		InstrumentalistAnnot inst = (InstrumentalistAnnot) ctx.getBean("instrumentalistAnnot");
		inst.sing();
		inst.perform();
		try {
			inst.play();
		} catch (IOException e) {
		}
		inst.conduct();
		ctx.close();
	}

}