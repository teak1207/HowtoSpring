package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // @Pointcut + advice
public class LogAdvice {

	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))") // ����Ʈ��
	public void allPointcut() {
	}

	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {
	}

	@Before("allPointcut()") // �����̽�
	public void printLog() {
		System.out.println("=========[����α�][����Ͻ� ���� ���� �� ����]=========");
	}
	/*
	 * com.springbook.biz..*Impl �̰͵��� �����ϸ� -> allPointcut() Ÿ�µ� -> printLog()�� ����
	 * ����(before)�ϱ�!!
	 */

}
