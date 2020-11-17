
public class P11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car1;
		car1 = new Car1();
		
		
		
		car1.num= 1234;
		car1.gas= 200.5;
		
	
		car1.show();
		car1.show();
		
	}
}

	class Car1
	{
		int num;
		double gas;
	
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}