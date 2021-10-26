package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {

	public void BeforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();

		System.out.println("*******[���� ó��][����Ͻ� ���� ���� �� ����] ********");
		System.out.println(method + "<><> " + args[0].toString());

	}

}
