
public class P46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car46 car1;
		car1 = new Car46();
		car1.setCar(1234, 20.5);
	
		System.out.println("宣告CAR2");
		Car46 car2;
	
		System.out.println("將CAR1指定給CAR2");
		car2=car1;
		
		car1=null;
		
		System.out.println("CAR2的");
		car2.show();
		
 }
}
class Car46
{
	private int num;
	private double gas;

	public Car46()
	{
		num = 0;
		gas= 0;
		System.out.println("生產車子");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設定"+num+"汽油量設"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
