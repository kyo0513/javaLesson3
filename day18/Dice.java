import java.util.*;
public class Dice{
	public static void main(String[] args){
		System.out.print("何人>>");
		int personnum = new Scanner(System.in).nextInt();
		char[] players=createAlphArr('A',personnum);
		int[] sums = new int[playrs.length];
		System.out.print("何回ふる>>");
		int  count = new Scanner(System.in).nextInt();
		for(int i=0;i<players.length;i++){
			int[] diceArr=createDiceArr(count);
			sums[i]=arrSum(diceArr);
		  System.out.printf("%sさん:%s合計:%d%n",players[i],Arrays.toString(diceArr),sum[i]);
		}
		if(isSame(sums)){
			System.out.println("引き分け");
			return;
		}
		int maxnum=maxnum(sums);
		String str="";
		for(int i=0;i<sums.length;i++){
			if(sums[i]==maxnum){
				str+=players[i]+"さん,";
			}
		}
		str=str.substring(0,str.length()-1);
		System.out.println(str+"の勝ち");
	}
	static int[] creatediceArr(int count){
		int[] diceArr = new int[count];
		for(int i=0;i<diceArr.length;i++){
			diceArr[i]=new Random().nextInt(6)+1;
		}
		return diceArr;
	}
	static int arrSum(int[] nums){
		int sum=0;
		for(int n:nums){
			sum += n;
		}
		return sum;
	}
	static char[] createAlphArr(char first,int num){
		char[] alphArr=new char[num];
		for(int i=0;i<alphArr.length;i++){
			alphArr[i] = (char)(first+i);  // Zのあとは記号が出る
		}
		return alphArr;
	}
	static boolean isSame(int[] nums){
		int first=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i] !=first) return false;
		}
		return true;
	}
	static int maxNum(int[] nums){
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(max < nums[i]){
				max = nums[i];
			}
		}
		return max;
	}
}
