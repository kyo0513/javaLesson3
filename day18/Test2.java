import java.util.*;
public class Test2{
	public static void main(String[] args){
		int hp=0;
		int mp=0;
		int pow=0;
		int dex=0;
		int agi=0;
		int[] status = new int[5];
		String[] params = {"体力","魔力","パワー","器用さ","すばやさ"}; 

		String[] tribesname ={"人間",
			                    "ハイエルフ",
													"トロル",
													"ノーム"};
		String[] jobs =      {"戦士",
			                    "盗賊",
													"僧侶",
													"魔術師"};

		System.out.print("名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		int seed = calcseed(name);     //seed値決め
		Random rmd = new Random(seed);
		hp = rmd.nextInt(100)+1; //HP
		mp = rmd.nextInt(100)+1; //MP
		pow = rmd.nextInt(50)+1; //pow
		dex = rmd.nextInt(50)+1; //dex
		agi = rmd.nextInt(50)+1; //agi

		System.out.println("初期ステータスが決定しました");
		status(params,hp,mp,pow,dex,agi);

		System.out.print("種族を選んでください0:人間 1:ハイエルフ 2:トロル 3:ノーム>");
		int tribes = new Scanner(System.in).nextInt();
		switch(tribes){
			case 0:
				hp += 10;
				mp += 10;
				pow += 10;
				dex += 10;
				agi += 10;
				break;
			case 1:
				mp += 20;
				agi += 20;
				break;
			case 2:
				hp += 30;
				pow += 20;
				break;
			case 3:
				hp += 10;
				dex += 25;
				agi += 20;
				break;
		}
		System.out.printf("%sのボーナスが適用されました！%n",tribesname[tribes]);
		status(params,hp,mp,pow,dex,agi);

		System.out.print("職業を選んでください0:戦士 1:盗賊 2:僧侶 3:魔術師>");
		int job = new Scanner(System.in).nextInt();
		switch(job){
			case 0:
				hp  *= 1.6;
				pow *= 1.4;
				break;
			case 1:
				hp  *= 1.1;
				pow *= 1.2;
				dex *= 1.3;
				agi *= 1.3;
				break;
			case 2:
				hp  *= 1.3;
				mp  *= 1.5;
				pow *= 1.1;
				break;
			case 3:
				mp  *= 1.9;
				agi *= 1.1;
				break;
		}
		System.out.printf("%sのボーナスが適用されました！%n",jobs[tribes]);
		status(params,hp,mp,pow,dex,agi);

		System.out.println("***作成成功！***");
		System.out.printf("私は%sの%s、%sです。%n",
				tribesname[tribes],jobs[job],name);
		System.out.printf("能力値を(%d)を高い順に並べると",hp+mp+pow+dex+agi);
	}
	static void status(String[] arr, int hp,int mp,int pow,int dex,int agi){
		System.out.printf("[%s:%d %s:%d %s:%d %s:%d %s:%d]%n",
				arr[0],hp,
				arr[1],mp,
				arr[2],pow,
				arr[3],dex,
				arr[4],agi);
	}
	static int calcseed(String name){
		int seed=0;
		for(int i=0;i<name.length();i++){
			seed += name.charAt(i);
		}
		return seed;
	}
	static void first(int seed,int[]arr){
		Random rmd = new Random(seed);
		for(int i=0;i<arr.length;i++){
			arr[i]= rmd.nextint(arr[i])+1;
		}
	}
}
