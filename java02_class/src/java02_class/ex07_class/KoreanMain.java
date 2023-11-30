package java02_class.ex07_class;

public class KoreanMain {

	public static void main(String[] args) {
		
		System.out.println(Korean.nation);
		
		Korean sonny = new Korean("손흥민", "990101-1234567");
		System.out.println(sonny.toString());
		sonny.nation = "영국";
		System.out.println(Korean.nation + "=" + sonny.nation);
		sonny.sayHello();
		System.out.println();
		
		Korean minjae = new Korean("김민재", "010101-1234567");
		System.out.println(minjae.toString());		

		Korean kangin = new Korean("이강인", "020101-1234567");
		System.out.println(kangin.toString());
	}

}
