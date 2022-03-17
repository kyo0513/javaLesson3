import java.util.*:
public class Code2_14{
	public static void main(String[] args){
//  int r = new java.util.Random().nextInt(90);//0~89の90個
    int r = new Random().nextInt(90);//0~89の90個
		//nextInt(6)+5 5~10の乱数の場合
		//nextInt(大きい数 -　小さい数 +1)+ 小さい数
		System.out.println("あなたは多分、" + r + "歳ですね？");
	}
}
