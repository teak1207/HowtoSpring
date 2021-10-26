package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUSer {

	public static void main(String[] args) {
		
		// 1. spring �����̳ʸ� �����Ѵ�
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicaionContext.xml");
		// 2. spring �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.
		TV tv1 = (TV) factory.getBean("tv");

		tv1.powerOn();
		System.out.println("");
		tv1.volumeUp();
		System.out.println("");
		tv1.volumeDown();
		System.out.println("");
		tv1.powerOff();
		
		factory.close();
	
	}
}
