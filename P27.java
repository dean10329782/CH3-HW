
public class P27{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car27 car1;
		car1 = new Car27();
		car1.show();
		
		Car27 car2 ;
		car2= new Car27(1234, 20.5);
		car2.show();
	}
}

	class Car27
	{
		private int num;
		private double gas;
	
		public Car27()
		{
			num = 0;
			gas= 0;
			System.out.print("生產車子");
		}
		public Car27(int n, double g)
		{
			num=n;
			gas=g;
			System.out.println("生產了車號"+num+"汽油量"+gas);
		}
		public void show()
		{
			System.out.println("車號是"+this.num);
			System.out.println("汽油量是"+this.gas);
		}
	}