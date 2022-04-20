import java.util.*;
import java.io.*;
public class FileLesson{
	public static void main(String[] args) throws Exception{
		FileInputStream fis =
			new FileInputStream("sample.txt");
		InputStreamReader isr=
			new InputStreamReader(fis,"utf-8");
		BufferedReader br =
			new BufferedReader(isr);

		FileOutputStream fos= 
			new FileOutputStream("newsample2.txt");  //追記モードもある
			//new FileOutputStream("newsample.txt",true);  //追記モードもある
		OutputStreamWriter osw=
			new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw = new BufferedWriter(osw);

		String line;
		while((line = br.readLine()) !=null){
			System.out.println(line);
			bw.write("★"+line+"★");
			bw.newLine();  //改行
		}
		br.close();
		bw.close();
	}
}
