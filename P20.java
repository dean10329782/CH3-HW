
public class P20{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car20 car1;
		car1 = new Car20();
		
		car1.num= 1234;
		car1.gas= -20;

		car1.show();
		
		
		
	}
}

	class Car20
	{
		int num;
		double gas;
	
	void show()
	{
		System.out.println("2.車號是"+this.num);
		System.out.println("2.汽油量是"+this.gas);
	}}