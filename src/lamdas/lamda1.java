package lamdas;

interface lamex1{
	public void lam();
}
class lamclass implements lamex1{
	@Override
	public void lam() {
		System.out.println("±¸Çö");
	}
}
public class lamda1 {
	public static void main(String[] args) {
		lamclass lamclass=new lamclass();
		lamclass.lam();
	}
}
