
public class PoisonBerry implements fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PoisonBerry ob=new PoisonBerry();
ob.isPoisonous();
ob.isSweet();
	}

	@Override
	public void isSweet() {
		// TODO Auto-generated method stub
		System.out.println("not sweet");
	}

	@Override
	public void isPoisonous() {
		// TODO Auto-generated method stub
		System.out.println("its poisonous");
	}

}
