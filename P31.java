public class P31{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car31.showsum();
		Car31 car1;
		car1 = new Car31();
		car1.setNumGas(1234, 28.5);
		
		Car31.showsum();
		Car31 car2 ;
		car2= new Car31();
		car2.setNumGas(4567, 21.6);
		Car31.showsum();
	}
}

	class Car31
	{
		public static int sum=0;
		private int num;
		private double gas;
	
		public Car31()
		{
	
			num = 0;
			gas= 0;
			sum++;
			System.out.println("生產車子");
		}
		public void setNumGas(int n, double g)
		{
			num=n;
			gas=g;
			System.out.println("生產了車號"+num+"汽油量"+gas);
		}
		public static void showsum()
		{
			System.out.println("生產了"+sum+"台");
		}
		public void show()
		{
			System.out.println("車號是"+this.num);
			System.out.println("汽油量是"+this.gas);
		}
	}