
public class P47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car47 car1;
		car1= new Car47();
		car1.show();
		int number= 1243;
		double gasonline= 10.5;
		String str="一號車";
		car1.setCar(number, gasonline);
		car1.setName(str);
		
		car1.show();
	}

}
class Car47
{
	private int num;
	private double gas;
	private String name;
	public Car47()
	{
		num = 0;
		gas= 0;
		name= "No name";
		System.out.println("生產車子");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設定"+num+"汽油量設"+gas);
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("車名是"+name);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
}