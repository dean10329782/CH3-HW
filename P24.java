
public class P24{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car24 car1;
		car1 = new Car24();
		car1.setNumGas(425, 10.5);
		System.out.println("指變更車號");
		car1.setNum(1234);
		car1.show();
		
		System.out.println("指變更汽油量");
		car1.setGas(20.5);
		car1.show();
	}
}

	class Car24
	{
		int num;
		double gas;
	public void setNumGas(int n , double g)
	{
		num=n;
		gas=g;
		System.out.println("車號是"+num+"汽油"+gas);
	}
	public void setNum(int n)
	{
		num=n;
		System.out.println("車號是"+num);
		
	}
	public void setGas(double g)
	{
		gas=g;
		System.out.println("汽油量是"+gas);
	
	}
	public void show()
	{
		System.out.print("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	}