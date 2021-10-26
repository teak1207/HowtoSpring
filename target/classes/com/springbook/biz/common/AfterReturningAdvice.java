package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterReturningAdvice {
	/*
	 * returnObj를 '바인드 변수'라고 한다. 바인드 변수는 비즈니스 메소드가 리턴한 결과값을 바인딩할 목적으로 사용하며, 어떤 값이
	 * 리턴될지 모르기 때문에 Object 타입으로 선언한다.
	 */
	public void AfterLog(JoinPoint jp, Object returnObj) {

		String method = jp.getSignature().getName();

		if (returnObj instanceof UserVO) {

			UserVO user = (UserVO) returnObj;

			if (user.getRole().equals("admin")) {
				System.out.println(user.getName() + "로그인(Admin)");
			}
		}
		System.out.println("[사후 처리]" + method + "() 메소드 리턴값 : " + returnObj.toString());
	}

}
