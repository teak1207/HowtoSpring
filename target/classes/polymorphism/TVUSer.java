package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUSer {

	public static void main(String[] args) {
		
		// 1. spring 컨테이너를 구동한다
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicaionContext.xml");
		// 2. spring 컨테이너로부터 필요한 객체를 요청한다.
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
