package divisorapp.logics; 
public class DivisorLogic{
	public static int[] creatDivisorArr(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n % i==0){
				count++;
			}
		}
		int[] retArr = new int[count];
		int idx=0;
		for(int i=1;i<=n;i++){
			if(n% i==0){
				retArr[idx]=i;
				idx++;
			}
		}
		return retArr;
	}
}
