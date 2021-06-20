package Day12Book;

public class PbvPbr {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.setSize(10);
		System.out.println("Intial size of laddu....:"+laddu.getSize());
		
		PBV pbvObj=new PBV();
		pbvObj.modifySizeOfLaddu(laddu.size);
		System.out.println("size of Laddu after PBV...:"+laddu.getSize());
		
		PBR pbrObj=new PBR();
		pbrObj.modifySizeOfLaddu(laddu);
		System.out.println("size of Laddu after PBV...:"+laddu.getSize());
		
	}
}
class PBV{
	public void modifySizeOfLaddu(int size) {
		size=size-5;
	}
}
class PBR{
	public void modifySizeOfLaddu(Laddu laddu) {
		laddu.setSize(5);
	}
}
class Laddu{
	int size;
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return this.size;
	}
}