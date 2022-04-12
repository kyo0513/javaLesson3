import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.print("あなたの貯金額は>>");
		long savings = new Scanner(System.in).nextLong();
		//int savings = new Scanner(System.in).nextInt();
		savings *= 1000;
		System.out.printf("いいえ、あなたの貯金額は[%,d円]です%n",savings);
		//String savings_st = Integer.toString(savings/1000);
		String savings_st = Long.toString(savings/1000);
		//System.out.println(savings_st);
		//System.out.println(savings_st.length());
		char thousand = savings_st.charAt(savings_st.length() - 1); 
		System.out.printf("言い換えるなら[%d万%s千円]です%n",
				savings/10000,thousand);
		int num = new Random().nextInt(3);
		msgmethod(num);
	}
	static void msgmethod(int n){
		String[] msgbox = 
			new String[]{"なお、マイクロソフト創業者ビルゲイツの~",
				           "なお、金融庁の試算にて、老後20~30年で~",
									 "それ以上の金額を稼ぐ方法が~",
			            };
		System.out.println(msgbox[n]);
		/*
		switch(n){
			case 1:
				System.out.println("なお、マイクロソフト創業者ビルゲイツの~");
				break;
			case 2:
				System.out.println("なお、金融庁の試算にて、老後20~30年で~");
				break;
			case 3:
				System.out.println("それ以上の金額を稼ぐ方法が~");
				break;
		}
		*/
	}
}
