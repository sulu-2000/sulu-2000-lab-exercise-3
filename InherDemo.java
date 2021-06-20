package Day12Book;

public class InherDemo {
	public static void main(String[] args) {
	Employee p=new Engineer();
	Engineer q=new Engineer();
	p.met(2);
	q.met(2);
	
	}

}
class Human{
	public void blabla() {
		System.out.println(" bla bla method is called.....");
	}
}
class Employee extends Human{
	public int met(int i) {
		System.out.println("met method of employee is called....");
		return i;
	}
}
class Engineer extends Employee{
	public int met(int i) {
		System.out.println("engineer met method is called ....");
		super.met(4);
		super.blabla();
		return i;
	}
}
class Attender extends Employee{
	
}