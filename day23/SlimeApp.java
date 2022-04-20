import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		ArrayList<Slime> slimes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("スライムを追加する?(1..yes,2..no)>>");
			int input = sc.nextInt();
			if(input ==2) break;
			System.out.print("追加するスライムの名前を決めてね");
			String name = sc.next();
			Slime slime = new Slime(name);
			slimes.add(slime);
		}
		for(Slime s:slimes){
			s.attack();
		}
	}
}
class Slime{      //ファイル内なら追加でクラス記載可能publicはつけない
	String name;
	Slime(String name){
		this.name=name;
		System.out.printf("%sが現れた！%n",this.name);
	}
	void attack(){
		System.out.printf("%sの攻撃:5ポイントのダメージを与えた%n",this.name);
	}
}
