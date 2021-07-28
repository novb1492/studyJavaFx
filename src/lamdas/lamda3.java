package lamdas;

interface lam3{
	void lamd();
}

public class lamda3 {

	public static void main(String[] args) {
		lam3 lam3=new lam3() {
			@Override
			public void lamd() {
				System.out.println("¤©");
				
			}
		};
		lam3.lamd();
	}

}
