package polymorphism;

//@Component("sony")
public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> Sony °´Ã¼ »ý¼º");
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
