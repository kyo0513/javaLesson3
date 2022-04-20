import java.util.*;
public class ListEx{
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("要素が追加するよ数字を入れてね(0で終了)>>");
			int input = sc.nextInt();
			if(input ==0) break;
			nums.add(input);
			System.out.printf("%dをListに追加したよ%n",input);
		}
		System.out.println("--結果--");
		System.out.printf("要素数:%d%n",nums.size());
		System.out.printf("要素:%s%n",nums);  //System.outを行うと文字列化される
		//System.out.printf("要素:%s%n",nums.toString());
	}
}
