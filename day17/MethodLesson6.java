import java.util.*;
public class MethodLesson6{
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
			System.out.print(c);
			}
		System.out.println();
		}
	}
	public static void main(String[] args){
		//String word="";
		//int Width;
		System.out.print("一文字いれてください>");
		String word = new Scanner(System.in).nextLine();
		char word2 = word.charAt(0);
		System.out.print("幅を入れてください>");
		int Width = new Scanner(System.in).nextInt();
		printSquare(word2,Width);
		//scan.close();  ひらいたメソッドのクローズ
	}
}
