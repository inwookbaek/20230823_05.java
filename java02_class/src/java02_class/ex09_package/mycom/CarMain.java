package java02_class.ex09_package.mycom;

import java02_class.ex09_package.hankook.SnowTire;
import java02_class.ex09_package.hyundai.Engine;
import java02_class.ex09_package.kumho.BigWidthTire;

public class CarMain {

	public static void main(String[] args) {
			
		Engine engine = new Engine();
		java02_class.ex09_package.hankook.Tire front_left_tire 
			= new java02_class.ex09_package.hankook.Tire();
		java02_class.ex09_package.kumho.Tire back_left_tire 
			= new java02_class.ex09_package.kumho.Tire();
		
		// ctrl+shift+o : 일괄 import 단축키
		SnowTire front_right_tire = new SnowTire();
		BigWidthTire back_right_tire = new BigWidthTire();
		
	}

}
