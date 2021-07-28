package lamdas;

interface lamex2{
	public void lam();
}
class lamclass2 implements lamex2{
	@Override
	public void lam() {
		System.out.println("±¸Çö");
	}
}
public class lamda2 {
	public static void main(String[] args) {
		lamex2 lamex2= new lamclass2();
		lamex2.lam();
	}
}
