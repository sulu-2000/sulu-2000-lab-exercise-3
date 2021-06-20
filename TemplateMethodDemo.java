package Day12Book;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		Sangeetha sangeethaHotel=new NewSangeethaRestaurant();
		sangeethaHotel.process();
		
	}
}
abstract class Sangeetha{
	public final void uniform() {
		System.out.println("uniform defined by sangeetha...");
	}
	public final void serve() {
		System.out.println("sangeetha defined how to serve...");
	}
	public abstract void makeIdly();
	public final void createIdlyPlate() {
		System.out.println("sangeetha defined how to create a idly plate...");
	}
	public final void charge() {
		System.out.println("sangeetha defined how to charge...");
	}
	public final void process() {
		uniform();
		makeIdly();
		createIdlyPlate();
		serve();
		charge();
	}
}
class NewSangeethaRestaurant extends Sangeetha{
	@Override
	public void makeIdly() {
		System.out.println("my grandma amkes the idly in my hotel....");
	}
}