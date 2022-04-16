import java.util.*;
public class Cleric{
	String name;
	final int MAX_HP=50;
	int hp=MAX_HP;
	final int MAX_MP=10;
	int mp=MAX_MP;
	public void selfaid(){
		System.out.println(this.name+"はセルフエイドを唱えた");
		if(this.mp<5){
			System.out.println("MPが足りない");
			return;
		}
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復しました");
	}
	public int pray(int sec){
		System.out.println(this.name+"は"+sec+"秒間天に祈った");
		int rand = new Random().nextInt(3);
		int recover = sec + rand;
		recover = Math.min(recover,MAX_MP-this.mp);
		this.mp += recover;
		System.out.printf("MPが%d回復した%n",recover);
		return recover;
	}
}
