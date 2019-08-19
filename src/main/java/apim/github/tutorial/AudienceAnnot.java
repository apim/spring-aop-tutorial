package apim.github.tutorial;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AudienceAnnot {

	@Before("execution(* apim.github.tutorial.InstrumentalistAnnot.sing())")
	public void takeSeat() {
		System.out.println("Taking seats");
	}

	@Before("execution(* apim.github.tutorial.InstrumentalistAnnot.sing())")
	public void switchOffPhone(JoinPoint jp) {
		System.out.println("Switching off mobile phones. Method intercepted: " + jp.getSignature().getName());
	}

	@After("execution(* apim.github.tutorial.InstrumentalistAnnot.sing())")
	public void lightsOn() {
		System.out.println("Lights are on for audience");
	}

	@AfterReturning(pointcut = "execution(* apim.github.tutorial.InstrumentalistAnnot.perform())", returning = "val")
	public void applaud(Object val) {
		System.out.println("Praising. Intercepted method returned: " + val);
	}

	@AfterThrowing(pointcut = "execution(* apim.github.tutorial.InstrumentalistAnnot.play())", throwing = "ex")
	public void demandRefund(Throwable ex) {
		System.out.println("Demanding refund. Exception message: " + ex.getMessage());
	}

	@Around("execution(* apim.github.tutorial.InstrumentalistAnnot.conduct())")
	public void manage(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around advice before method: " + pjp.getSignature().getName());
		pjp.proceed();
		System.out.println("Around advice after method execution");
	}

}
