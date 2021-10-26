package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {

	public void BeforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();

		System.out.println("*******[사전 처리][비즈니스 로직 수행 전 동작] ********");
		System.out.println(method + "<><> " + args[0].toString());

	}

}
