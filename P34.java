import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34 {
	public static void main(String[] args) throws IOException 
	{
		System.out.println("輸入的數字");
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		String st1 = br.readLine();
		int num = Integer.parseInt(st1);
		
		System.out.println("輸入的數字為"+num);
	}
	
}
