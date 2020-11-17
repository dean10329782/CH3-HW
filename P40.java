import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("輸入的字串");
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		System.out.println("輸入藥新增的字串");
		String str2 = br.readLine();
		
		StringBuffer sb=new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println("add "+str2+" at the back of "+str1+"will be "+sb);
	}
	
}