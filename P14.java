
public class P14{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car14 car1;
		car1 = new Car14();
		
		car1.setNum(1234);
		car1.setGas(20.5);

	}
}

	class Car14
	{
		int num;
		double gas;
	
	void setNum(int n)
	{
		num=n;
		System.out.println("車號是"+num);
		
	}
	void setGas(double g)
	{
		gas=g;
		System.out.println("汽油量是"+gas);
	
	}

	}