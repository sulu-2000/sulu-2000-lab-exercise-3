package Day12Book;

public class ConsDemo {
	public ConsDemo() {
		System.out.println("cons called.......");
	}
	public ConsDemo(int i) {
		System.out.println("overloaded cons called.......");
	}
	public ConsDemo(String s) {
		System.out.println("string constructor called.......");
	}
	public ConsDemo(int s, String str) {
		System.out.println("multi parameter constructor called.......");
	}
	public static void main(String[] args) {
		ConsDemo obj1=new ConsDemo(100,"hello");
		ConsDemo obj2=new ConsDemo();
		obj1.met();
		obj1.met(1);
	}
	void met() {
		System.out.println("method without parameter called.....");
	}
	void met(int i) {
		System.out.println("method with parameter called.....");
	}
}
