
public class P51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car51[] car1;
		car1= new Car51[3];
		
		for(int i=0;i<3;i++)
		{
			car1[i]=new Car51();
		}
		car1[0].setCar(1234, 54.5);
		car1[1].setCar(154, 48.5);
		car1[2].setCar(124, 85.5);
		for(int i=0;i<3;i++)
		{
			car1[i].show();
		}
	}
}
class Car51
{
	private int num;
	private double gas;
	
	public Car51()
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