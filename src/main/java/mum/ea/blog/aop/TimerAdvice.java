package mum.ea.blog.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAdvice {

	private static final Logger LOGGER = Logger.getLogger(TimerAdvice.class);

	@Around("execution(* mum.ea.blog.service.*.*(..))")
	public Object profile(ProceedingJoinPoint call) throws Throwable {
		StopWatch clock = new StopWatch("timer");

		clock.start(call.toShortString());
		Object object = call.proceed();
		clock.stop();

		LOGGER.info(clock.prettyPrint());
		return object;
	}
}