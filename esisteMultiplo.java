//esisteMultiplo
public class provaa {
	public static void main (String[] args){
		int[] a = {1, 3, 4, 18, 5, 9, 7};
		int m = 2;
		boolean ris = esisteMultiplo(a, m);
		System.out.println(ris);
	}
	//wrapper esisteMultiplo
	public static boolean esisteMultiplo(int[] a, int m){
		if(a!=null && a.length!=0){
			return esisteMultiplo(a, m, 0);
		}else{
			return false;
		}
	}
	public static boolean esisteMultiplo (int[] a, int m, int i){
		if(i==a.length){
			return false;
		}else{
			if(a[i]%m==0){
				return true;
			}else{
				return esisteMultiplo(a, m, i+1);
			}
		}
	}
	
}
