
public class P22{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car22 car1;
		car1 = new Car22();
		
		car1.setNumGas(1234,20.5);
		car1.show();

		car1.setNumGas(3254, -10);
		car1.show();
		
	}
}

	class Car22
	{
		int num;
		double gas;
	void setNumGas(int n, double g)
		{
		if(g>0 && g<100)
		{		
			num=n;
			gas=g;
			System.out.println("將車號"+num+"將汽油"+gas);
			
		}
		else
		{
			System.out.println(g+"不是正確數字");
			System.out.println("無法作變更");
		}
		}
	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}}