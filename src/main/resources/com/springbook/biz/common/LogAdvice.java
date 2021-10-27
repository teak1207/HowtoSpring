package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // @Pointcut + advice
public class LogAdvice {

	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))") // 포인트컷
	public void allPointcut() {
	}

	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {
	}

	@Before("allPointcut()") // 어드바이스
	public void printLog() {
		System.out.println("=========[공통로그][비즈니스 로직 수행 전 동작]=========");
	}
	/*
	 * com.springbook.biz..*Impl 이것들을 실행하면 -> allPointcut() 타는데 -> printLog()가 먼저
	 * 실행(before)니깐!!
	 */

}
