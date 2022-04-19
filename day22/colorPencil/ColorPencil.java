import java.util.*;
public class ColorPencil{
	//static field(静的変数orクラス変数)
	static int totalDraw=0;    //メモリ空間に１つだけ存在 ColorPencil.totalDrawでアクセス可
	String color;
	int length;
	//ColorPencil(String color){
	//	this(color,5);
	//}
	ColorPencil(String color,int length){
		this.color=color;
		this.length=length;
		this.showStatus();
	}
	void showStatus(){
		System.out.print(this.color+":");
		for(int i=0;i<this.length;i++){
			System.out.print("-");
		}
		System.out.println(">");
	}
	void draw(){
		if(this.length<=0){
			System.out.println("もう描けません");
			return;
		}
		System.out.printf("%sで描いた%n",this.color);
		this.length--;
		totalDraw++;          //インスタンスからインスタンス、スタティックにはアクセス可
		this.showStatus();
	}
	//static int getTotalDraw(){
		// this.name とかthisは使えない　どこからもアクセスされる為
		// showStatus()　スタティックメソッドからインスタンスメソッドはさわれない
	//	return totalDraw;
	//}
	static void getTotalDraw(){
		System.out.printf("描いたtotalは%dです%n",totalDraw);
	}
}
