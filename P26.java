
public class P26{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car26 car1;
		car1 = new Car26();
		
		car1.show();

	}
}

	class Car26
	{
		private int num;
		private double gas;
	
		public Car26()
		{
			num = 0;
			gas= 0;
			System.out.print("生產車子");
		}
		public void show()
		{
			System.out.print("車號是"+this.num);
			System.out.println("汽油量是"+this.gas);
		}
	}