package polymorphism;

//@Component("apple")
public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("===> applespeaker ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("===> applespeaker �Ҹ� �ø���");
	}

	@Override
	public void volumeDown() {
		System.out.println("===> applespeaker �Ҹ� ������");
	}

}
