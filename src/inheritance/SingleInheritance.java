package inheritance;

public class SingleInheritance {

	// this is example of single inheritance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent paret = new Parent();
		paret.printParentInfo();
		
		Parent parentOne = new Child();
		parentOne.printParentInfo();
		
		Child child = new Child();
		child.printParentInfo();
		child.printChildInfo();
	}

}

class Parent{
	
	public void printParentInfo() {
		System.out.println("This is parent class....");
	}
}

class Child extends Parent{
	
	public void printChildInfo() {
		
		System.out.println("This is Child class...");
	}
}
