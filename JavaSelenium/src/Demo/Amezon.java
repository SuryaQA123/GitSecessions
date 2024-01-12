package Demo;

public class Amezon {
	public static void main(String[] args) {
System.out.println("this is from GIT X");
		funA();
		funC();
		Amezon a1 = new Amezon();

	}
public void funB() {
	System.out.println("Fun B");
}
	public static void funA() {
		
	}
	
	public static  void funC() {
		System.out.println("Fun C invoked Successfully");
		funA();
	}
	public static  void funD() {
		System.out.println("Fun C invoked Successfully");
	}

}
