package Day12Book;

public class Service108 {
	void help(Police p) {
		System.out.println("the caller is a police man...let connect with with control room");	
	}
	void help(AccidentVictim a) {
		System.out.println("the caller is a accident victim...let connect with with doctor");	
	}
	void help(Helper h) {
		System.out.println("the caller is a helper...let connect with with him");	
	}
	public static void main(String[] args) {
	Service108 obj108=new Service108();
	Police captain=new Police();
	AccidentVictim ac= new AccidentVictim();
	Helper rama=new Helper();
	obj108.help(captain);
	obj108.help(ac);
	obj108.help(rama);
	}
}
class Police{
	
}
class AccidentVictim{
	
}
class Helper{
	
}