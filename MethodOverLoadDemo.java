package Day12Book;

public class MethodOverLoadDemo {
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.multiply();
		obj.multiply(5);
		obj.multiply(2.5f);
	}

}
class Calculate
{
public void multiply()
{
	System.out.println("No Parameter Method Called");
}
public int multiply(int number)
{
	int result=number*number;
	System.out.println(("Mwthod with Integer Argument Called:"+result));
	return result;
}
public float multiply(float number)
{
	float result=number*number;
	System.out.println("Method with float Argument Called:"+result);
	return result;
}
}
