
public class P15{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15 car1;
		car1 = new Car15();
		
		int number =1234;
		double Gas =20.5;
		car1.setNumGas(number,Gas);
	}
}

	class Car15
	{
		int num;
		double gas;
	
	void setNumGas(int n, double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號"+num+"將汽油"+gas);
		
	}


	}