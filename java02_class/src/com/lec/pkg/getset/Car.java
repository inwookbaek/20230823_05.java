package com.lec.pkg.getset;

public class Car {

	private int speed = 0;
	private boolean stop = false;
	
	private void setSpeed() {
		System.out.println("자동차가 " + this.speed + "km 로 달립니다!");
	}

	public void setSpeed(int speed) {
		this.stop = false;
		if(speed > 100) {
			System.out.println("현재 도로의 제한속도는 100km 넘을 수가 없습니다!");
			speed = 100;
			System.out.println("자동차가 " + speed + "km 로 달립니다!");			
		} else if (speed < 0) {
			this.stop = true;
			System.out.println("운행중지!!!!");
		} else {
			System.out.println("자동차가 " + speed + "km 로 달립니다!");			
		}
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public Boolean isStop() {
		return this.stop;
	}
}
