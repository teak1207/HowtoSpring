package polymorphism;

//@Component("sony")
public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> Sony ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("Sony Volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Sony Volume Down");

	}

}
