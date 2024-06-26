abstract class Arithmatic {
	abstract void show();
}
class add extends Arithmatic {
	void show(){
		int a = 3;
		int b = 4;
		System.out.println(a + b);
	}
}
class sub extends Arithmatic {
	void show(){
		int c = 4;
		int d = 5;
		System.out.println(c - d);
	}
}
class Test {
	public static void main(String args[]){
		Arithmatic n = new add();
		n.show();
		Arithmatic y = new sub();
		y.show();
	}
}