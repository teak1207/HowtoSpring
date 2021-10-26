package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	@Autowired	// ��ü�� ������ ���Եȴ�
	private Speaker speaker;

	public LgTV() {
		super();
		System.out.println("===> LG TV ��ü ����");

	}

	@Override
	public void powerOn() {
		System.out.println("LG powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
