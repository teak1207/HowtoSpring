package polymorphism;

public class BeanFactory {

	public Object getBean(String beanName) {

		if (beanName == "Samsung") {

			return new SamsungTV_01();  // 이거 포인트네
			
		} else if (beanName == "LG") {

			return new LgTV();
		}
		return null;
	}
}
