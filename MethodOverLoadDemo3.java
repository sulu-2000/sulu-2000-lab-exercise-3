package Day12Book;

public class MethodOverLoadDemo3 {
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println("value of x: "+s.disp(5));
		System.out.println("value of y: "+s.disp1((int) 6.5));
	}
}
class Sample{
	int disp(int x) {
		return x;
	}
	double disp1(int y) {
		return y;
	}
}