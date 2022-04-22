import java.util.*;
public class AssetApp{
	public static void main(String[] args){
		Book book = new Book("java入門",2800,"白","a123");
		Book.setWeight(1500.0);
		System.out.printf("%s%n%d%n%s%n%s%n%.1f%n",
				book.getName(),book.getPrice(),bookgetColor(),book.getIsbn(),
				book.getWeight());
	}
}
abstract class Asset{
	String name;
	int price;
	public Asset(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
}
interface Thing{
	void getWeight();
	void setWeight(double weight);
}

abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;
	public TangibleAsset(String name,int price,String color){
		super(name,price);
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	@Override
	public double getWeigth(){
		return this.weight;
	}
	@Override
	public void setWeigth(double weight){
		this.weight=weight;
	}
}
class Book extends TangibleAsset{
	String isbn;
	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public String getIsbn(){
		return isbn;
	}
}
class Computer extends TangibleAsset{
	String makerName;
	public Computer(String name,int price,String color,String makerName){
		super(name,price,color);
		this.makerName=makerName;
	}
	public String getMakername(){
		return makerName;
	}
}
