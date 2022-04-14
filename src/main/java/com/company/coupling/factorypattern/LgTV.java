package com.company.coupling.factorypattern;

public class LgTV implements TV {
	// 메소드 시그니처가 동일

	@Override
	public void powerOn() {
		System.out.println("LgTV ===> 전원을 켠다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV ===> 볼륨을 올린다.");		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV ===> 볼륨을 내린다.");				
	}

	@Override
	public void powerDown() {
		System.out.println("LgTV ===> 전원을 끈다.");		
	}

}
