import java.util.*;
import java.io.*;
public class Meibo{
	public static void main(String[] args)throws Exception{
		ArrayList<Person> list=new ArrayList<>();

		FileInputStream fis =
			new FileInputStream("dummy.csv");
		InputStreamReader isr =
			new InputStreamReader(fis,"SJIS");
		BufferedReader br =
			new BufferedReader(isr);

		String labels =br.readLine();
		String line;
		while((line=br.readLine())!=null){
			//if(line.startwith("名前")){
			//	continue;
			//}
			String[] params=line.split(",");
			Person p = new Person(params[0],params[1],
					Integer.parseInt(params[2]));
			list.add(p);
		}
		br.close();
		System.out.println(labels);
		showList(list);
		System.out.println("年齢降順で表示");
		sortList(list);
		showList(list);
	}
	static void showList(ArrayList<Person> list){
		for(Person p:list){
			p.showInfo();
		}
	}
	static void sortList(ArrayList<Person> list){
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).age < list.get(j).age){
					Person temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
	}
}
class Person{
	String name;
	String email;
	int age;
	Person(String name,String email,int age){
		this.name=name;
		this.email=email;
		this.age=age;
	}
	void showInfo(){
		System.out.printf("%s[%s](%d)%n",this.name,this.email,this.age);
	}
}
