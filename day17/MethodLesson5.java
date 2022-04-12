public class MethodLesson5{
	static void printLine(int width){
		for(int i=0;i<width;i++){
			System.out.print("*");
		}
		System.out.println();
	}
	static void midasiMaker(int width,String title){
		printLine(width);
		System.out.println("*"+title);
		printLine(width);
	}
	static void midasiMaker(String title){
		printLine(title.length()+2);
		System.out.println("*"+title+"*");
		printLine(title.length()+2);
	}
	public static void main(String[] args){
		//midasiMaker(20,"すごい!!");
		//System.out.println("すごいことがありました");
		//midasiMaker(30,"大事件が発生しました!!");
		//System.out.println("大変なことがおこりました");
		midasiMaker("Hello");
		midasiMaker("I loveyou");
	}
}
