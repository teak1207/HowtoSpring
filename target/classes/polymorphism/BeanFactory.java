package polymorphism;

public class BeanFactory {

	public Object getBean(String beanName) {

		if (beanName == "Samsung") {

			return new SamsungTV_01();  // �̰� ����Ʈ��
			
		} else if (beanName == "LG") {

			return new LgTV();
		}
		return null;
	}
}
