package inheritance;

public class MultilevelInheritanceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne1 child = new ChildOne1();
		child.parent1();
		child.parent2();
		child.printInfo();
		child.guardian();
	}

}

interface ParentOne1{
	
	public void printInfo();
	public void parent1();
}

interface ParentTwo2{
	
	public void printInfo();
	public void parent2();
}

interface Guardian extends ParentOne1, ParentTwo2{	
	
	public void printInfo();
	public void guardian();
}

class ChildOne1 implements Guardian{

	@Override
	public void parent1() {
		// TODO Auto-generated method stub
		System.out.println("This is parent 1 from child class...");
	}

	@Override
	public void parent2() {
		// TODO Auto-generated method stub
		System.out.println("This is parent 2 from child class...");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is print info from child class...");
	}

	@Override
	public void guardian() {
		// TODO Auto-generated method stub
		System.out.println("This is guardian method....");
	}
	
}