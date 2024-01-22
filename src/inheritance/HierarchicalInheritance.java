package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentTwo parentTwo = new ParentTwo();
		parentTwo.printParentTwoInfo();
		parentTwo.show();
		
		System.out.println("==============================================================");
		
		ChildA a = new ChildA();
		a.printParentTwoInfo();
		a.printChildAInfo();
		a.show();
		//super.show() => you cannot use super here
		
		System.out.println("==============================================================");
		
		ChildB b = new ChildB();
		b.printParentTwoInfo();
		b.printChildBInfo();
		b.show();
		
		System.out.println("==============================================================");
		
		ChildC c = new ChildC();
		c.printParentTwoInfo();
		c.printChildCInfo();
		c.show();
	}

}

class ParentTwo{
	
	public void printParentTwoInfo() {
		System.out.println("This is parent two class");
	}
	
	public void show() {
		System.out.println("This is a show() method from parent two class.");
	}
}

class ChildA extends ParentTwo{
	
	public void printChildAInfo() {
		System.out.println("This is Child A class");
	}
	
	public void show() {
		//super.show(); => you can call super class show here.
		System.out.println("This is a show() method from child A class.");
	}
}

class ChildB extends ParentTwo{
	
	public void printChildBInfo() {
		System.out.println("This is child B class");
	}
	
	public void show() {
		System.out.println("This is a show() method from child B class.");
	}
}

class ChildC extends ParentTwo{
	
	public void printChildCInfo() {
		System.out.println("This is child c class");
	}
	
	public void show() {
		System.out.println("This is a show() method from child C class.");
	}
}




