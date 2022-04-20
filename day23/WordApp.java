import java.util.*;
import java.io.*;
public class WordApp{
	public static void main(String[] args) throws Exception{
		ArrayList<Word> list = new ArrayList<>();

		FileInputStream fis = new FileInputStream("qs.csv");
		InputStreamReader isr =
			new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line;
		while((line=br.readLine()) != null){
			String[] params=line.split(",");
			Word word = new Word(params[0],params[1]);
			list.add(word);
		}
		br.close();
		Scanner sc = new Scanner(System.in);
		for(Word w:list){
			System.out.print(w.ja+">>");
			String ans = sc.next();
			if(w.check(ans)){
				System.out.println("正解");
			}else{
				System.out.printf("はずれ、正解は%s%n",w.en);
			}
		}
		System.out.printf("全%d問中%d問正解%n",Word.total,Word.correct);
	}
}
class Word{
	static int total=0;
	static int correct=0;
	String ja;
	String en;
	Word(String ja,String en){
		this.ja=ja;
		this.en=en;
		total++;
	}
	boolean check(String ans){
		if(ans.equalsIgnoreCase(this.en)){
			correct++;
			return true;
		}
		return false;
	}
}
