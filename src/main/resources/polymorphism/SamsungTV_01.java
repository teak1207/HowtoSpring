package polymorphism;

public class SamsungTV_01 implements TV {

	private Speaker speaker;
	private int price;
//	private int test;


	// �⺻������
	public SamsungTV_01() {
		System.out.println("===> samsungTV ��ü ����1");
		System.out.println("");
	}

	// �Ű����� 1�� �ִ� ������
	public SamsungTV_01(Speaker speaker) {
		System.out.println("===> samsungTV ��ü ����2");
		System.out.println("");
		this.speaker = speaker;
	}

	// �Ű����� 2�� �ִ� ������
	public SamsungTV_01(Speaker speaker, int price) {
		System.out.println("===> samsungTV ��ü ����3");
		this.speaker = speaker;
		this.price = price;
	}

	// �Ű����� 2�� �ִ� ������1
	public SamsungTV_01(int price, Speaker speaker) {
		System.out.println("===> samsungTV ��ü ����4");
		this.speaker = speaker;
		this.price = price;
	}

//-----------------------------------------------------------------	

//	public void initMethod() {
//		System.out.println("��ü �ʱ�ȭ �۾� ó��");
//	}
//
//	public void destroyMethod() {
//		System.out.println("��ü ���� ���� ó���� ����ó��");
//	}

//-----------------------------------------------------------------
	@Override
	public void powerOn() {
		System.out.println("samsung powerOn   " + price + "��");
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
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}
//	public void setTest(int test) {
//		System.out.println("===> setTest() ȣ��");
//		this.test = test;
//	}

}
