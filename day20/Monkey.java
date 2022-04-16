import java.util.*;
public class Monkey{
	String name;
	int age;
	public void hello(){
		System.out.printf("こんにちは%s(%d)です。よろしく！%n",
				this.name,this.age);
	}
	public void stilts(){
		System.out.println(this.name+"は上手に竹馬にのった");
	}
	public void handstand(){
		System.out.println(this.name+"はひょいと逆立ちした");
	}
}
