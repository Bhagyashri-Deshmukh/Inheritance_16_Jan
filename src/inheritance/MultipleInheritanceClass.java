package inheritance;

public class MultipleInheritanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.show();
	}

}

class A{
	
	public void printClassAInfo() {
		System.out.println("This is class A info...");
	}
	
	public void show() {
		System.out.println("This is show() from class A");
	}
}

class B{
	
	public void printClassBInfo() {
		System.out.println("This is class B info....");
	}
	
	public void show() {
		System.out.println("This is show() from class B");
	}
}

class C extends A{
	
	public void printClassCInfo() {
		System.out.println("This is class C info...");
	}
}