import java.util.*;
public class Method3{
	public static void main(String[] args){
		System.out.print("縦>>");
		double Heigth = new Scanner(System.in).nextDouble();
		System.out.print("横>>");
		double Width = new Scanner(System.in).nextDouble();
		double Area = calcrectangle(Heigth,Width);
		System.out.printf("長方形の面積は%.1fです",Area);
	}
	public static double calcrectangle(double heigth,double width){
		double area = heigth * width;
		return area;
	}
}
