package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person("Chau", 21, 1.7f);
		byte b = 20;
		a.setAge(b);
		System.out.println(a.getAge());
		short c = 21;
		a.setAge(c);
		System.out.println(a.getAge());
		int d = 22;
		a.setAge(d);
		System.out.println(a.getAge());
		long e = 23;
		a.setAge(e);
		System.out.println(a.getAge());
	
	}

}
