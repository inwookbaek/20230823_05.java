package com.lec.ex02_noname;

public interface RemoteControl {

	int MIN_VOLUMN = 0;
	int MAX_VOLUMN = 10;
	
	void turnOn();
	void turnOff();
	void setVolumn(int volumn);
}
//
//class Television implements RemoteControl {
//
//	public void turnOn() {}
//	public void turnOff() {}
//	public void setVolumn(int volumn) {}
//	
//}
//
//class Audio implements RemoteControl {
//
//	public void turnOn() {}
//	public void turnOff() {}
//	public void setVolumn(int volumn) {}
//	
// }