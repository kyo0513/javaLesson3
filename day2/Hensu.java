public class Hensu{
	public static void main(String[] args){
		//変数宣言（INTEGER:整数)
		int money;
		money=100;
		System.out.println("所持金：" + money);
		System.out.println("５０円拾った");
		money=money + 50 ;
		System.out.println("所持金：" + money);
		System.out.println("１０００円お小遣いを貰った");
		money=money + 1000 ;
		System.out.println("所持金：" + money);
		System.out.println("５００円の牛丼を食べたよ");
		money=money - 500 ;
		System.out.println("所持金：" + money);
	}
}
