public class Rpg2{
	public static void main(String[] args){
    String name="村人";
		int gold=10000;
		System.out.println(name+"よ死んでしまうとは情けない");
		System.out.println("生き返るためには１０００G必要です");
		gold = gold;
		System.out.println("この状態から生き返りますか？→  はい");
		gold = gold - 1500;
		System.out.println(name+"「何かおかしくないですか？」");
	}
}
