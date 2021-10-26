package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		// 스프링 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicaionContext.xml");
		// 2.스프링 컨테이너로부터 UserServiceImpl 객체를 LookUP한다
		UserService userservice = (UserService) container.getBean("userService");
		// 3. 로그인 기능 테스트
		UserVO vo = new UserVO();
		vo.setId("test123");
		vo.setPassword("test123");

		UserVO user = userservice.getUser(vo);
	
		if (user != null) {
			System.out.println(user.getName() + "님 환영합니다");
		} else {
			System.out.println("로그인실패");
		}

		container.close();
	}
}
