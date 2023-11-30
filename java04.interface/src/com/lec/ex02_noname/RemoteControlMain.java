package com.lec.ex02_noname;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		// 익명구현객체를 생성
		RemoteControl tv = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolumn(int volumn) {}
		};
		
		RemoteControl audio = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolumn(int volumn) {}
		};
		
		RemoteControl speaker = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolumn(int volumn) {}
		};

	}

}
