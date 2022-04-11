import java.util.*;
public class Method4{
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>>");
		String years = new Scanner(System.in).nextLine();
		String[] inputs = years.split(",");
		daysOfmanth(inputs);

	}
	public static void daysOfmanth(String[] years){
		System.out.printf("%d年%d月の日数は",years[0],years[1]);
		int yyyy = Integer.parseInt(years[0]);
		int mm = Integer.parseInt(years[1]);
		int day=31;
		if(mm == 2){
			if(yyyy%400 ==0 ||yyyy%100 !=0 && yyyy%4 ==0){
				day = 29;
			}else{
				day = 28;
			}
		}else if(mm == 4 ||mm == 6||mm == 9){
			day = 30;
		}
		System.out.println(day +"です");
	}
}
