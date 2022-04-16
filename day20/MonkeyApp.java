import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		System.out.print("おさるの名前を決めてください>>");
		String name = new Scanner(System.in).nextLine();
		System.out.print("おさるの歳を決めてください>>");
		int age = new Scanner(System.in).nextInt();

		Monkey monkey1 = new Monkey();
		monkey1.name = name;
		monkey1.age = age;
		while(true){
			System.out.print("おさるに何させますか？1:挨拶2:竹馬3:逆立ち:4終了>");
			int act = new Scanner(System.in).nextInt();
			switch(act){
				case 1:
					monkey1.hello();
					break;
				case 2:
					monkey1.stilts();
					break;
				case 3:
					monkey1.handstand();
					break;
				case 4:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
