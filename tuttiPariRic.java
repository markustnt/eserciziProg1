//tuttiPariRic 
public class provaa {
	public static void main (String[] args){
		int[] a = {4, 8, 10, 22};
		boolean ris = tuttiPari(a);
		System.out.println(ris);
	}
	//wrapper tuttiPari
	public static boolean tuttiPari (int[] a){
		if(a!=null && a.length!=0){
			return tuttiPari(a, 0);
		}else {
			return false;
		}
	}
	//metodo tuttiPari
	public static boolean tuttiPari(int[] a, int i){
		if(i==-1){
			return true;
		}else{
			if(a[i]%2==0){
				return tuttiPari(a,i+1);
			}else{
				return false;
			}
		}
	}
}
