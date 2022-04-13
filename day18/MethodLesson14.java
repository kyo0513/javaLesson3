import java.util.*;
public class MethodLesson14{
	public static void main(String[] args){
		int[] arr = makerArrFirstToLast(4,-2);
		System.out.println(Arrays.toString(arr));
	}
	static int[] makerArrFirstToLast(int first,int last){
		int[] retArr = new int[Math.abs(first-last)+1];
		for(int i=0;i<retArr.length;i++){
			retArr[i]=first;
			/*
			if(first<last){
				first++;
			}else{
				first--;
			}
			*/
			retArr[i]=first<last ? first++:first--;
		}
		return retArr;
	}
}
