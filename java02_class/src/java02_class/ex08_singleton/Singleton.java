package java02_class.ex08_singleton;

/*
	싱글톤(디자인패턴) - GoF 디자인패턴 참고
	
	프로그램에서 단 한개의 객체만 생성되도록 해야 하는 경우가 있는데
	객체가 단 한 개만 생성한다고 해서 이런 방법(패턴)을 Singleton패턴이라고 한다.
	
	싱글톤객체를 만드는 방법은
	
	1. 자신의 참조타입인 정적(static)필드를 선언하고 자신의 객체를 생성해서 초기화한다.
	   이 객체를 외부에서 직접접근하지 못하도록 private로 선언한다.
	2. 외부에서 생성자를 접근하지 못하도록 private을 선언한다.
	   접근을 제한하지 않는다면 생성자로 객체를 무한정 생산할 수 있게 된다.
*
*/
public class Singleton {

	private static Singleton singleton = new Singleton();
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}

