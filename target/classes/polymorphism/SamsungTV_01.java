package polymorphism;

public class SamsungTV_01 implements TV {

	private Speaker speaker;
	private int price;
//	private int test;


	// 기본생성자
	public SamsungTV_01() {
		System.out.println("===> samsungTV 객체 생성1");
		System.out.println("");
	}

	// 매개변수 1개 있는 생성자
	public SamsungTV_01(Speaker speaker) {
		System.out.println("===> samsungTV 객체 생성2");
		System.out.println("");
		this.speaker = speaker;
	}

	// 매개변수 2개 있는 생성자
	public SamsungTV_01(Speaker speaker, int price) {
		System.out.println("===> samsungTV 객체 생성3");
		this.speaker = speaker;
		this.price = price;
	}

	// 매개변수 2개 있는 생성자1
	public SamsungTV_01(int price, Speaker speaker) {
		System.out.println("===> samsungTV 객체 생성4");
		this.speaker = speaker;
		this.price = price;
	}

//-----------------------------------------------------------------	

//	public void initMethod() {
//		System.out.println("객체 초기화 작업 처리");
//	}
//
//	public void destroyMethod() {
//		System.out.println("객체 삭제 전에 처리할 로직처리");
//	}

//-----------------------------------------------------------------
	@Override
	public void powerOn() {
		System.out.println("samsung powerOn   " + price + "원");
	}

	@Override
	public void powerOff() {
		System.out.println("samsung powerOff");
	}

	@Override
	public void volumeUp() {
		// System.out.println("samsung volumeUp");
		// speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// System.out.println("samsung volumeDown");
		// speaker = new SonySpeaker();
		speaker.volumeDown();
	}
//-----------------------------------------------------------------
	//setter
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
//	public void setTest(int test) {
//		System.out.println("===> setTest() 호출");
//		this.test = test;
//	}

}
