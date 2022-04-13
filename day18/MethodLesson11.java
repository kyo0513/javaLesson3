import java.util.*;
public class MethodLesson11{
	public static void main(String[] args){
		int[] arr =new int[]{1,2,3,4,5};
		arrReverse(arr);
		System.out.print(Arrays.toString(arr));
	}
	static void arrReverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
}
