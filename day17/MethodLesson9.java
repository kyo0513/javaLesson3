import java.util.*;
public class MethodLesson9{
	static double calcBMI(double weightKg,double heightCm){
		return weightKg/((heightCm/100)*(heightCm/100));
	}
	public static void main(String[] args){
		System.out.print("体重を入力してください");
		double Weightkg = new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください");
		double Heightcm = new Scanner(System.in).nextDouble();
		double BMI= calcBMI(Weightkg,Heightcm);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです",
				Weightkg,Heightcm,BMI);

	}
}
