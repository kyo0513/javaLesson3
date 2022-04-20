import java.util.*;
public class ListLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		names.add("Jonh");
		names.add("Paul");
		names.add("George");
		names.add("Ringo");
		names.add("Ringo");

		System.out.println(names.size()); //4
		System.out.println(names.get(0)); //John
		names.remove(0); //Johnが削除される //サイズは3へ
		System.out.println(names); //一覧

		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(10); // オートで指定した型でいれてくれる
		nums.add(20);
		nums.add(30);
		nums.add(40); 

		for(int i=0;i<nums.size();i++){
			System.out.println(nums.get(i));
		}

		for(int n:nums){
			System.out.println(n);
		}
		nums.add(0,100); //先頭（０）に１００を挿入
		nums.set(0,1000); //先頭（０）を１０００に置きかえ
		if(nums.isEmpty()){
		}
		if(nums.contains(1000)){
			System.out.println("含みます");
		}
		System.out.println(nums.indexOf(10));
		nums.remove(0);
		System.out.println(names);
		names.remove("Ringo");  //ふたつあっても１個だけ消えた
		System.out.println(names);
		nums.clear(); //要素数がなくなる

	}
}
