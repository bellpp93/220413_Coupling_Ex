package com.company.coupling;

/*
 * 실행 클래스 => main() 메소드가 포함된 클래스
 */
public class TVUser {

	public static void main(String[] args) {
		
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
