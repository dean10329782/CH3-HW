
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr car1;
		car1 = new Carr();
		
		Carr car2;
		car2 = new Carr();
		
		car1.num= 1234;
		car1.gas= 200.5;
		
		car2.num= 3214;
		car2.gas= 21.5;
				
		System.out.println("1.車號是"+car1.num);
		System.out.println("1.汽油量是"+car1.gas);
		
		System.out.println("2.車號是"+car2.num);
		System.out.println("2.汽油量是"+car2.gas);
		
		
	}
}

	class Carr
	{
		int num;
		double gas;
	}
