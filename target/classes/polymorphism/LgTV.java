package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	@Autowired	// 按眉啊 狼粮己 林涝等促
	private Speaker speaker;

	public LgTV() {
		super();
		System.out.println("===> LG TV 按眉 积己");

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
