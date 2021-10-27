package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {
	
	@Around("allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {

		String method = pjp.getSignature().getName();

		StopWatch stopwatch = new StopWatch();
		stopwatch.start();

		Object returnObj = pjp.proceed();

		stopwatch.stop();
		System.out.println(method + "() �޼��� ���࿡ �ɸ� �ð� : " + stopwatch.getTotalTimeMillis() + "(ms)��");

		return returnObj;
	}
}
