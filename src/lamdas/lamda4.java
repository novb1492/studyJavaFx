package lamdas;

interface lam4{
	void lam(Object object);
}
public class lamda4 {

	public static void main(String[] args) {
		lam4 lam4=(data)->System.out.println("lamda4"+data);
		lam4.lam(1);
		lam4=(data)->{
			System.out.println("1"+data);
			System.out.println("2"+data);
		};
		lam4.lam(2);
	}

}
