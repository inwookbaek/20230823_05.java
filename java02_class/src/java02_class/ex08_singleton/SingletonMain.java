package java02_class.ex08_singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton calendar1 = Singleton.getInstance();
		Singleton calendar2 = Singleton.getInstance();
		Singleton calendar3 = Singleton.getInstance();
		Singleton calendar4 = Singleton.getInstance();
		Singleton calendar5 = Singleton.getInstance();
		Singleton calendar6 = Singleton.getInstance();
		Singleton calendar7 = Singleton.getInstance();

		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(calendar1.hashCode());
		System.out.println(calendar7.hashCode());

	}
}
