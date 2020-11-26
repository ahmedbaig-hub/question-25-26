
public class apple implements fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
apple ob=new apple();
ob.isPoisonous();
ob.isSweet();
	}

	@Override
	public void isSweet() {
		// TODO Auto-generated method stub
		System.out.println("is sweet");
	}

	@Override
	public void isPoisonous() {
		// TODO Auto-generated method stub
		System.out.println("not poisonous");
	}

}
