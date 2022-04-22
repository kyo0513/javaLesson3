import java.util.*;
public class OfficeApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random  rmd= new Random();
		OfficeWorker[] wokers = new OfficeWorker[3];
		System.out.println("あなたの部下に3人配属されました");

		for(int i=0;i<wokers.length;i++){   //3人の情報登録
			System.out.printf("%d人目の名前を入力してください>",i+1);
			String input = sc.next();
			int no = rmd.nextInt(3);
			switch(no){
				case 0:
					wokers[i]=new OrdinaryOfficeWorker(input); 
					break;
				case 1:
					wokers[i]=new EliteOfficeWorker(input); 
					break;
				case 2:
					wokers[i]=new LazyOfficeWorker(input); 
					break;
			}
		}
		while(true){   //働きぶり確認　 メニュー表示
			System.out.println("誰の働きぶりをみにいきますか?");
			for(int i=0;i<wokers.length;i++){
				System.out.printf("%d・・・%s%n",i,wokers[i].name);
			}
			System.out.println("3・・・終了");
			System.out.println("番号を入力してください>");
			int select = sc.nextInt();
			switch(select){  //働きぶりの確認　選択
				case 0:
				case 1:
				case 2:
					wokers[select].work(); 
					break;
				case 3:
					System.out.println("アプリケーションを終了します");
					return;
				default:
					System.out.println("入力エラー");
			}
		}
	}
}
abstract class OfficeWorker{
	String name;
	public OfficeWorker(String name){
		this.name=name;
		introduce();
	}
	public void introduce(){
		System.out.println("はじめまして、私は" +this.name +"です");
	};
	public abstract void work();
}
class OrdinaryOfficeWorker extends OfficeWorker{
	public OrdinaryOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは9時から5時まで働いている。遅刻や欠勤はない%n",
				this.name);
	}
}
class EliteOfficeWorker extends OfficeWorker{
	public EliteOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは仕事が早い！しかも正確だ。%n",this.name);
	}
}
class LazyOfficeWorker extends OfficeWorker{
	public LazyOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sはPCの画面を即座に切り替えた何をしていたのだろう%n",
				this.name);
	}
}
