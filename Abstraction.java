abstract class Display {
	void show() {
		System.out.println("The Method Belongs to abstract class..");
	}
}
class ChildDisplay extends Display {
 
}
class Test {
	public static void main(String args[]) {
		ChildDisplay obj=new ChildDisplay();
		obj.show();
	}
}