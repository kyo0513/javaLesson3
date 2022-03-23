import java.util.*;
public class Gacha{
	public static void main(String[] args){
		/*
      SSR 5%
			SR 10%
			R  20%
			N  65%
			 * */
System.out.println("エンターキーを教えてね");
  new Scanner(System.in).nextLine();
	int seed = '長' + '須' + '勝' + '之';
//  int n = new Random().nextInt(100);
  int n = new Random(seed).nextInt(100);
	if (n < 5){
		System.out.println("SSR!");
	}else if(n < 15){
		System.out.println("SR!");
	}else if(n < 35){
		System.out.println("R!");
	}else{
		System.out.println("N!");
	}
	}
}
