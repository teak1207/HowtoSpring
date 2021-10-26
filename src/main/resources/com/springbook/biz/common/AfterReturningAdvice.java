package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterReturningAdvice {
	/*
	 * returnObj�� '���ε� ����'��� �Ѵ�. ���ε� ������ ����Ͻ� �޼ҵ尡 ������ ������� ���ε��� �������� ����ϸ�, � ����
	 * ���ϵ��� �𸣱� ������ Object Ÿ������ �����Ѵ�.
	 */
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
