import java.util.*;
public class Jyanken{
	public static void main(String[] args){
		/*
		 * 手を入力(グー：0,チョキ：1,パー：2)>>1
		 * あなたはチョキ、PCはパー
		 * あなたの勝ちです。
		 *
		 */
		int pc = new Random().nextInt(3);
		System.out.print("手を入力(グー：0,チョキ：1,パー：2)>> ");
		int you = new Scanner(System.in).nextInt();

		String pc2;   //自分の手
		String you2;  //PCの手

    if(you == 0){
			you2 = "グー";
		}else if(you == 1){
			you2 = "チョキ";
		}else
			you2 = "パー";{
			}

    if(pc == 0){
			pc2 = "グー";
		}else if(pc == 1){
			pc2 = "チョキ";
		}else
			pc2 = "パー";{
			}

		if( you == pc){
			System.out.println("あなたは" + you2 + " PCは"+ pc2);
			System.out.print(" あいこです");
		}else if(( you == 0 && pc == 2) ||
			      ( you == 1 && pc == 0) ||
						( you == 2 && pc == 1)){
			System.out.println("あなたは" + you2 + " PCは"+ pc2);
			System.out.print(" あなたの負けです");
		}else{
			System.out.println("あなたは" + you2 + " PCは"+ pc2);
			System.out.print(" あなたの勝ちです!");
		}
	}
}
