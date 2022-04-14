package com.company.coupling.polymorphism;

/*
 * 해당 클래스를 '구현 클래스'라 한다.
 */
public class SamsungTV implements TV {
	// 메소드 시그니처가 동일

	@Override  // => 어노테이션
	public void powerOn() {
		System.out.println("SamsungTV ===> 전원을 켠다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV ===> 볼륨을 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV ===> 볼륨을 내린다.");
	}

	@Override
	public void powerDown() {
		System.out.println("SamsungTV ===> 전원을 끈다.");
	}
}
