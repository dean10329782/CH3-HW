public class P28{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car28 car1;
		car1 = new Car28();
		car1.show();
		
		Car28 car2 ;
		car2= new Car28(1234, 20.5);
		car2.show();
	}
}

	class Car28
	{
		private int num;
		private double gas;
	
		public Car28()
		{
	
			num = 0;
			gas= 0;
			System.out.println("生產車子");
		}
		public Car28(int n, double g)
		{
			this();
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