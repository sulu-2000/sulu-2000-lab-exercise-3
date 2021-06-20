package Day12Book;

public class StringExample8 {

	public static void main(String[] args) {
		System.out.printf("Floating point number with 3 decimal digits: %.3f\n",1.21312939123);
		System.out.printf("Floating point number with 8 decimal digits: %.8f\n",1.21312939123);
		System.out.printf("String: %s, integer: %06d, float: %.6f","hello world",89,9.234535);
		String s=String.format("String: %s,integer: %d,float: %.6f","hello world",89,9.234535);
		System.out.println("\n"+s);
		System.out.printf("%-12s%-12s%s\n","column 1","column 2","column 2");
		System.out.printf("%-12.5s%s","hello world","world");
	}

}
