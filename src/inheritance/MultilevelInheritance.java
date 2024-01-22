package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent grandParent = new GrandParent();
		grandParent.printGrandParentInfo();
		
		ParentOne parentOne = new ParentOne();
		parentOne.printGrandParentInfo();
		parentOne.printParentOneInfo();
		
		ChildOne childOne = new ChildOne();
		childOne.printGrandParentInfo();
		childOne.printParentOneInfo();
		
		ChildOne childTwo = new ChildOne();
		childTwo.printChildOneInfo();
	}

}

class GrandParent{
	
	public void printGrandParentInfo() {
		
		System.out.println("This is grand parent class..");
	}
}

class ParentOne extends GrandParent {
	
	public void printParentOneInfo() {
		System.out.println("This is Parent class");
	}
}

class ChildOne extends ParentOne{
	
	public void printChildOneInfo() {
		
		System.out.println("This is Parent one class...");
	}
}
