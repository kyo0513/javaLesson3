import java.util.*;
public class ColorPencilApp{
	public static void main(String[] args){
		//System.out.println("total"+ColorPencil.totalDraw);
		//System.out.println("total"+ColorPencil.getTotalDraw());
		//ColorPencil cp1=new ColorPencil("赤");
		//ColorPencil cp2=new ColorPencil("青",8);
		//for(int i=0;i<6;i++){
		//	cp1.draw();
		//}
		//cp2.draw();
		//System.out.println("total"+ColorPencil.totalDraw);
		//
		//ColorPencil("赤",3)
		Scanner scan = new Scanner(System.in);
		System.out.print("何本>>");
		int num = scan.nextInt();
		ColorPencil[] pencils = new ColorPencil[num];

		for(int i=0;i<num;i++){         //色鉛筆情報格納
			System.out.print("色>>");
			String color = scan.next();
			System.out.print("長さ>>");
			int length = scan.nextInt();
			pencils[i] = new ColorPencil(color,length); 
		}
		while(true){                    //番号を選んでアクション
			info(pencils);
			System.out.print("何で描く>>");
			int act = scan.nextInt();
			if(act<pencils.length){
				pencils[act].draw();
			}else if(act == pencils.length){
				ColorPencil.getTotalDraw();
			}else if(act == pencils.length+1){
				System.out.println("終了");
				return;
			}else{
				System.out.println("入力エラー");
			}
		}
	}
	public static void info(ColorPencil[] arr){  //インフォメーション表示
		for(int i=0;i<arr.length+2;i++){
			if(i<arr.length){
				System.out.printf("%2d.%s%n",i,arr[i].color);
			}else if(i==arr.length){
				System.out.printf("%2d.描いた長さのtotalを見る%n",i);
			}else{
				System.out.printf("%2d.終了%n",i);
			}
		}
	}
}
