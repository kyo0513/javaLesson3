import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 * さいころを振ってそれが偶数か奇数かを判定する
		 * (実行結果)
		 * 4は偶数です。
		 * 1は奇数です。
		 */
		int sai = new Random().nextInt(6) +1 ;
		/*if (( sai == 1) ||
			  ( sai == 3) ||
			  ( sai == 5)){
			System.out.print(sai + "は奇数です");
		}else{
			System.out.print(sai + "は偶数です");
		}
    */
		
    if(sai % 2 == 0){
			System.out.print(sai + "は偶数です");
		}else
			System.out.print(sai + "は奇数です");

	}
}
