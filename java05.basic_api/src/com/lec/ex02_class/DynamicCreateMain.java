package com.lec.ex02_class;

public class DynamicCreateMain {

	public static void main(String[] args) throws Exception {
		
		boolean type = true;
		Class _class;
		
		if(!type) {
			_class = Class.forName("com.lec.ex02_class.SendAction");
		} else {
			_class = Class.forName("com.lec.ex02_class.ReceiveAction");			
		}
		// Class.newInstance()을 이용하면 new 객체생성자 없이도 객체를 생성가능
		Action action = (Action) _class.newInstance(); // 동적으로 객체생성
		action.execute();
	}

}

interface Action { void execute(); }

class SendAction implements Action {
	public void execute() { System.out.println("문자를 보냅니다!"); }
}

class ReceiveAction implements Action {
	public void execute() { System.out.println("문자를 받습니다!"); }
}