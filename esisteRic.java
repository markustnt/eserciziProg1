//esiste ricorsione 
public class provaa {
	public static void main (String[] args){
		int[] a = {1,3, 2, 6, 7, 3, 9};
		int v = 9;
		boolean ris = esiste(a,v);
		System.out.println(ris);
	}
	//wrapper
	public static boolean esiste (int[] a, int v){
		if(a!=null && a.length!=0){
			return esiste(a,v,a.length-1);
		}else{
			return false;
		}
	}
	public static boolean esiste (int[] a, int v, int i){
		if(i==-1){
			return false;
		}else{
			if(a[i]==v){
				return true;
			}else{
				return esiste(a,v,i-1);
			}
		}
	}
}
