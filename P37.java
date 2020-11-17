import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P37{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("輸入的英文");
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		String st1 = br.readLine();
	
		String stru=st1.toUpperCase();
		String strl= st1.toLowerCase();
		
		System.out.println("大寫是"+stru);
		System.out.println("小寫是"+strl);
	}
	
}
