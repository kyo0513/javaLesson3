public class RPGApp{
	public static void main(String[] args){
		Hero hero1 = new Hero();     //メモリにヒーローフィールドが作られる
		hero1.name = "ジェシカ";
		hero1.hp =100;
		System.out.println("HP"+hero1.hp);
		hero1.slip();
		hero1.slip();
		hero1.sit(3);
		System.out.println("HP"+hero1.hp);
		hero1.sleep();
		//hero1.run();
		//hero1=null;  //キャラデリート

		Hero hero2 = new Hero();
		hero2.name = "ククール";
		hero2.hp =120;
		hero2.slip();
		hero2.slip();
		hero2.slip();
		hero2.sit(5);
		hero1.run();
		//hero2.run();

		Matango m1 = new Matango();
		m1.suffix='A';
		Matango m2 = new Matango();
		m2.suffix='B';
		m1.run();
		m2.run();
		Cleric cleric = new Cleric();
		cleric.name="クリフト";
		cleric.selfaid();
		int recover = cleric.pray(3);

		hero1.run();
		hero2.run();
	}
}
