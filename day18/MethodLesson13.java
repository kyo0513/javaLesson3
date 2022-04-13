import java.util.*;
public class MethodLesson13{
	public static void main(String[] args){
		int[] arr1={1,2,3};
		int[] arr2={4,5,6,7};
		int[] arr3=arrMerge(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}
	public static int[] arrMerge(int[] arr1,int[] arr2){
		int[] retArr=new int[arr1.length + arr2.length];
		for(int i=0;i<retArr.length;i++){
			if(i<arr1.length){
				retArr[i]=arr1[i];
			}else{
				retArr[i]=arr2[i-arr1.length];
			}
		}
		return retArr;
	}
}
