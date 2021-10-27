package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect  // 포인트컷 + 어드바이스 세트
public class BeforeAdvice {

	@Before("PointcutCommon.allPointcut()")
	public void BeforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();

		System.out.println("=====[사전 처리][비즈니스 로직 수행 전 동작]=====");
		System.out.println(method + "===>" + args[0].toString());

	}

}
