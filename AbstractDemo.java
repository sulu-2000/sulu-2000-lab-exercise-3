package Day12Book;

public class AbstractDemo {
	public static void main(String[] args) {
		new child();
	}

}
abstract class GrandParent{
	public abstract void met();
}
abstract class Parent extends GrandParent{
	final int i=10;
	public Parent() {
		System.out.println("abstract class parent cons called...");
	}
	public abstract void yoursSayHello();
	public void mySayHello(){
		System.out.println("saying hello as per the abstract class norms...");
	}
}
class child extends Parent{
	public void met() {}
	public child() {
		System.out.println("child class of abstract parent object created...");
	}
	@Override
	public void yoursSayHello() {
		System.out.println("say Hello as per the child logic..... or norms.....");
	}
	@Override
	public void mySayHello() {
		System.out.println("write my own logic.....");
	}
}