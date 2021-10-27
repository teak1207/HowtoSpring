package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {



	/*
	 * returnObj�� '���ε� ����'��� �Ѵ�. ���ε� ������ ����Ͻ� �޼ҵ尡 ������ ������� ���ε��� �������� ����ϸ�, � ����
	 * ���ϵ��� �𸣱� ������ Object Ÿ������ �����Ѵ�.
	 */
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning="returnObj")
	public void AfterLog(JoinPoint jp, Object returnObj) {

		String method = jp.getSignature().getName();

		if (returnObj instanceof UserVO) {

			UserVO user = (UserVO) returnObj;

			if (user.getRole().equals("admin")) {
				System.out.println(user.getName() + "�α���(Admin)");
			}
		}
		System.out.println("[���� ó��]" + method + "() �޼ҵ� ���ϰ� : " + returnObj.toString());
	}

}
