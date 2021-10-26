package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		// ������ ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicaionContext.xml");
		// 2.������ �����̳ʷκ��� UserServiceImpl ��ü�� LookUP�Ѵ�
		UserService userservice = (UserService) container.getBean("userService");
		// 3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("test123");
		vo.setPassword("test123");

		UserVO user = userservice.getUser(vo);
	
		if (user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�");
		} else {
			System.out.println("�α��ν���");
		}

		container.close();
	}
}
