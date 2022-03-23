import java.util.*;
public class MarryApp{
	public static void main(String[] args){
		/*
		 *  女性１６　男性１８
		 *  32歳で女性のあなたは結婚できます
		 *  17歳で男性のあなたは結婚できません
		 *  DRY(Don't Repeat Your self)
		 */
		System.out.print("性別(男性,女性)>>");
		String gender = new Scanner(System.in).next();
		System.out.print("年齢>>");
		int age = new Scanner(System.in).nextInt();
		boolean ok;

    // if(gender.equals("男性")){
    /*if(gender.contains("男")){
			if(age >= 18){
				ok = true;
			}else{
				ok = false;
			}
		}else
			if(age >= 16){
				ok = true;
			}else{
				ok = false;
			}

		if(ok){
			System.out.println(age + "歳で" + gender + "のあなたは結婚できます");
		}else{
			System.out.println(age + "歳で" + gender + "のあなたは結婚できません");
		}	
		*/
		if((gender.contains("女")&& age >= 16) ||
			(gender.contains("男")&& age >= 18)){
			System.out.println(age + "歳で" + gender + "のあなたは結婚できます");
		}else{
			System.out.println(age + "歳で" + gender + 
					"のあなたは結婚できません");
		}
	}
}
