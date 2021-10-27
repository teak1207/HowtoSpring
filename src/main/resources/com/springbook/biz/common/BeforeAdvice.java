package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect  // ����Ʈ�� + �����̽� ��Ʈ
public class BeforeAdvice {

	@Before("PointcutCommon.allPointcut()")
	public void BeforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();

		System.out.println("=====[���� ó��][����Ͻ� ���� ���� �� ����]=====");
		System.out.println(method + "===>" + args[0].toString());

	}

}
