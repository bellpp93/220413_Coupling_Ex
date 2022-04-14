package com.company.coupling;

public class SamsungTV {
	// 메소드 시그니처 이름이 다르다(Sample1 방식) 즉, 결합도가 강하다
	public void powerOn() {
		System.out.println("SamsungTV ===> 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV ===> 전원 끈다.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV ===> 소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV ===> 소리 내린다.");
	}
}
