package com.company.coupling.polymorphism;

/*
 * 해당 클래스를 '구현 클래스'라 한다.
 * 이 프로그램의 두 가지 문제점
 * (1) SonySpeaker 객체가 쓸데없이 두 개나 생성되는 것이고
 * (2) 운영과정에서 SonySpeaker의 성능이 떨어져서 AppleSpeaker로 변경하고자 할 때,
 * 		volumeUp(), volumeDown() 두 개의 메소드를 모두 수정해야 한다.
 * [결론] 위의 두 가지 문제점을 해결하는 방법은 => DI를 적용!
 */
public class SamsungTV implements TV {
	// 추가 => 수정
	private Speaker speaker;	// Speaker 객체 참조변수
	private int price;			// 가격
	
	// 생성자
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	/*
	 * [중요***] 생성자 인젝션이란?
	 * 이전에는 개발자가 어떤 클래스의 객체가 필요하면 그 클래스의 생성자를 통해서 객체 생성 후
	 * 그 클래스의 메소드를 호출했다.
	 * 그러나 스프링 프레임워크는 스프링 환경 설정 파일인 applicationContext.xml에
	 * 객체를 <bean>에 등록 시켜 놓으면 스프링 컨테이너가 자동으로 객체를 생성하여 다른 클래스에서
	 * 어떤 클래스의 객체가 필요하면 생성자 인젝션을 통해서 주입(Injection) 시킨다.
	 */
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");		
		this.speaker = speaker;
		this.price = price;
	}

	// 메소드 시그니처가 동일

	@Override  // => 어노테이션
	public void powerOn() {
		System.out.println("SamsungTV ===> 전원을 켠다. (가격: " + price + "원" +")");
	}

	@Override
	public void volumeUp() {
		// speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// speaker = new SonySpeaker();
		speaker.volumeDown();
	}

	@Override
	public void powerDown() {
		System.out.println("SamsungTV ===> 전원을 끈다.");
	}
}
