
public class P17{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car17 car1;
		car1 = new Car17();
		car1.setNumGas(1234,20.5);
		int number=car1.getnum();
		double gasonline= car1.getgas();
		System.out.println("將車號"+number+"將汽油"+gasonline);
	}
}

	class Car17
	{
		int num;
		double gas;
	
	void setNumGas(int n, double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號"+num+"將汽油"+gas);
		
	}
	int getnum()
	{
		System.out.println("調查車號");
		return num;
	}	
	double getgas()
	{
		System.out.println("調查汽油量");
		return gas;
	}

	}