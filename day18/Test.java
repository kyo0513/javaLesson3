import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.print("何人>>");
		int num = new Scanner(System.in).nextInt();
		System.out.print("何回振る>>");
		int play = new Scanner(System.in).nextInt();

		int[][] games = new int[num][play];
		int[] total = new int[num];
		for(int i=0;i<games.length;i++){
			int sum=0;
			for(int j=0;j<games[i].length;j++){
				games[i][j] = new Random().nextInt(6)+1;
				sum += games[i][j];
			}
			total[i] = sum;
		}
		for(int i=0;i<games.length;i++){
			System.out.printf("%dさん:",i+1);//暫定名前を数字
			System.out.print(Arrays.toString(games[i]));
			System.out.printf(" 合計:%d%n",total[i]);
		}
		winner(total);
	}
	static void winner(int[] arr){
		boolean drow = true;
		int winner = 0;
		int judgment = arr[0];
		for(int i=1;i<arr.length;i++){
			if(judgment != arr[i]){
				drow = false;
				break;
			}
		}
		if(drow){
			System.out.println("引き分け");
		}else{
			System.out.println("引き分け");
		}
	}
}
